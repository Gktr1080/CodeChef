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
        for (int i = 0; i < t; i++) 
        {
           int n= sc.nextInt();   
           int x= sc.nextInt();  
           int k= sc.nextInt(); 
           int c = k/x;  //  no of bottles according to capacity and n is the no if bottles which is given in the question
            if(c>n)System.out.println(n);
            else
            System.out.println(c);
            
        }   
		// your code goes here
	}
}
