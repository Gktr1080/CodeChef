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
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int Z = Math.max(A,B);
	        Z = Math.max(C,Z);
	        int X = Math.min(A,B);
	        X = Math.min(C,X);
	        System.out.println(Z-X);
	       
	    }
		// your code goes here
	}
}
