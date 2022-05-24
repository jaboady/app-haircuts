package com.apphaircuts.mfcp.reboot.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void registerUser(UserRegistrationRequest userRegistrationRequest) {
        User user = User.builder()
                .firstName(userRegistrationRequest.firstName())
                .lastName(userRegistrationRequest.lastName())
                .email(userRegistrationRequest.email())
                .build();
    }
}
