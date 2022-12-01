package com.denis4ik23.spring_course;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
