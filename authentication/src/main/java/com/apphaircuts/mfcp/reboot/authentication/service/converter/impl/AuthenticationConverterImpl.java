package com.apphaircuts.mfcp.reboot.authentication.service.converter.impl;

import com.apphaircuts.mfcp.reboot.authentication.dto.IdentificationDTO;
import com.apphaircuts.mfcp.reboot.authentication.model.Identification;
import com.apphaircuts.mfcp.reboot.authentication.service.converter.AuthenticationConverter;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationConverterImpl implements AuthenticationConverter {

    public IdentificationDTO toDTO(Identification identification) {

        IdentificationDTO identificationDTO = null;

        if (identification != null)  {

          identificationDTO = new IdentificationDTO();
          identificationDTO.setPassword(identification.getPassword());
          identificationDTO.setUsername(identification.getUsername());
        }
        return identificationDTO;
    }

    public Identification toModel(IdentificationDTO identificationDTO) {

        Identification identification = null;

        if (identificationDTO != null)  {

            identification = new Identification();
            identification.setPassword(identificationDTO.getPassword());
            identification.setUsername(identificationDTO.getUsername());
        }
        return identification;
    }
}
