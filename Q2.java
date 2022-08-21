/*
Q2.You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash 
them together. Suppose the heaviest two stones have weights x and y with x <= y
*/
import java.util.*;

class Q2 {
    static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }
        
        while (heap.size() > 1) {
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            
            if (stone1 - stone2 != 0) {
                heap.add(stone1 - stone2);
            }
            
        }
        return heap.isEmpty() ? 0 : heap.remove();
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter Limit");
        int m=sc.nextInt();
        
        
        int [] arr=new int[10];
        System.out.println("Enter Array Values");
        for(int i=0;i<m;i++)
        {
          
            arr[i]=sc.nextInt();
           
                
        }
        
       
        
         System.out.println(lastStoneWeight(arr));
        
       
    }
}