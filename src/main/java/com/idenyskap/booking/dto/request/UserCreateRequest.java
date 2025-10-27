package com.idenyskap.booking.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserCreateRequest(
        @NotBlank @Email String email,

        @NotBlank
        @Size(min = 8, max = 100)
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$",
                message = "Password must contain at least one uppercase, lowercase and digit")
        String password,

        @NotBlank String name,

        @Pattern(regexp = "^\\+?\\d{10,15}$", message = "Invalid phone format")
        String phone
) {
}




