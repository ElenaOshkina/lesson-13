package ru.oshkina.demo6;

import java.util.Comparator;

public class BookCompare implements Comparator<Book> {
    @Override
    public int compare(Book one, Book two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}

