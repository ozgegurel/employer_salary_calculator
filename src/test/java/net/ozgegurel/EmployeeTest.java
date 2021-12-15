package net.ozgegurel;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Test;

import net.ozgegurel.department.EmployeeDepartment;
import net.ozgegurel.promote.FixPenaltyStrategy;
import net.ozgegurel.promote.PercentagePromoteStrategy;

public class EmployeeTest {
                                      
    @Test                                               
    public void testToString() {
        Employee employee = new Employee("test_employee", new BigDecimal(10), null);
        String expected = "name:test_employee salary:10";

        assertEquals(
            expected,
            employee.toString()
            );  
    }

    @Test
    public void testShouldApplyPromotion(){
        PromoteStrategy strategy = new PercentagePromoteStrategy(BigDecimal.valueOf(10));
        Employee employee = EmployeeFactory.create("test_employee", new BigDecimal(10), EmployeeDepartment.TECHNOLOGY, strategy);
        assertEquals(BigDecimal.valueOf(10),employee.salary);  

        employee.applyPromotion();
        assertEquals(BigDecimal.valueOf(11.0),employee.salary);  
    }

    @Test
    public void testShouldApplyPenaltyPromotion(){
        PromoteStrategy strategy = new FixPenaltyStrategy(BigDecimal.valueOf(10));
        Employee employee = EmployeeFactory.create("test_employee", new BigDecimal(100), EmployeeDepartment.TECHNOLOGY, strategy);
        assertEquals(BigDecimal.valueOf(100),employee.salary);  

        employee.applyPromotion();
        assertEquals(BigDecimal.valueOf(90),employee.salary);  
    }

    @Test
    public void testShouldApplyMultiplePromotion(){
        PromoteStrategy strategy = new FixPenaltyStrategy(BigDecimal.valueOf(10));
        Employee employee = EmployeeFactory.create("test_employee", new BigDecimal(100), EmployeeDepartment.TECHNOLOGY, strategy);
        assertEquals(BigDecimal.valueOf(100),employee.salary);  

        employee.applyPromotion();
        assertEquals(BigDecimal.valueOf(90),employee.salary);  

        PromoteStrategy updateStrategy = new PercentagePromoteStrategy(BigDecimal.valueOf(50));
        employee.updatePromotion(updateStrategy);
        assertEquals(BigDecimal.valueOf(90),employee.salary);

        employee.applyPromotion();
        assertEquals(BigDecimal.valueOf(135.0),employee.salary);  
    }
}

