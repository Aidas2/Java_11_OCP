package classdesign;

final class WordPress {

    public void login() {
    }
}

class Post {

    public final void write(int words, int pix) {
    }

    public void uploadMedia() {
    }
}

class FrontPage {

    private Post p = new Post();
    private final String subj = "OCA & OCP Prep Tools";

    public void compose() {
        p.write(1200, 2);
    }
}

//class StickyPost extends Post {
//
//    public void write(int numberOfWords, int numberOfPix) {
//    }
//
//    public void publish() {
//    }
//}

public class PQ_13 {

}
