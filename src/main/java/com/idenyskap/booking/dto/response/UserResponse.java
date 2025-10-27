package com.idenyskap.booking.dto.response;

import java.time.LocalDateTime;

public record UserResponse (

    Long id,
    String email,
    String name,
    String phone,
    LocalDateTime createdAt
) {}
