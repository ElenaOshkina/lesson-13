package ru.oshkina.demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        HashSet<Song> songHashSet = new HashSet<>();
        songHashSet.addAll(songList);
        System.out.println(songHashSet);
    }

    void getSongs() {
        try {
            File file = new File("/Users/elenaoshkina/IdeaProjects/lesson-13/src/main/resources/SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}

//  hash set [ ] [ ] [hi] [ ] [ ]  [hello, home, khkhk, khkh,] [ ] [ ]

// hello -> hash code = 21 % 8 = 5
// hi ->  2 % 8 = 2
// home -> hash code = 21 % 8 = 5

// hi -> 2 true
// home -> 21 true

// elena -> 21
