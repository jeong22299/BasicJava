package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Cadasda {
	    public static void main(String[] args) {
	        
	        final int SIZE=6;  //주사위는 6면으로 되어있다.
	 
	        //final로 선언된 변수는 수정할 수 없는상수가 된다. 
	        //상수명은 관례적으로 영문대문자로 한다.
	 
	        int[] freq=new int[SIZE];
	 
	        for(int i=0;i<10000;i++){
	            ++freq[(int)(Math.random()*SIZE)];
	        }//for
	 
	        System.out.println("==========");
	        System.out.println("  면  빈도");
	        System.out.println("==========");
	 
	        for(int i=0;i<SIZE;i++){
	            System.out.println(" "+(i+1)+" "+freq[i]);
	        }
	    }
	    }//main