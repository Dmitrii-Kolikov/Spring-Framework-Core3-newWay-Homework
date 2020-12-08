package ru.kolikov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
        List<String> songs = new ArrayList<>();
        // Блок инициализации объекта (англ. Instance initialization block)
        // Выполняется каждый раз, когда создается объект класса
        {
            songs.add("8 Mile");
            songs.add("The Weeknd");
            songs.add("Masked Wolf");
        }

        @Override
        public List<String> getSongs() {
            return songs;
        }
    }
