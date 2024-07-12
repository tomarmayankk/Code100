package Basics;
//java program to find the factorial od a number
public class Q15 {
    public static void main(String[] args){
        int n = 10;
        System.out.println(factorial(n));
    }
    //recursive function to check the factorial of a number
    static double factorial(int n){
        if(n == 2){
            return n;
        }
        return n * factorial(n-1);
    }
}

