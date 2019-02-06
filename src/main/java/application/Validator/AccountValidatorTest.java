package application.Validator;

import application.Entity.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountValidatorTest {

    private AccountValidator accountValidatorUnderTest;

    @Before
    public void setUp() {
        accountValidatorUnderTest = new AccountValidator();
    }

    @Test
    public void testValidate() {
        // Setup
        final Account account = null;
        final boolean expectedResult = false;

        // Run the test
        final boolean result = accountValidatorUnderTest.validate(account);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
