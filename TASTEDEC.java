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
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        if(2*x==5*y){
	            System.out.println("Either");
	        }else if(2*x<5*y){
	            System.out.println("Candy");
	        }else{
	            System.out.println("Chocolate");
	        }
	    }
	    
	    
		// your code goes here
	}
}
