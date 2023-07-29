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
	    for(int i = 0;i<t;i++){
	        int n = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int p = Math.min(a,n-a+1);
	        int q = Math.min(b,n-b+1);
	        int r = Math.min(x,n-x+1);
	        int s= Math.min(y,n-y+1);
	        System.out.println(Math.min(Math.abs(x-a)+Math.abs(y-b),Math.min(r,s)+Math.min(p,q)));
	    }
	        
		// your code goes here
	}
}
