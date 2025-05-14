package com.vitormvr.erp_mvp.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class VacationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // PENDING, APPROVED, REJECTED
    private LocalDateTime requestedAt;

    public VacationRequest() {}

    public VacationRequest(User user, LocalDate startDate, LocalDate endDate, String status, LocalDateTime requestedAt) {
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.requestedAt = requestedAt;
    }

    // Getters and setters omitted for brevity
}