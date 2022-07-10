package com.apphaircuts.mfcp.reboot.authentication.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IdentificationDTO implements Serializable {

        private String username;
        private String password;
}
