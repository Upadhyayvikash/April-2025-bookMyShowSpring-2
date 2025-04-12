package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="users")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id; // Base64 -> that got generated on the basis of time
    String name;
    @Column(unique = true)
    String email;
    String password;
    @Column(unique = true)
    Long phoneNumber;
    String address;
    int pinCode;
    String state;
    String userType;
}
