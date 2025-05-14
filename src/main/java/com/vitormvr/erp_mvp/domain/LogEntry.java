package com.vitormvr.erp_mvp.domain;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;

public class LogEntry {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime timestamp;
    private String action;
    private String entity; // "VacationRequest", "User", etc.
    private String details;

    public LogEntry() {}

    public LogEntry(LocalDateTime timestamp, String action, String entity, String details) {
        this.timestamp = timestamp;
        this.action = action;
        this.entity = entity;
        this.details = details;
    }
}
