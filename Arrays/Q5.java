package Arrays;
import java.util.Arrays;
//java program to sort the first half of array in ascending and the second half in descending
public class Q5 {
    public static void main(String[] args){
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        ascendingDescending(arr);

    }
    static void ascendingDescending(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i<n/2; i++){
            System.out.print(arr[i]+" ");
        }
        for(int j = n-1; j >= n/2; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
