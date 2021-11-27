package ru.raxus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);//указывается id из application context и объект класса, который хотим получить

        //указывается id из application context и класс, объект которого хотим получить
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
