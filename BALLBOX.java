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
		
		for(int i=0;i<t;i++)
		{
		   int  n = sc.nextInt();
		   int k = sc.nextInt();
		   int s = k*(k+1)/2;
		   if(n>=s){
		       System.out.println("YES");
		  // }else if(n == k && n==1){
		  //     System.out.println("YES");
		   }else{
		       System.out.println("NO");
		   } 
		} 
		// your code goes here
	}
}
