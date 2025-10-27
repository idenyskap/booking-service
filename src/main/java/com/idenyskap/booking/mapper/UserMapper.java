package com.idenyskap.booking.mapper;

import com.idenyskap.booking.dto.request.UserCreateRequest;
import com.idenyskap.booking.dto.request.UserUpdateRequest;
import com.idenyskap.booking.dto.response.UserResponse;
import com.idenyskap.booking.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toResponse(User user) {
        if (user == null) {
            return null;
        }

        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getPhone(),
                user.getCreatedAt()
        );
    }

    public User toEntity(UserCreateRequest request) {
        if (request == null) {
            return null;
        }

        User user = new User();
        user.setEmail(request.email());
        user.setName(request.name());
        user.setPhone(request.phone());
        return user;
    }

    public void updateEntity(User user, UserUpdateRequest request) {
        if (request.name() != null) {
            user.setName(request.name());
        }

        if (request.phone() != null) {
            user.setPhone(request.phone());
        }
    }
}
