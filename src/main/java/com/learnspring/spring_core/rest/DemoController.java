package com.learnspring.spring_core.rest;

import com.learnspring.spring_core.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
        myCoach = theCoach;
        System.out.println("This Class " + this.getClass().getName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
