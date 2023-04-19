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
	        float x = sc.nextInt();
	        float y = sc.nextInt();
	        float z = ((y/x)*100);
	        
	        if(z>=50){
	            System.out.println("yes");
	        }else{
	           System.out.println("no");
	        }
	        
	    }
		// your code goes here
	}
}
