public class Main {

    public static void main(String[] args) {

        Account acc = new Account(101, "Turan", 1000);

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        try {

            acc.withdraw(1500);

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Final balance: " + acc.getBalance());
    }

}