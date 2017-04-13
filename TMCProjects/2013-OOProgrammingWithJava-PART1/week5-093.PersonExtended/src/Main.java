
public class Main {
  public static void main(String[] args) {

    Person brian = new Person("Brian", 15, 2, 1993);
    Person katey = new Person("Katey", 6, 5, 1990);

    System.out.println(brian.getName() + " is older than " +
                        katey.getName() + ":" + brian.olderThan(katey));
    System.out.println(katey.getName() + " is " + katey.age() + " years old");
  }
}