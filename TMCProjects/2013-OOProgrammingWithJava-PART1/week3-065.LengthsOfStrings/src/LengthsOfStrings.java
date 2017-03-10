import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for (String word : list) {
            lengthList.add(word.length());
        }
        
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Car");
        list.add("Tank");
        list.add("Jeep");
        list.add("Jet fighter");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}