package com.vitormvr.erp_mvp.domain;

import jakarta.persistence.GeneratedValue;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.OneToMany;

public class Team {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<User> members;

    public Team() {}

    public Team(String name, List<User> members) {
        this.name = name;
        this.members = members;
    }
}
