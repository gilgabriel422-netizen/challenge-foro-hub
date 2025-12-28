package com.tuusuario.challenge.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record DatosRegistroProducto(
    @NotBlank String nombre,
    @NotBlank String descripcion,
    @NotNull @DecimalMin("1.00") BigDecimal precio
) {}
