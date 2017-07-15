import java.util.Arrays;
import java.util.HashMap;

final class Scrabble {
    private final String word;
    private static final HashMap<String, Integer> parser;
    static
    {
        parser = new HashMap<>();

        parser.put("A", 1); parser.put("E", 1); parser.put("I", 1); parser.put("O", 1); parser.put("U", 1);
        parser.put("L", 1); parser.put("N", 1); parser.put("R", 1); parser.put("S", 1); parser.put("T", 1);

        parser.put("D", 2); parser.put("G", 2);

        parser.put("B", 3); parser.put("C", 3); parser.put("M", 3); parser.put("P", 3);

        parser.put("F", 4); parser.put("H", 4); parser.put("V", 4); parser.put("W", 4); parser.put("Y", 4);

        parser.put("K", 5);

        parser.put("J", 8); parser.put("X", 8);

        parser.put("Q", 10); parser.put("Z", 10);
    }

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        if (isNullOrEmpty(word)) return 0;

        String[] split = word.toUpperCase().split("");

        return Arrays.stream(split).map(s -> parser.getOrDefault(s, 0)).mapToInt(Integer::new).sum();
//        return Arrays.stream(split).reduce(0, (x,y) -> x+parser.getOrDefault(y,0));
    }

    private boolean isNullOrEmpty(String word) {
        return (word==null || word.isEmpty());
    }
}
