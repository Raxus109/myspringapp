package ru.raxus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    //Инверсия управления
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }
    public void playMusic(MusicGenre genre){
        Random random = new Random();
        int randomInteger = random.nextInt(3);
        if (genre.equals(MusicGenre.CLASSICAL)){
            System.out.println("Классика: " + classicalMusic.getSongs().get(randomInteger));
        }
        if (genre.equals(MusicGenre.ROCK)){
            System.out.println("Рок: " + rockMusic.getSongs().get(randomInteger));
        }
        if (genre.equals(MusicGenre.POP)){
            System.out.println("Поп: " + popMusic.getSongs().get(randomInteger));
        }
    }
}
