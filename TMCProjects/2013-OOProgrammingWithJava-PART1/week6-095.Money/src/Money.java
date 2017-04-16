
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int sumOfEuros = this.euros + added.euros;
        int sumOfCents = this.cents + added.cents;
        return new Money(sumOfEuros, sumOfCents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decremented) {
        int minusMoney = (this.euros * 100 + this.cents) - (decremented.euros * 100 + decremented.cents);
        if (minusMoney < 0) {
            return new Money(0, 0);
        }
        int minusEuros = minusMoney / 100;
        int minusCents = minusMoney % 100;
        return new Money(minusEuros, minusCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
