package ru.oshkina.demo4;

import ru.oshkina.demo1.Song;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}