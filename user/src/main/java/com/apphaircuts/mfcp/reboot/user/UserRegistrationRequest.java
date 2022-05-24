package com.apphaircuts.mfcp.reboot.user;

public record UserRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
