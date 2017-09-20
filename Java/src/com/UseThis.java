package com;

class Person{
    public void eat(Apple apple){
        Apple peeled=apple.getPeeled();
        System.out.println("4 ");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        System.out.println("5");
        return apple;
    }
}

class Apple{
Apple getPeeled(){
    return Peeler.peel(this);
}
}
public class UseThis {
public static void main(String[] args){
    new Person().eat(new Apple());
}
}
