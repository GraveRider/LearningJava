
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (balance - 2.5 >= 0) {
            balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (balance - 4 >= 0) {
            balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount >= 0 && balance + amount <= 150) {
            balance += amount;
        }
        else if (amount < 0) {
        }
        else {
            balance = 150;
        }
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }
}
