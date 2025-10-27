package com.idenyskap.booking.mapper;

import com.idenyskap.booking.dto.request.RoomCreateRequest;
import com.idenyskap.booking.dto.request.RoomUpdateRequest;
import com.idenyskap.booking.dto.response.RoomResponse;
import com.idenyskap.booking.entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public RoomResponse toResponse(Room room) {
        if (room == null) {
            return null;
        }

        return new RoomResponse(
                room.getId(),
                room.getNumber(),
                room.getCapacity(),
                room.getPricePerNight(),
                room.getDescription(),
                room.getAvailable(),
                room.getCreatedAt()
        );
    }

    public Room toEntity(RoomCreateRequest request) {
        if (request == null) {
            return null;
        }

        Room room = new Room();
        room.setNumber(request.number());
        room.setCapacity(request.capacity());
        room.setPricePerNight(request.pricePerNight());
        room.setDescription(request.description());
        room.setAvailable(true);
        return room;
    }

    public void updateEntity(Room room, RoomUpdateRequest request) {
        if (request.pricePerNight() != null) {
            room.setPricePerNight(request.pricePerNight());
        }

        if (request.description() != null) {
            room.setDescription(request.description());
        }

        if (request.available() != null) {
            room.setAvailable(request.available());
        }

    }
}
