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
    			   System.out.println("ǰһ������");
    		   }else{System.out.println("��һ������");}
    		   
    	   }
    	   
       }
      public static void main(String[] args){
    	  compare();
      }
}