package com.learnspring.spring_core.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Keep Practicing From Football Coach";
    }

    @PostConstruct
    public void init() {
        System.out.println("CONNECTING TO THE DB....");
    }

    @PreDestroy
    public void dispose() {
        System.out.println("DISCONNECTING TO THE DB....");

    }

}
