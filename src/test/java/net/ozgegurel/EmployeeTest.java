package net.ozgegurel;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

class EmployeeTest {

    Employee employee;

    @Before                                         
    void setUp() {
        employee = new Employee("test_employee", new BigDecimal(0), null);
    }

    @Test                                               
    void testToString() {
        final String expected = "name:test_employee salary:10.0";

        assertEquals(
            "Failure: Strings are not equal.",
            expected,
            employee.toString()
            );  
    }

}

