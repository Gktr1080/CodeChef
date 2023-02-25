/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for (int i = 0; i<t;i++){
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	       int  max = Math.max(A,B);
	       int min = Math.min(A,B);
	       int flag = 0;
	       while(min<=max){
	           if(min==max){
	               System.out.println("yes");
	               flag = 1;
	           
	           }
	           min *= 2;
	       }
	       if(flag == 0)
	       System.out.println("no");
	        
	    }
	            
	        
		// your code goes here
	}
}
