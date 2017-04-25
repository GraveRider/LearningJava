
public class Main {

    public static void main(String[] args) {
        Book faust = new Book("Goethe", "Faust", 1);
        Book witcher = new Book("Sapkowski", "Sword of Destiny", 1.5);
        CD dismalOrations = new CD("Inquisition", "Nefarious Dismal Orations", 2007);
        Box smallBox = new Box(1);
        Box bigBox = new Box(10);

        smallBox.add(faust);
        System.out.println(smallBox);
        bigBox.add(witcher);
        bigBox.add(dismalOrations);
        bigBox.add(smallBox);
        System.out.println(bigBox);
    }
}
