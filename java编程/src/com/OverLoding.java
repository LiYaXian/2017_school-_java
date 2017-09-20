package com;

public class OverLoding {
    public static void main(String[] args){
       for (int i=1;i<10;i++)
       {
           Tree t=new Tree(i);
           t.info();
           t.info("over loaded");
       }

       new Tree();

    }
}
