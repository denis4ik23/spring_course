package com.denis4ik23.spring_course;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//конфигурационный класс вместо xml-файла
@ComponentScan("com.denis4ik23.spring_course")//component-scan
@PropertySource("classpath:musicPlayer.properties")//property-placeholder
public class SpringConfig {
}
