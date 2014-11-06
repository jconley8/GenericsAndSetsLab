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
public class Lab2 {

    public static void main(String[] args) {
        List employeeList = new ArrayList();

        employeeList.add(new Employee("Conley", "Josh", "111-11-1111"));
        employeeList.add(new Employee("Boggs", "George", "111-11-1111"));
        employeeList.add(new Employee("Dunn", "Nate", "222-22-2222"));
        employeeList.add(new Employee("Glad", "Matt", "333-33-3333"));

        //Output size of list
        int listSize = employeeList.size();
        System.out.println(listSize);

        //Output employee 1 WITH casting
        Employee e1 = (Employee) employeeList.get(1);
        System.out.println(e1.toString());

        //Loop through list and output each employee
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        //Compares employee 0 and employee 1
        if (employeeList.get(0).equals(employeeList.get(1))) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        //Checks if list is empty
        System.out.println(employeeList.isEmpty());
    }

}
