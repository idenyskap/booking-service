package com.idenyskap.booking.dto.request;

import com.idenyskap.booking.entity.BookingStatus;

public record BookingUpdateRequest(
        BookingStatus status,
        String notes
) {
}
