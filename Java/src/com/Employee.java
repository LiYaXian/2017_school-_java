package com;

public class Employee {
    String name;
    String contact;
    public  Employee(String name){
         this.name=name;
        System.out.println(this.toString());
    }

    public Employee(String name,String contact){
        this.name=name;

    }

    public String toString() {
        return "yuangong:"+this.name+",lianxifangshi"+this.contact;
    }

    public static void main(String[] args){
        Employee employee=new Employee("dff","fgy");
        Employee employee1=new Employee("fsdgd");


    }
}
