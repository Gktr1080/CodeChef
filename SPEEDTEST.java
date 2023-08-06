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
	        int a = sc.nextInt();
	        int x = sc.nextInt();
	        int b = sc.nextInt();
	        int y = sc.nextInt();
	         float m = a/(float)x;
	         float n = b/(float)y;
	        if(m>n){
	            System.out.println("ALICE");
	        }else if(m==n){
	            System.out.println("EQUAL");
	        }else{
	            System.out.println("BOB");
	        }
	}
	}
}
