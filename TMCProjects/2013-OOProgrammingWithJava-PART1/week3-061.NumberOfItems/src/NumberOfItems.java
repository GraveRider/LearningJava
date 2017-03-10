import java.util.ArrayList;

public class NumberOfItems {

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C#");
        list.add("C++");
        System.out.println("There are this many items on the list:");
        System.out.println(countItems(list));
    }

}