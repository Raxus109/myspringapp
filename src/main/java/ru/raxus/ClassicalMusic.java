package ru.raxus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Attack of the Deadmen");
        songs.add("Radio Gaga");
        songs.add("I was made for lovin' you babe");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("...инициализирую ");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("...уничтожаю ");
    }

}
