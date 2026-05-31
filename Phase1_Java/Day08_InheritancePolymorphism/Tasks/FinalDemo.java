/*
Question:
How can you create a Java program to demonstrate final class, final method, and final variable initialized in constructor?
*/
final class FinalAccount {
    private final String accountNo;

    FinalAccount(String accountNo) {
        this.accountNo = accountNo;
    }

    final void showAccount() {
        System.out.println("Account number: " + accountNo);
    }
}

class FinalDemo {
    public static void main(String[] args) {
        final int maxAttempts = 3;
        FinalAccount account = new FinalAccount("ACC1001");

        account.showAccount();
        System.out.println("Max attempts: " + maxAttempts);
    }
}
