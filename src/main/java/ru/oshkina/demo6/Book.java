package ru.oshkina.demo6;

public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

   // @Override
    //public int compareTo(Book o) {
     //   return title.compareTo(o.title);
   // }
}

