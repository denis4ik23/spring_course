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

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
          System.out.println(musicPlayer.getName());
          System.out.println(musicPlayer.getVolume());

          ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
          ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
          System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
