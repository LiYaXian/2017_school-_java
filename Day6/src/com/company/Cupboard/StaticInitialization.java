package Cupboard;

import Cupboard.Cupboard;
import Cupboard.Table;

public class StaticInitialization {
    public static void main(String[] args){
        System.out.println("Creating new Cupboard() in main");//在主方法中创建Cupboard对象
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(3);
    }
    static Table table=new Table();//静态对象只在必要时候创建，且先初始化静态对象
    static Cupboard cupboard=new Cupboard();
}
