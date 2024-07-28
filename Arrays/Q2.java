package Arrays;

import java.util.PriorityQueue;

/* Question - java program to find the kth smallest element in an array 
 * Intution - use a Priority Queue, as it arranges the element as per the priority
 */
public class Q2 {
    public static void main(String[] args){
        int [] arr = { 2, 1, 5, 7, 9, 35, 19, 96, 8, 5, 9, 54};
        int k = 2;
        System.out.println(lgElement(arr, k));

    }
    static int lgElement(int[] arr, int k){
        PriorityQueue<Integer> knumbers = new PriorityQueue<>((n1, n2) -> n2 - n1);
        for(int i = 0; i < k; i++){
            knumbers.add(arr[i]);
        }
        //loop through the remaining element in the array
        for(int i = k; i < arr.length; i++){
            if(arr[i] < knumbers.peek()){
                knumbers.poll();
                knumbers.add(arr[i]);
            }
        }
        return knumbers.peek();
    }
}
