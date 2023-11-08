package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EmployeeTest {
    private Employee emp;
    private Employee emp2;

    @Before
    public void setup() {
        //emp = new SalariedEmployee("Logan", Date.valueOf("2015-02-02"), 1500.0);
        //emp2 = new SalariedEmployee("Logan", Date.valueOf("2015-02-02"), 1500.0);
        emp = getEmployee();
        emp2 = getEmployee();

    }
    private Employee getEmployee() {
        return new Employee("Logan", Date.valueOf("2015-02-02")) {
            public double pay() {return 0;}
            public double payTaxes() {return 0;}
        };
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("Different");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2000-11-11"));
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp, emp2);
    }

    private class DummyEmployee extends Employee {
        public DummyEmployee(String name, Date hireDate){
            super(name, hireDate);
        }
        @Override
        public double pay() {return 0;}
        @Override
        public double payTaxes() {return 0;}
    }
}