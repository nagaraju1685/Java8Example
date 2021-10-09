package edu.nagaraju.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    String name;
    Date dob;

    public Employee(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    @Override
    public int compareTo(Employee o) {
        return o.id-this.id;
    }
}

public class FilterStreamTest {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(7, "Nagaraju", new Date()));
        employeeList.add(new Employee(5, "Ravi", new Date()));
        employeeList.add(new Employee(3, "Kranthi", new Date()));
        employeeList.add(new Employee(1, "Janu", new Date()));
        employeeList.add(new Employee(2, "Ramu", new Date()));
        employeeList.add(new Employee(4, "Ramesh", new Date()));
        employeeList.add(new Employee(6, "Suresh", new Date()));
        employeeList.add(new Employee(1, "Janu", new Date()));

        employeeList.stream().forEach(p -> {
            System.out.println(p.toString());
        });
        System.out.println("=======================================");
        employeeList.stream().filter(p -> p.name.startsWith("R")).forEach(p -> System.out.println(p.toString()));
        System.out.println("=======================================");
        employeeList.stream().sorted((E1, E2) -> E1.id - E2.id).distinct().forEach(e -> System.out.println(e.toString()));
        System.out.println("=======================================");
        System.out.println(employeeList.stream().max((E1, E2) -> E1.id - E2.id).toString());
        System.out.println("=======================================");
        System.out.println(employeeList.stream().min((E1, E2) -> E1.id - E2.id).toString());
        System.out.println("=======================================");
        System.out.println(employeeList.stream().sorted().limit(0).toString());
    }
}
