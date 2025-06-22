class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Name: " + name + ", Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Hemadevi", 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}
