package com.tuusuario.challenge.controller;

import com.tuusuario.challenge.dto.DatosRegistroProducto;
import com.tuusuario.challenge.model.Producto;
import com.tuusuario.challenge.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Producto> registrar(@RequestBody @Valid DatosRegistroProducto datos) {
        Producto producto = service.registrarProducto(datos);
        URI uri = URI.create("/productos/" + producto.getId());
        return ResponseEntity.created(uri).body(producto);
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listarProductos();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.listarProductos().removeIf(p -> p.getId().equals(id));
        return ResponseEntity.noContent().build();
    }
}
