package com.idenyskap.booking.dto.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record BookingCreateRequest(

        @NotNull Long roomId,

        @NotNull
        @Future(message = "Check-in date must be in the future")
        LocalDate checkInDate,

        @NotNull
        @Future(message = "Check-out date must be in the future")
        LocalDate checkOutDate,

        String notes


) {

    public BookingCreateRequest {
        if (checkInDate != null && checkOutDate != null) {
            if (checkOutDate.isAfter(checkInDate)) {
                throw new IllegalArgumentException("Check-out date must be after check-in date");
            }
        }
    }
}
