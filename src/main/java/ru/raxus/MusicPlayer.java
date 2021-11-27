package ru.raxus;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer{
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private Integer volume;

    //Инверсия управления
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
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
