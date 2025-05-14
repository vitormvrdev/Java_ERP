package com.vitormvr.erp_mvp.domain;

import java.time.LocalDate;

import org.springframework.security.access.method.P;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

public class Holiday {
    @Id @GeneratedValue
    private Long id;
    private LocalDate date;
    private String description;
    private boolean national;

    public Holiday() {}

    public Holiday(LocalDate date, String description, boolean national) {
        this.date = date;
        this.description = description;
        this.national = national;
    }
}
 