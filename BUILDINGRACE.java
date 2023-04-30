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
	    for(int i = 0; i<t;i++){
	        float A = sc.nextInt();
	         float B = sc.nextInt();
	          float X = sc.nextInt();
	           float Y = sc.nextInt();
	           float F = (A/X);
	           float W = (B/Y);
	           if(F>W){
	               System.out.println("CHEFINA");
	           }else if(F == W){
	               System.out.println("BOTH");
	           }else{
	               System.out.println("CHEF");
	           }
		// your code goes here
	    }
	}
}
