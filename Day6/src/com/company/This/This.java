package com.company.This;

class This {
}
class Person{
    public void eat(Apple apple){
        Apple peeled=apple.getPeeled();
        System.out.println("Already pelled,you can eat this apple");
    }
        }

class Peeler{
    static Apple peel(Apple apple){
        System.out.println(1.);
        return apple;
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }

}