package com.apphaircuts.mfcp.reboot.authentication.repository;

import com.apphaircuts.mfcp.reboot.authentication.model.Identification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<Identification, String> {

    public Identification getIdentificationByUsernameAndPassword(String username, String password);
}
