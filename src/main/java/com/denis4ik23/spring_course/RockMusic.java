package com.denis4ik23.spring_course;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Рок музыка";
    }
}
