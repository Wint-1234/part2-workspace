package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Winton Ebanks", new Date(120, 2, 15), 120000d);
  }

  @Test
  public void testPay() {
    assertEquals(120000, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(36000, emp.payTaxes(), 0.001);
  }
}