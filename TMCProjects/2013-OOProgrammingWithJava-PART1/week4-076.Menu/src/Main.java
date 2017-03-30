
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addMeal("Fish fingers with sour cream sauce");
        menu.addMeal("Vegetable casserole with salad cheese");
        menu.addMeal("Chicken and nacho salad");

        menu.printMeals();

        menu.clearMenu();
        menu.printMeals();
    }
}
