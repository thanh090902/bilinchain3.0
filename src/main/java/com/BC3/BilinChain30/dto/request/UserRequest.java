package com.BC3.BilinChain30.dto.request;

import lombok.Builder;

@Builder
public record UserRequest(
        String email,
        String username,
        String first_name,
        String last_name,
        String password_hash) {
}