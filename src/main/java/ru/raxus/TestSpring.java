package ru.raxus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);//указывается id из application context и объект класса, который хотим получить

        //указывается id из application context и класс, объект которого хотим получить
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean b = firstMusicPlayer == secondMusicPlayer;
        System.out.println(b);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println("Первый проигрыватель: " + firstMusicPlayer.getVolume());
        System.out.println("Второй проигрыватель: " + secondMusicPlayer.getVolume());
        firstMusicPlayer.setVolume(10);
        System.out.println("Первый проигрыватель: " + firstMusicPlayer.getVolume());
        System.out.println("Второй проигрыватель: " + secondMusicPlayer.getVolume());
        //musicPlayer.playMusicList();
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
