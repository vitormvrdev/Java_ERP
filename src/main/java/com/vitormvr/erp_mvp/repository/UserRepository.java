package com.vitormvr.erp_mvp.repository;

import com.vitormvr.erp_mvp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}