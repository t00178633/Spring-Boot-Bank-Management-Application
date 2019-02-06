package application.Validator;

import application.Entity.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionValidatorTest {

    private TransactionValidator transactionValidatorUnderTest;

    @Before
    public void setUp() {
        transactionValidatorUnderTest = new TransactionValidator();
    }

    @Test
    public void testValidate() {
        // Setup
        final Account from = null;
        final Double amount = 0.0;
        final boolean expectedResult = false;

        // Run the test
        final boolean result = transactionValidatorUnderTest.validate(from, amount);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
