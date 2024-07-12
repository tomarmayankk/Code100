package Basics;
//sum of first n natural numbers
public class Q3 {
    public static void main(String[] args){
        int n = 10;
        System.out.println(giveSum(n));
    }
    static int giveSum(int n){
        if(n == 1){
            return 1;
        }
        return n + giveSum(n-1);
    }
}
