import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private int day = Calendar.getInstance().get(Calendar.DATE);
    private int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    private int year = Calendar.getInstance().get(Calendar.YEAR);
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }
    
    
    public int age() {
        return birthday.differenceInYears(new MyDate(day, month, year));
    }
    
    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
