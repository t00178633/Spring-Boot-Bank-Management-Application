package application.Validator;

import application.Entity.Client;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientValidatorTest {

    private ClientValidator clientValidatorUnderTest;

    @Before
    public void setUp() {
        clientValidatorUnderTest = new ClientValidator();
    }

    @Test
    public void testValidate() {
        // Setup
        final Client client = null;
        final boolean expectedResult = false;

        // Run the test
        final boolean result = clientValidatorUnderTest.validate(client);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
