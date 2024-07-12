package Basics;
//java program to check that the number is storng or not
public class Q18 {
    public static void main(String[] args){
        int n = 145;
        System.out.println(isStrong(n));
    }
    static boolean isStrong(int n){
         int orgNumber = n;
         int sum = 0;
         while(n > 0){
             int digit = n % 10;
             sum = sum + factorial(digit);
             n = n/10; 
         }
         return sum == orgNumber;
     }
    static int factorial(int n){
        int fact = 1;
        for(int i = n; i > 1; i--){
            fact = fact * i;
        }
        return fact;
    }
}


