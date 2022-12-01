package com.denis4ik23.spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    private Music music;

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
