package com.tuusuario.challenge.repository;

import com.tuusuario.challenge.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByPrecioGreaterThanEqualAndFechaRegistroAfter(BigDecimal precio, LocalDate fecha);
}
