package Assesment;
/* Question - You are given an array of length “len” ,another item called k and an integer value x.
 * Your job is to find the sum of k farthest items in the array from x.
 * Example - Input : len-5, k-3, x-20, array- 21 4 15 17 11
 * Output : 39 (since 4, 11, and 15 are the farthest from 20)
 */
import java.util.*;
public class Q2 {
    
    static int getSum(int len, int k, int x, int[] arr) {
        List<int[]> newList = new ArrayList<>();
        for (int value : arr) {
            int distance = Math.abs(value - x);
            newList.add(new int[]{distance, value});
        }
        newList.sort((a, b) -> Integer.compare(b[0], a[0]));

        // to get sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += newList.get(i)[1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int len = 5;
        int k = 3;
        int x = 20;
        int[] arr = {21, 4, 15, 17, 11};
        int result = getSum(len, k, x, arr);
        System.out.println(result); // Expected output: 39
    }
}
