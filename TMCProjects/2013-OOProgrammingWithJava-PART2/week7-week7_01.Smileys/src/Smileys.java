
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String print;

        if(characterString.length() % 2 == 0) {
            print = ":) " + characterString + " :)";
        }
        else {
            print = ":) " + characterString + "  :)";
        }
        int length = print.length();

        for(int i = 0; i < length; i+= 2) {
            System.out.print(":)");
        }
        System.out.println();
        System.out.println(print);
        for(int i = 0; i < length; i+= 2) {
            System.out.print(":)");
        }
        System.out.println();
    }

}
