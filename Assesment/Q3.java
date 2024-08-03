package Assesment;

import java.util.Arrays;

//question - Write a program to find the nth largest and nth smallest item in the array and print them in the same line.
public class Q3 {
    public static void getElement(int m, int n, int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[n-1] + " " + arr[m-n]);

    }
    public static void main(String[] args){
        int n = 3;
        int m = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        getElement(m, n, arr);
    }
}
