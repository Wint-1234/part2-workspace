/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
  
  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }

  /**
   * DONE: given the input map, create and return the correct object (with its properties set)
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String,String> inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;

    // read map and create correct Employee type accordingly (via "type" entry)
    String type = inputMap.get("type");

    if ("SE".equals(type)) {
      SalariedEmployee salariedEmp = new SalariedEmployee();
      salariedEmp.setName(inputMap.get("name"));
      salariedEmp.setHireDate(Date.valueOf(inputMap.get("hireDate")));
      salariedEmp.setSalary(Double.parseDouble(inputMap.get("salary")));
      emp = salariedEmp;
    }
    else if ("HE".equals(type)) {
      HourlyEmployee hourlyEmp = new HourlyEmployee();
      hourlyEmp.setName(inputMap.get("name"));
      hourlyEmp.setHireDate(Date.valueOf(inputMap.get("hireDate")));
      hourlyEmp.setRate(Double.parseDouble(inputMap.get("rate")));
      hourlyEmp.setHours(Double.parseDouble(inputMap.get("hours")));
      emp = hourlyEmp;
    }
    else {
      throw new IllegalArgumentException("Invalid type: " + type);
    }
    return emp;
  }
}