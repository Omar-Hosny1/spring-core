package com.learnspring.spring_core.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "KEEP PRACTICING";
    }
}
