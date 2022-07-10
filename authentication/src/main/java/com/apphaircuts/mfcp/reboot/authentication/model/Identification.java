package com.apphaircuts.mfcp.reboot.authentication.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Identification implements Serializable {

    @NonNull
    @Id
    private String id;
    private String username;
    private String password;
}
