
public class Calculator {

    private Reader reader;
    private int calculations;

    public Calculator() {
        reader = new Reader();
    }

    public void start() {

        calculations = 0;

        while (true) {
            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }

        }
        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        int sum = value1 + value2;

        System.out.println("sum of values " + sum);
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        int difference = value1 - value2;

        System.out.println("difference of values " + difference);
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();

        int product = value1 * value2;

        System.out.println("product of values " + product);
    }

    private void statistics() {

        System.out.print("Calculations done " + calculations);
    }
}

