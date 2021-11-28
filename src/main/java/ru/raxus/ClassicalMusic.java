package ru.raxus;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Four Seasons";
    }
    public void doInit(){
        System.out.println("Инициализирую метод");
    }
    public void doDestroy(){
        System.out.println("Уничтожаю метод");
    }
}
