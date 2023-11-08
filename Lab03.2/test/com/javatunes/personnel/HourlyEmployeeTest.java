package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee emp;
    @Before
    public void setup() {
        emp = new HourlyEmployee("Joe", Date.valueOf("2015-10-10"),50.0, 20.0);
    }
    @Test
    public void testPay() {
        assertEquals(1000.0, emp.pay(), .001);
    }
    @Test
    public void testPayTaxes(){
        assertEquals(250.0,emp.payTaxes(), .001);
    }
}