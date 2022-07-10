package com.apphaircuts.mfcp.reboot.authentication.service;

import com.apphaircuts.mfcp.reboot.authentication.dto.IdentificationDTO;

public interface AuthenticationService {

    public IdentificationDTO getIdentificationByUsernameAndPassword(String username, String password);

}
