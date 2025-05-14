package com.vitormvr.erp_mvp.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class TimeEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate date;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public TimeEntry() {}

    public TimeEntry(User user, LocalDate date, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.user = user;
        this.date = date;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Getters and setters omitted for brevity
}