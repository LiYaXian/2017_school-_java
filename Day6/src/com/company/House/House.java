package com.company.House;

class Window{
    Window(int window){
        System.out.println("Window("+window+")");
    }
}

public class House {
    Window marker=new Window(1);//构造方法之前

    House(){
        //构造方法
        System.out.println("House()");
        Window marker3=new Window(23);
    }
    Window marker2=new Window(2);//构造方法之后
    void f(){System.out.println("f()");}
    Window maker3=new Window(3);//w3在构造器之后的调用
}
