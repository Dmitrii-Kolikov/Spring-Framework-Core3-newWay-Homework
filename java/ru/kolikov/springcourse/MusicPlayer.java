package ru.kolikov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private  RapMusic rapMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic ) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic=rapMusic;
    }


    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        //случайное число между 0 и 2
        if (genre==MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
            //случайная классическая песня
        }
        else if(genre==MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));
            //случайная рок песня
        }
        else if (genre==MusicGenre.RAP) {
            System.out.println(rapMusic.getSongs().get(randomNumber));
            //случайная рэп песня
        }
    }

}
