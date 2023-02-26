package functionalinterfaces;

interface Laughable {

    Joke crackJoke(String joke);
}

class Joke {

    private String joke;

    public Joke(String joke) {
        this.joke = joke;
    }
}

public class PQ_12 {
    public static void main(String[] args) {
//        Joke hello = Joke("MyJoke")::new;

//        Joke hello = Joke::new;
//        Joke oneMore = hello::crackJoke("MyJoke");

//        Laughable joker = Joke::new;
//        Joke oneMore = joker.crackJoke("MyJoke");

//        Joke oneMore = Laughable::new::crackJoke("MyJoke");

    }
}
