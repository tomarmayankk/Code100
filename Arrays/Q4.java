package Arrays;
//java program to reverse an array
public class Q4 {
    public static void main(String[] args){
        int [] arr = {1, 2, 4, 3, 5};
        reverse(arr);
    }
    static void reverse(int[] arr){
        int start = 0;
        int n = arr.length;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<n; i++)
        System.out.print(arr[i]+" "); 
     }
}   
