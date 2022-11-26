package com.waa.lab4.Repository;

import com.waa.lab4.Domain.ApplicationLogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationLoggerRepository extends JpaRepository<ApplicationLogger,Long> {
}
