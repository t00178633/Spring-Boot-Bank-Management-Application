package application.Validator;

import application.Entity.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeValidatorTest {

    private EmployeeValidator employeeValidatorUnderTest;

    @Before
    public void setUp() {
        employeeValidatorUnderTest = new EmployeeValidator();
    }

    @Test
    public void testValidate() {
        // Setup
        final Employee employee = null;
        final boolean expectedResult = false;

        // Run the test
        final boolean result = employeeValidatorUnderTest.validate(employee);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
