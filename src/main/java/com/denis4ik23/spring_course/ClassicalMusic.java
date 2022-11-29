package com.denis4ik23.spring_course;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
