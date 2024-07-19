package Recursion;
//java program to find a number is prime or not using recursion
public class Q2 {
    public static void main(String[] args){
        int n = 12;
        int i = 2;
        System.out.println(isPrime(n, i));
    }
    static boolean isPrime(int n, int i){
        if(n<=2){
            return (n==2) ? true: false;
        }
        if(n % i == 0){
            return false;
        }
        if(i*i > n){
            return true;
        }
        return isPrime(n, i+1);
    }
}
