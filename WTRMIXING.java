/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i = 0;i<t;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        if(a>b){
                if(y>=(a-b)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else if(b>a){
                if(x>=(b-a)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else{
                System.out.println("yes");
            }
	        
	    }
		// your code goes here
	}
}
