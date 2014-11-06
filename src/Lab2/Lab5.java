/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.*;

/**
 *
 * @author Josh
 */
public class Lab5 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Conley", "Josh", "111-11-1111");
        Employee e2 = new Employee("Boggs", "George", "111-11-1111");
        Employee e3 = new Employee("Dunn", "Nate", "222-22-2222");
        Employee e4 = new Employee("Glad", "Matt", "333-33-3333");

        Map<String, Employee> employees = new HashMap<>();

        // Keys should always be unique in a map. I chose to use the SSN
        // in this map because in the real world, no one wil have the
        // same SSN
        employees.put("111-11-1111", e1);
        employees.put("111-11-1111", e2);
        employees.put("222-22-2222", e3);
        employees.put("333-33-3333", e4);

        // Retrieving individual items
        System.out.println(employees.get("333-33-3333"));

        // Retrieving employee with dupilcate SSN, looks like it gets
        // rid of the first instance of the duplicate
        System.out.println(employees.get("111-11-1111"));

        Set keys = employees.keySet();
        for (Object employeeKey : keys) {
            Employee e = (Employee) employees.get(employeeKey);
            System.out.println(e);
        }

        Collection values = employees.values();
        for (Object employeeValue : values) {
            System.out.println((Employee) employeeValue);
        }

    }
}
