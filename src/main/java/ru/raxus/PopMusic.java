package ru.raxus;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    private List<String> songs = new ArrayList<>();
    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Never gonna give you up");
        songs.add("Umbrella");
        songs.add("K/D/A");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
