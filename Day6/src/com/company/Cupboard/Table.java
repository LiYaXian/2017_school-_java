package Cupboard;

import Cupboard.Bowl;

class Table {
    static Bowl bowl1=new Bowl(1);//static成员变量的初始化
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        System.out.println("f2("+marker+")");
    }
    static Bowl bowl2=new Bowl(2);//验证静态成员变量与方法之间在一个类中的调用顺序
}
