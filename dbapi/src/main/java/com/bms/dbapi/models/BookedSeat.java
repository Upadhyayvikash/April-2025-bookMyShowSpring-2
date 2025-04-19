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
@Table(name="bookedSeats")
public class BookedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    UUID show;
    int seatNumber;
}
