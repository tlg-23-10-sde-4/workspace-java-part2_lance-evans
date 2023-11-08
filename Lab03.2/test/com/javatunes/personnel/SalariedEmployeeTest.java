package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SalariedEmployeeTest {
    private SalariedEmployee emp;
    private SalariedEmployee emp2;

    @Before
    public void setup(){
        emp = new SalariedEmployee("Logan", Date.valueOf("2015-02-02"), 1500.0);
        emp2 = new SalariedEmployee("Logan", Date.valueOf("2015-02-02"), 1500.0);
    }

    @Test
    public void hashCode_equalObjectMustHaveEqualHashCodes(){
        assertEquals(emp.hashCode(), emp2.hashCode());
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate_sameSalary(){
        emp2.setName("Different");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate_sameSalary(){
        emp2.setHireDate(Date.valueOf("2000-11-11"));
        assertNotEquals(emp, emp2);
    }

    @Test
    public void testPay() {
        assertEquals(1500.0, emp.pay(), .001);

    }

    @Test
    public void testPayTaxes(){
        assertEquals(450, emp.payTaxes(), .001);
    }

}