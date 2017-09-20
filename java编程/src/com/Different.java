package com;

public class Different {
     static void f(String s,int i){
         System.out.println(s+"其实我是"+i+"岁");
     }
     static void f(int t,String args){
         System.out.println("如果我是"+args+"并且"+t+"岁");
     }
     public static void main(String[] args){
         f("jhjk",98);
         f(45,"sddsfg");

     }
}
