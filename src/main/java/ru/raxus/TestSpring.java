package ru.raxus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Music music = context.getBean("classicalMusic", Music.class);//указывается id из application context и объект класса, который хотим получить
        //указывается id из application context и класс, объект которого хотим получить
        System.out.println(music.getSong());
        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
        musicPlayer.playMusic();*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusicList();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
