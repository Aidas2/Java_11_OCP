package Standart_Tests.Test_05;


import java.util.Arrays;
import java.util.List;

//What will the following code print when compiled and run?
class Movie{
    static enum Genre  {DRAMA, THRILLER, HORROR, ACTION };
    private Genre genre;
    private String name;
    private char rating = 'R';
    Movie(String name, Genre genre, char rating){
        this.name = name; this.genre = genre; this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public char getRating() {
        return rating;
    }

}
public class Q36 {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", Movie.Genre.DRAMA, 'U'),
                new Movie("Psycho", Movie.Genre.THRILLER, 'U'),
                new Movie("Oldboy", Movie.Genre.THRILLER, 'R'),
                new Movie("Shining", Movie.Genre.HORROR, 'U')
        );

        movies.stream()
                .filter(mov->mov.getRating()=='R')
                .peek(mov->System.out.println(mov.getName()))
//                .map(mov->mov.getName());
                .map(mov->mov.getName()).forEach(System.out::println);

    }

}

