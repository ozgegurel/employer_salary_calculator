package net.ozgegurel;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

class EmployeeTest {

    Employee employee;

    @Before                                         
    void setUp() {
        employee = new Employee("test_employee", new BigDecimal(10), null);
    }

    @Test                                               
    void testToString() {
        final String expected = "name:test_employee salary:10000000";

        assertEquals(
            "Failure: Strings are not equal.",
            expected,
            employee.toString()
            );  
    }

}

