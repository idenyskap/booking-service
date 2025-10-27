package com.idenyskap.booking.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public record RoomUpdateRequest(
        @DecimalMin("0.01") BigDecimal pricePerNight,
        String description,
        Boolean available
) {
}
