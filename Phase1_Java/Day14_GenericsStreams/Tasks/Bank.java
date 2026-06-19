class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;

        System.out.println(
                Thread.currentThread().getName()
                        + " deposited "
                        + amount
                        + " | Balance = "
                        + balance
        );

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;

            System.out.println(
                    Thread.currentThread().getName()
                            + " withdrew "
                            + amount
                            + " | Balance = "
                            + balance
            );
        } else {
            System.out.println(
                    Thread.currentThread().getName()
                            + " insufficient balance"
            );
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Customer extends Thread {
    private BankAccount account;
    private int amount;
    private String operation;

    public Customer(
            String name,
            BankAccount account,
            int amount,
            String operation
    ) {
        super(name);
        this.account = account;
        this.amount = amount;
        this.operation = operation;
    }

    public void run() {

        if (operation.equals("deposit")) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class Bank {
    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account =
                new BankAccount(1000);

        Customer c1 =
                new Customer(
                        "Customer-1",
                        account,
                        500,
                        "deposit"
                );

        Customer c2 =
                new Customer(
                        "Customer-2",
                        account,
                        300,
                        "withdraw"
                );

        Customer c3 =
                new Customer(
                        "Customer-3",
                        account,
                        700,
                        "withdraw"
                );

        Customer c4 =
                new Customer(
                        "Customer-4",
                        account,
                        1000,
                        "deposit"
                );

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println(
                "\nFinal Balance = "
                        + account.getBalance()
        );
    }
}