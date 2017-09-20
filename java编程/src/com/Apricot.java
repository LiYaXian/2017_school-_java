package com;

public class Apricot {
    int i=0;
    Apricot increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i="+i);
    }

    public static void main(String[] args){
        Apricot x=new Apricot();
        x.increment().increment().increment().print();

    }

}
