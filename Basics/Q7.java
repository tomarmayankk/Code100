package Basics;
//check a number is prime or not in a given range
public class Q7 {
    public static void main(String[] args){
        int start = 1;
        int end = 20;

        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if( n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            } 
        }
        return true;
    }
}
