import java.util.ArrayList;

class RaindropConverter {




    String convert(int number) {
        ArrayList<Integer> bla = new ArrayList<Integer>(){{
            add(3);
            add(5);
            add(7);
        }};

        bla.stream().reduce("", (x,y) -> (number%y==0? y:""));

        String converted = "";
        if(number%3==0) {
            converted += "Pling";
        }
        if (number%5==0){
            converted+= "Plang";
        }
        if (number%7==0){
            converted+= "Plong";
        }
        if (converted.isEmpty()){
            converted+= number;
        }

        return converted;
    }
}
