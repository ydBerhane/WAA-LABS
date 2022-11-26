package com.waa.lab4.Service;

import com.waa.lab4.Domain.ApplicationLogger;
import com.waa.lab4.Repository.ApplicationLoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationLoggerServiceimpl implements ApplicationLoggerService{
    @Autowired
    private ApplicationLoggerRepository applicationLoggerRepository;


    @Override
    public void saveApplicationLog(ApplicationLogger applicationLogger) {
        applicationLoggerRepository.save(applicationLogger);
    }
}
