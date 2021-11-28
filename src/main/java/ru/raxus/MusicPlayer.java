package ru.raxus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private Music music1;
    private Music music2;
    private List<Music> musicList = new ArrayList<>();
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;
    private String name;
    private Integer volume;

    //Инверсия управления

    public MusicPlayer() {
    }
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic")Music music1, @Qualifier("rockMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic, @Qualifier("rockMusic") RockMusic rockMusic, @Qualifier("popMusic") PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public String playMusic() {
        //return "Playing: " + music.getSong();
        /*return "Previous Playing: " + popMusic.getSong() + "\n" +
                "Now Playing: " + classicalMusic.getSong() + "\n" +
                "Next Playing: " + rockMusic.getSong();*/
        return "Now Playing: " + music1.getSong() + "\n" +
                "Next Playing: " + music2.getSong();
        //return "Playing: " + rockMusic.getSong();
        //return "Playing: " + popMusic.getSong();
        //System.out.println("Playing: " + music.getSong());
        //System.out.println("Playing: " + classicalMusic.getSong());
        //System.out.println("Playing: " + rockMusic.getSong());
        //System.out.println("Playing: " + popMusic.getSong());
    }
}
