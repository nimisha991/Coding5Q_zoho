/*
Q1.Given an array of integers and a target value, determine if there are any two integers in the array 
whose sum is equal to the given target value. Return true if the sum exists and return false if it does 
not.
*/
import java.util.*;

class Q1
{
    
    static boolean subarraySum(int[] arr, int n, int s) 
    {
        
        
       
        for(int i=0;i<n;i++)
        {
         for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==s){
              return true;  
              
            }
            
        }}
       return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int n=sc.nextInt();
		System.out.println("Enter Target Value");
        int s =sc.nextInt();
        
        int [] arr=new int[10];
        System.out.println("Enter Array Value");
        for(int i=0;i<n;i++)
        {
          
           arr[i]=sc.nextInt();
     while(arr[i] <1 || arr[i] >100) {
	  System.out.println("Invalid input. try with value b/w 1 and 100");
	arr[i]=sc.nextInt();
                 
           }
        }
        
       
        if(subarraySum(arr,n,s))
        {
            System.out.println("exsist");
        }else{
            System.out.println("Not exsist");
        }
       
    }
}