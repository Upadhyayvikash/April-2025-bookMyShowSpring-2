package com.bms.dbapi.repository;

import com.bms.dbapi.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
    // This method checks if a user with the given email already exists
    Optional<AppUser> findByEmail(String email);
}
