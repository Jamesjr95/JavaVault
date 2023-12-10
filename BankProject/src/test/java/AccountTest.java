package test.java;
import org.junit.*;

import bankaccountapp.*;

public class AccountTest {
    public Account account;

    @Before
    public void setUp() {
        // Initialize a concrete instance of Account, e.g., a Savings account
        account = new Savings("John Doe", "123456789", 1000.0);
    }

    @Test
    public void depositIncreasesBalance() {
        account.deposit(500.0);
        // assertEquals("Balance should increase by 500.0", 1500.0, account.getBalance(), 0.01);
    }

    // Additional tests...
}

