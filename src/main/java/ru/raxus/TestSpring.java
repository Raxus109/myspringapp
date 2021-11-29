package ru.raxus;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        /*musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.POP);
        musicPlayer.playMusic(MusicGenre.RAP);*/

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        Computer computer = context.getBean("computer", Computer.class);

        context.close();
    }
}
