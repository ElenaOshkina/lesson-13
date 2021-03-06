package ru.oshkina.demo6;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book book1 = new Book("Как устроены кошки");
        Book book2 = new Book("Зачем мы спим");
        Book book3 = new Book("Парфюмер");

        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<>(bookCompare);
        tree.add(book1);
        tree.add(book2);
        tree.add(book3);

        System.out.println(tree);

    }
}
