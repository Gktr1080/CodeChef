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
	    int T = sc.nextInt();
	    for(int i = 0;i<T;i++){
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int K = sc.nextInt();
	        if((M-K)>=N){
	            System.out.println("yes");
	        }else{
	            System.out.println("no");
	        }
	    }
		// your code goes here
	}
}
