package com.denis4ik23.spring_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("rockMusic", Music.class);
//        Music music1 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//        musicPlayer.playMusic();
//        musicPlayer1.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();
    }
}
