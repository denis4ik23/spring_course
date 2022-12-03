package com.denis4ik23.spring_course;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    //java 9 deprecated, java 11 deleted.
    // И теперь для их использования надо добавлять javax.annotation-api зависимость(pom.xml).
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
