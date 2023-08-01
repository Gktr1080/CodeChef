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
	        int arr[] = new int[n];
	        for(int j=0;j<n;j++){
	           arr[j] = sc.nextInt();
	        }
	         int low =0,high =n-1,count =0;
	         while(low<high){
	             if(arr[low] == arr[high]){
	             low++;
	             high--;
	         }else if(arr[low] > arr[high]){
	             arr[low] = arr[low] - arr[high];
	             high--;
	             count++;
	         }else{
	             arr[high] = arr[high]-arr[low];
	             low++;
	             count++;
	         }
	        
	    }
	    
	    System.out.println(count);
	    }
		// your code goes here
	}
}
