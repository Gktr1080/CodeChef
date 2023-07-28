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
	        long n = sc.nextLong();
	        long k = sc.nextLong();
	        long  sum = (n*(n-1))/2;
	        if(k<n/2){
	            long x = n-2*k;
	            sum -= (x*(x-1))/2;
	        }
	        System.out.println(sum);
	        
	    }
		// your code goes here
	}
}
