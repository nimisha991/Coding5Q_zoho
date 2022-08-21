/*
Q3.Some people are standing in a row in a park. There are trees between them which
cannot be moved. Your task is to rearrange the people by their heights in a nondescending order without moving the trees.
*/
import java.util.*;

class Q3
{
    
    static void subarraySum(int[] arr) 
    {
        int n=arr.length;
   
        for(int i=0;i<n;i++)
        {
            if(arr[i]==-1 )
            {
            i++;
            }
            
         for(int j=i+1;j<n;j++)
        {
            int temp=0;
            if (arr[j] < arr[i] && arr[j]!=-1) {
 
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
              
            }
        }
       for(int i=0;i<n;i++)
        {
           
           
            System.out.print(arr[i]);
           
                
        }
            
        
       
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter  Limit");
        int m=sc.nextInt();
        while(m > 15 || m< 5) {
	  System.out.println("Invalid input. Try Again With values b/w 5 and 15");
	m=sc.nextInt();
        }
        int [] arr=new int[m];
        
	 System.out.println("Enter Array Elements");
        for(int i=0;i<m;i++)
        {
           
           
            arr[i]=sc.nextInt();
     while(arr[i] > 200 ) {
	  System.out.println("Invalid input. try with <=200");
	arr[i]=sc.nextInt();
        }
           
                
        }
        
        subarraySum(arr);
        
       
    }
}