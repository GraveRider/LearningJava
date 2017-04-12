
public class Main {

    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        System.out.println( register );

        LyyraCard card = new LyyraCard(2);

        System.out.println("the card balance " + card.balance() + " euros");

        boolean succeeded = register.payGourmet(card);
        System.out.println("payment success: " + succeeded);

        register.loadMoneyToCard(card, 100);

        succeeded = register.payGourmet(card);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + card.balance() + " euros");

        System.out.println( register );
    }
}

