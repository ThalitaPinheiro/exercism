public class Hamming {
    private String firstChain;
    private String secondChain;

    public Hamming(String firstFilament, String secondFilament){
        if (firstFilament.length() != secondFilament.length()) {
            throw new IllegalArgumentException();
        }
        this.firstChain = firstFilament;
        this.secondChain = secondFilament;
    }

    public int getHammingDistance(){
        int difference = 0;
        for (int position =0; position!=firstChain.length(); position++){
            difference += isSameNitrogenBaseIn(position) ? 0: 1;
        }
        return difference;
    }

    private boolean isSameNitrogenBaseIn(int position) {
        return firstChain.charAt(position) == secondChain.charAt(position);
    }
}
