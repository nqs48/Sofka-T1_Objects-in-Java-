package Class;

public class BankAccount {
    private int accountNumber;
    private boolean activated;
    private float balance;


    //Methods Get and Set
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean getActivated() {
        return activated;
    }


    private float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }
}
