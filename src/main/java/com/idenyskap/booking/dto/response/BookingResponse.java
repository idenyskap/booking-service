package com.idenyskap.booking.dto.response;

import com.idenyskap.booking.entity.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BookingResponse (
        Long id,
        Long userId,
        Long roomId,
        String roomNumber,
        LocalDate checkInDate,
        LocalDate checkOutDate,
        BookingStatus status,
        BigDecimal totalPrice,
        LocalDateTime createdAt
) {
}
