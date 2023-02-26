package classdesign;

class LetterFromJane {

    public static void main(String[] args) {
        StringBuilder letter = new StringBuilder("Dear John");
        int indx = 0;
        try {
            for (indx = 0; indx < 10; indx++) {
                switch (letter.charAt(indx)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(letter.charAt(indx)).toUpperCase();
                        letter.replace(indx, indx + 1, uc);
                }
            }
        } catch (Exception e) {
            System.out.println("Goodbye.");
        }
        System.out.println(letter);
    }
}

public class PQ_92 {

}
