package com.denis4ik23.spring_course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
