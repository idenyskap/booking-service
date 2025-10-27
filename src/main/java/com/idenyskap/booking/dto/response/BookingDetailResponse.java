package com.idenyskap.booking.dto.response;

import com.idenyskap.booking.entity.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BookingDetailResponse(
        Long id,
        UserResponse user,
        RoomResponse room,
        LocalDate checkInDate,
        LocalDate checkOutDate,
        BookingStatus status,
        BigDecimal totalPrice,
        String notes,
        LocalDateTime createdAt
) {}