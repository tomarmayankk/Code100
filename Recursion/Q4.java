package Recursion;
//java program to find the smallest element in an array
public class Q4 {
    public static void main(String[] args){
        int[] array = {12, 7, 9, 21, 13, 5};
        int n = array.length;

        int smallest = smElement(array, n);
        System.out.println(smallest);
    }
    static int smElement(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        int minIndex = smElement(arr, n-1);
        return Math.min(arr[n-1], minIndex);
    }
}
