package ru.oshkina.demo2;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;


    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    public String getArtist() {
        return artist;
    }

    public String getBpm() {
        return bpm;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }

}
