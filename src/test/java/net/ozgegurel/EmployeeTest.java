package net.ozgegurel;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

class EmployeeTest {

    Employee employee;

    @Before                                         
    void setUp() {
        employee = new Employee("test_employee", 10.0f, null);
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

