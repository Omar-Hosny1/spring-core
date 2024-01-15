package com.learnspring.spring_core.rest;

import com.learnspring.spring_core.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    // Here Spring will look into the app for a class that uses the Coach interface (Spring Bean that annotated by
    // @Component and will inject it to this demo controller to use it when reaching the /dailyworkout EP.

    // I think we will only dealing with the interfaces and spring will deal with the DI
    // of the classes that uses these interfaces
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
