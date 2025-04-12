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
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    Double duration; // it will be in hours
    boolean isReleased;
    @ManyToOne
    AppUser movieOwner;
    int review;
    int totalReviewVotes;
    String language;
}
