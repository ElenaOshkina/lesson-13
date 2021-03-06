package ru.oshkina.demo2;

import ru.oshkina.demo1.Song;

import java.util.Comparator;

public class ArtistCompare implements Comparator<ru.oshkina.demo1.Song> {
    public int compare(ru.oshkina.demo1.Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}