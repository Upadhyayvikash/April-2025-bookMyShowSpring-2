package com.bms.dbapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID billId;
    @ManyToOne
    AppUser user;
    @ManyToOne
    Show show;
    int totalTickets;
    String seats; // 1-2-3-4-5-6-7-8
    int totalAmount;
    LocalDateTime startTime;
    LocalDateTime endTime;
}
