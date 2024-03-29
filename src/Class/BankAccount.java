package Class;

/**
 * @author Nestor Quiroga
 * Class BankAcount for add pay information of the customer
 */
public class BankAccount {
    /**
     * Represents the number account
     */
    private String accountNumber;

    /**
     * Account State
     */
    private boolean activated;

    /**
     * Account current balance
     */
    private float balance;


    //Methods Get and Set

    /**
     * Set the account state
     * @param activated Value for set the new account state can be True or False
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Get the account state
     * @return returns the current account state type boolean
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * Get the account balance(dollars)
     * @return returns the current account balance type float
     */
    protected float getBalance() {
        return balance;
    }

    /**
     * Set the new value of account balance
     * @param balance new value for set the account balance type float
     */
    protected void setBalance(float balance) {
        this.balance = balance;
    }
}
