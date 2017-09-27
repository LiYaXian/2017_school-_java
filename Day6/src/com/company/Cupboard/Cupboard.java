package Cupboard;

import Cupboard.Bowl;

class Cupboard {
    Bowl bowl3=new Bowl(3);//非静态对象的调用顺序在静态对象之后
    static Bowl bowl4=new Bowl(4);//static成员只被初始化一次
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }
    static Bowl bowl5=new Bowl(5);
}
