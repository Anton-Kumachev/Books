package chap16;

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
        new Test().go();

    }

    public void go() {
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново своё тело");
        Book b3 = new Book("В поисках Эмо");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable {
    String title;
    public Book(String t) {
        title = t;
    }

    public int compareTo(Object b) {
        Book book = (Book) b;
        return (title.compareTo(book.title));
    }

    public String toString() {
        return title;
    }
}

class Test {
    public void go() {
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново своё тело");
        Book b3 = new Book("В поисках Эмо");

        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bCompare);
        tree.add(new Book("Как устроены кошки"));
        tree.add(new Book("В поисках Эмо"));
        tree.add(new Book("Постройте заново своё тело"));
        System.out.println(tree);
    }
}