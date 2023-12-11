package test.java;
import org.junit.*;
import bankaccountapp.*;

public class AccountTest {

    private Savings savingsAccount;
    private Checking checkingAccount;

    @Before
    public void setUp() {
        savingsAccount = new Savings("John Doe", "123456789", 1000.0);
        checkingAccount = new Checking("Jane Doe", "987654321", 2000.0);
    }

    @Test
    public void depositShouldIncreaseBalance() {
        savingsAccount.deposit(500.0);
        Assert.assertEquals(1500.0, savingsAccount.getBalance(), 0.01);

        checkingAccount.deposit(300.0);
        Assert.assertEquals(2300.0, checkingAccount.getBalance(), 0.01);
    }

    @Test
    public void withdrawShouldDecreaseBalance() {
        savingsAccount.withdraw(200.0);
        Assert.assertEquals(800.0, savingsAccount.getBalance(), 0.01);

        checkingAccount.withdraw(500.0);
        Assert.assertEquals(1500.0, checkingAccount.getBalance(), 0.01);
    }


}
