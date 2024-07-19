package Recursion;
//java program to find the largest element in an array
public class Q3 {
    public static void main(String[] args){
        int[] array = {12, 7, 9, 21, 13, 5};
        int n = array.length;

        int largest = larElement(array, n);
        System.out.println(largest);

    }
    static int larElement(int[] array, int n){
        if(n==0){
            return array[0];
        }
        int maxIndex = larElement(array, n-1);
        return Math.max(array[n-1], maxIndex);
    }
}
