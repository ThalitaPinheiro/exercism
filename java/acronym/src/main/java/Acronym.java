final class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return phrase.replaceAll("\\B[a-z]|\\B[A-Z]{2}|[^A-Za-z]","").toUpperCase();
    }
}
