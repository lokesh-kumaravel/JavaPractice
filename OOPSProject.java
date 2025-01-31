import java.util.*;

interface moneyTransfer {
    abstract void sendmoney();
}

class upi implements moneyTransfer {
    public void sendmoney() {
        // This function actually connects with payment gateway and uses the swift code
        // gateway
        // to transfer money between accounts
    }
}

abstract class BankAccount {
    protected String name;
    protected String city;
    protected float accountBalance;

    BankAccount() {
        name = "None";
        city = "not defined";
        accountBalance = 0;
    }

    BankAccount(String name, String city, float accountBalance) {
        this.name = name;
        this.city = city;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }

    abstract void calculateInterest();

    abstract void FundTransfer();

    abstract void setBalance(float money);

    void display() {
        System.out.println("The name of the Bank is " + name + " located at " + city);
    }
}

class Savings extends BankAccount {
    private String type;
    private float rateOfInterest;
    private final int maxWithdrals = 3;
    private int withdrawals = 0;

    Savings() {
        super();
        rateOfInterest = (float) 6.5;
        type = "Savings";
    }

    Savings(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    Savings(String name, String city, float accountbalance, float rateOfInterest) {
        super(name, city, accountbalance);
        this.rateOfInterest = rateOfInterest;
    }

    public void setRate(float rate) {
        if (rate < 0 || rate > 100)
            System.out.println("Enter a rate of interest between 1 to 100");
        else
            rateOfInterest = rate;
    }

    public void calculateInterest() {
        accountBalance += rateOfInterest * accountBalance / 100;
    }

    public void FundTransfer() {
        upi phonepe = new upi();
        phonepe.sendmoney();
    }

    public void setBalance(float money) {
        if (withdrawals > maxWithdrals && money < 0) // money < 0 indicates it is a withdrawal
            System.out.println("withdrawal limit exceeded for this month");
        else if (money < -1000 || money > 1000)
            System.out.println("This account can be set or withdrawn max of Rs. 1000 only");
        else if (money < 0 && accountBalance + money < 0)
            System.out.println("Insufficient account balance");
        else {
            this.accountBalance += money;
            withdrawals++;
        }
    }

    void display() {
        System.out.println("The name of the Bank is " + name + " located at " + city);
        System.out.println("Account Balance: " + accountBalance);
    }
}

class Current extends BankAccount {
    private String type;
    private float rateOfInterest;
    private final int maxWithdrals = 10000;
    private int withdrawals = 0;

    Current() {
        super();
        rateOfInterest = 0;
        type = "Current";
    }

    Current(String name, String city, float accountbalance) {
        super(name, city, accountbalance);
        this.rateOfInterest = 0; // rate of interest for current account is always 0
    }

    public void FundTransfer() {
        upi phonepe = new upi();
        phonepe.sendmoney();
    }

    public void calculateInterest() {
        accountBalance += 0; // basically no interest
    }

    public void setBalance(float money) {
        if (withdrawals > maxWithdrals && money < 0) // money < 0 indicates it is a withdrawal
            System.out.println("withdrawal limit exceeded for this month");
        else if (money < -100000 || money > 100000) // the limit for transaction in current account is higher
            System.out.println("This account can be set or withdrawn max of Rs. 100000 only");
        else if (money < 0 && accountBalance + money < 0)
            System.out.println("Insufficient account balance");
        else {
            this.accountBalance += money;
            withdrawals++;
        }
    }

    void display() {
        System.out.println("The name of the Bank is " + name + " located at " + city);
        System.out.println("Account Balance: " + accountBalance);
    }
}

public class OOPSProject {
    public static void main(String[] args) {
        int choice = 0;
        BankAccount sbi = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Do you want to open a checkin[1] or savings account[2]?");
            choice = sc.nextInt();
        } while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                sbi = new Current("SBI Current", "Coimbatore", (float) 3000);
                break;

            case 2:
                sbi = new Savings("SBI Savings", "Coimbatore", (float) 10000, (float) 7.5);
                break;
        }

        sbi.display();
        sbi.setBalance(10000);
        sbi.setBalance(-1000);
        sbi.FundTransfer();
        System.out.println("Printing account balance from Main: ");
        System.out.println(sbi.getBalance());
    }
}
