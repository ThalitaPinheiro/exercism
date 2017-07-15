import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean isPangram(String input) {

        Set<String> uniqueLetters = new HashSet<>(Arrays.asList(toLetterArray(input)));

        return uniqueLetters.size() == 26;
    }

    private String[] toLetterArray(String input) {
        return input.toLowerCase().replaceAll("[^a-zA-Z]", "").split("");
    }
}
