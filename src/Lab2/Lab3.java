/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh
 */
public class Lab3 {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Conley", "Josh", "111-11-1111"));
        employeeList.add(new Employee("Boggs", "George", "111-11-1111"));
        employeeList.add(new Employee("Dunn", "Nate", "222-22-2222"));
        employeeList.add(new Employee("Glad", "Matt", "333-33-3333"));

        //Output employee 1 WITHOUT casting
        Employee e1 = employeeList.get(1);
        System.out.println(e1.toString());

        //Loop through list and output each employee
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
