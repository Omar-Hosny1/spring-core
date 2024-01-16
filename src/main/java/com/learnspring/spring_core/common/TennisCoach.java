package com.learnspring.spring_core.common;

import org.springframework.stereotype.Component;

@Component // by providing this annotation spring will account for this class to search for
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Keep Practicing From Tennis Coach";
    }
}
