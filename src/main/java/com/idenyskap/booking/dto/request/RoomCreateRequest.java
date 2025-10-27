package com.idenyskap.booking.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record RoomCreateRequest(
        @NotBlank String number,
        @NotNull @Min(1) Integer capacity,
        @NotNull @DecimalMin("0.01") BigDecimal pricePerNight,
        String description
) {}
