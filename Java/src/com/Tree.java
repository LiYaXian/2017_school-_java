package com;

public class Tree {
      int height;
      Tree(){
          System.out.println("planting a seeding");
          height=0;
      }
      Tree(int initialHeight){
          height=initialHeight;

          System.out.println("Creating new Tree that is"+height+"feet tall");

      }
      void info(){
          System.out.println("PLease");
      }
      void info(String s){
          System.out.println(s+":Tree is"+height+"feet tall");
      }
}
