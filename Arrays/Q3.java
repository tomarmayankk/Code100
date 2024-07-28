package Arrays;
//java program to find the sum of elements of an array
public class Q3 {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 1, 9, 4, 5, 20, 45, 12};
        System.out.println(sum(arr));
    }
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
