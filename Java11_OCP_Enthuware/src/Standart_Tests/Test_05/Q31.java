package Standart_Tests.Test_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q31 {

    public static class Book {
        private String title;
        private String genre;
        public Book(String title, String genre){
            this.title = title; this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", genre='" + genre + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

//    and the following code:
    var books = new ArrayList<Book>(List.of(new Book("The Outsider", "fiction"),
            new Book("Becoming", "non-fiction"),new Book("Uri", "non-fiction")));
    books.sort(Comparator.comparing(Book::getGenre).thenComparing(Book::getTitle).reversed());
    System.out.println(books);

    }

//    What will be the result?
}
