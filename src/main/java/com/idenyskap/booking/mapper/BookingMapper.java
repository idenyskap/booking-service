package com.idenyskap.booking.mapper;

import com.idenyskap.booking.dto.request.BookingCreateRequest;
import com.idenyskap.booking.dto.request.BookingUpdateRequest;
import com.idenyskap.booking.dto.response.BookingDetailResponse;
import com.idenyskap.booking.dto.response.BookingResponse;
import com.idenyskap.booking.entity.Booking;
import com.idenyskap.booking.entity.BookingStatus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookingMapper {

    private final UserMapper userMapper;
    private final RoomMapper roomMapper;

    public BookingResponse toResponse(Booking booking) {
        if (booking == null) {
            return null;
        }

        return new BookingResponse(
                booking.getId(),
                booking.getUser().getId(),
                booking.getRoom().getId(),
                booking.getRoom().getNumber(),
                booking.getCheckInDate(),
                booking.getCheckOutDate(),
                booking.getStatus(),
                booking.getTotalPrice(),
                booking.getCreatedAt()
        );
    }

    public BookingDetailResponse toDetailResponse(Booking booking) {
        if (booking == null) {
            return null;
        }

        return new BookingDetailResponse(
                booking.getId(),
                userMapper.toResponse(booking.getUser()),
                roomMapper.toResponse(booking.getRoom()),
                booking.getCheckInDate(),
                booking.getCheckOutDate(),
                booking.getStatus(),
                booking.getTotalPrice(),
                booking.getNotes(),
                booking.getCreatedAt()
        );
    }

    public Booking toEntity(BookingCreateRequest request) {
        if (request == null) {
            return null;
        }

        Booking booking = new Booking();
        booking.setCheckInDate(request.checkInDate());
        booking.setCheckOutDate(request.checkOutDate());
        booking.setNotes(request.notes());
        booking.setStatus(BookingStatus.PENDING);
        return booking;
    }

    public void updateEntity(Booking booking, BookingUpdateRequest request) {
        if (request.status() != null) {
            booking.setStatus(request.status());
        }

        if (request.notes() != null) {
            booking.setNotes(request.notes());
        }
    }
}

