package com.tuusuario.challenge.service;

import com.tuusuario.challenge.dto.DatosRegistroProducto;
import com.tuusuario.challenge.model.Producto;
import com.tuusuario.challenge.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public Producto registrarProducto(DatosRegistroProducto datos) {
        Producto producto = new Producto(datos.nombre(), datos.descripcion(), datos.precio());
        return repository.save(producto);
    }

    public List<Producto> listarProductos() {
        return repository.findAll();
    }
}
