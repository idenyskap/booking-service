package com.idenyskap.booking.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record RoomResponse(

        Long id,
        String number,
        Integer capacity,
        BigDecimal pricePerNight,
        String description,
        Boolean available,
        LocalDateTime createdAt
) {
}
