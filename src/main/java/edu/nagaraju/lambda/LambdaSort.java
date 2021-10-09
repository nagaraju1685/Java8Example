package edu.nagaraju.lambda;

import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    String name;
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



    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


}

public class LambdaSort {

    public void print(){
        System.out.println("i am printing");
    }


    public static void main(String[] args) {
        Comparator<Integer> isort = (I1,I2) -> I1-I2;

        List<Integer> list =  new ArrayList<Integer>();
        list.add(new Integer(10));
        list.add(new Integer(20));
        list.add(new Integer(9));
        list.add(new Integer(105));
        list.add(new Integer(1));
        Collections.sort(list,isort);
        for (Integer i:list){
            System.out.println(i);
        }

        List<Employee> elist =  new ArrayList<Employee>();
        elist.add(new Employee(10,"ABC"));
        elist.add(new Employee(20,"PQR"));
        elist.add(new Employee(9,"BNC"));
        elist.add(new Employee(105,"IMR"));
        elist.add(new Employee(1,"ONE"));
        Collections.sort(elist,(E1,E2) -> E1.id-E2.id);
        for (Employee e:elist){
            System.out.println(e.toString());
        }

        LambdaSort l = new LambdaSort(){

        };


    }


}
