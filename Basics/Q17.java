package Basics;
// Java program to find the prime factors of a given number
public class Q17 {
    public static void main(String[] args){
        int n = 12;
        for(int i = 1; i< n; i++){
            if(isPrime(i) && n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }else if(n == 2){
            return true;
        }
        for(int i = 2; i< n; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}