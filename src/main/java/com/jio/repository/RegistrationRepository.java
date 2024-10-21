package com.jio.repository;

import com.jio.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

}
