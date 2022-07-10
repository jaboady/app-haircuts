package com.apphaircuts.mfcp.reboot.authentication.service.impl;

import com.apphaircuts.mfcp.reboot.authentication.dto.IdentificationDTO;
import com.apphaircuts.mfcp.reboot.authentication.exception.IdentificationNotFoundException;
import com.apphaircuts.mfcp.reboot.authentication.model.Identification;
import com.apphaircuts.mfcp.reboot.authentication.repository.AuthenticationRepository;
import com.apphaircuts.mfcp.reboot.authentication.service.AuthenticationService;
import com.apphaircuts.mfcp.reboot.authentication.service.converter.AuthenticationConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationRepository authenticationRepository;

    private final AuthenticationConverter authenticationConverter;

    @Autowired
    public AuthenticationServiceImpl(AuthenticationRepository authenticationRepository, AuthenticationConverter authenticationConverter) {
        this.authenticationConverter = authenticationConverter;
        this.authenticationRepository = authenticationRepository;
    }

    @Override
    public IdentificationDTO getIdentificationByUsernameAndPassword(String username, String password) {

        if (username == null) {
            return null;
        }

        if (password == null) {
            return null;
        }

        Identification identification = authenticationRepository.getIdentificationByUsernameAndPassword(username, password);

        IdentificationDTO identificationDTO;

        if (identification != null) {

            identificationDTO = authenticationConverter.toDTO(identification);
        } else {
            throw new IdentificationNotFoundException("Authentication failed.");
        }

        return identificationDTO;
    }
}
