package ru.raxus;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Never gona give you up!";
    }
}
