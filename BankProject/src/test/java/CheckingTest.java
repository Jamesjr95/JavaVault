package test.java;
import org.junit.*;
import bankaccountapp.*;

public class CheckingTest {

    private Checking checkingAccount;

    @Before
    public void setUp() {
        checkingAccount = new Checking("Alice Smith", "111222333", 1500.0);
    }

    @Test
    public void accountNumberExists() {
        Assert.assertNotNull(checkingAccount.getAccountNumber());
    }

}
