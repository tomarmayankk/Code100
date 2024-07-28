package Arrays;
//write a java program to find the maximum element in an array
public class Q1 {
    public static void main(String[] args){
        int [] arr = { 2, 1, 5, 7, 9, 19, 96, 8, 5, 9};
        System.out.println(maxElement(arr));
    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
