public class Main {
    public static void main(String[] args) {
        double INTEREST_RATE = 0.17;
        double cardBalance = 5000;
        double dueMonthOne = cardBalance * INTEREST_RATE;
        double dueMonthTwo = dueMonthOne * INTEREST_RATE;

        System.out.println("The interest due after one month is $" + dueMonthOne + " and the interest due after two months is " + dueMonthTwo);
    }
}