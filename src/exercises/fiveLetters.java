package exercises;
import java.util.ArrayList;

public class fiveLetters {
    public static void main(String[] args) {

        String[] someWords = {"hello", "hi", "ok", "bye", "world", "interesting" };

        ArrayList<String> hello = onlyFiveLetterWords(someWords);

        System.out.println(hello);

    }

    private static ArrayList<String> onlyFiveLetterWords(String[] words) {

        ArrayList<String> new_list = new ArrayList<>();

        for (String word : words) {
            if (word.length() == 5) {
                new_list.add(word);
            }
        }

        return new_list;
    }


}
