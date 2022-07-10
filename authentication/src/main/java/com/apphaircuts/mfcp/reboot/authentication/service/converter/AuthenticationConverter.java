package com.apphaircuts.mfcp.reboot.authentication.service.converter;

import com.apphaircuts.mfcp.reboot.authentication.dto.IdentificationDTO;
import com.apphaircuts.mfcp.reboot.authentication.model.Identification;

public interface AuthenticationConverter {

    public IdentificationDTO toDTO(Identification identification);
    public Identification toModel(IdentificationDTO identificationDTO);
}
