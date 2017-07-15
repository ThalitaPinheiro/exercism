import java.util.*;

public class RnaTranscription {
    private static final Map<String, String> dictionary = new HashMap() {
        {
            put("C", "G");
            put("G", "C");
            put("T", "A");
            put("A", "U");
        }
    };

    public String ofDna(String dnaString) {
        ArrayDeque<String> dnaChain = new ArrayDeque<>(Arrays.asList(dnaString.split("")));
        return transcriptase(dnaChain);
    }

    private String transcriptase(ArrayDeque<String> dnaChain) {
        if(dnaChain.isEmpty()) {
            return "";
        }
        String nucleobase = dnaChain.pollFirst();
        return transcriptNucleobase(nucleobase) + transcriptase(dnaChain);
    }

    private String transcriptNucleobase(String nucleobase) {
        return dictionary.getOrDefault(nucleobase, "");
    }
}
