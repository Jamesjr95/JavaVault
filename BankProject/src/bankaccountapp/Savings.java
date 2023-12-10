package bankaccountapp;

public class Savings extends Account{
    // List properites specific to the Saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the Saving properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        System.out.println("Implement rate for savings");;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to saving account
    public void showInfo() {
        super.showInfo();
        System.out.println(
            " Your Savings Account Features" +
            "\n Safety Deposit Box ID: " + safetyDepositBoxID + 
            "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }

}
