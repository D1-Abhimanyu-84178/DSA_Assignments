package com.sunbeam.emp;
public class Main {

    public static Employee[] sortEmp(Employee[] employees, int size) {
        for (int i = 1; i < size; i++) {
            Employee temp = employees[i];
            int j = i - 1;

            while (j >= 0 && employees[j].compareTo(temp) > 0) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = temp;
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(105, "Alice", 50000);
        employees[1] = new Employee(102, "Bob", 60000);
        employees[2] = new Employee(101, "Charlie", 55000);
        employees[3] = new Employee(104, "David", 52000);
        employees[4] = new Employee(103, "Eve", 58000);

        Employee[] sortedEmployees = sortEmp(employees, employees.length);
        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}

