package practice;

import java.util.Random;

public class Int {  
       static void compare(){
    	   int i,j,k;
    	   int a[]=new int[26];
    	   Random rand=new Random();
    	   for(i=0;i<25;i++){
    		   a[i]=rand.nextInt();
    		   a[i+1]=rand.nextInt();
    		   if(a[i]>a[i+1]){
    			   System.out.println("前一个数大");
    		   }else{System.out.println("后一个数大");}
    		   
    	   }
    	   
       }
      public static void main(String[] args){
    	  compare();
      }
}