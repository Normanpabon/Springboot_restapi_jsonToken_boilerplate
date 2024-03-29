package com.boilerplate.APIRest.Auth.authResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthResponseErr extends AuthResponse {
    ErrorData error;

}
