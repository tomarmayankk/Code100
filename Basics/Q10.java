package Basics;
//write a java program to find the palindrome of a number
public class Q10 {
    public static void main(String[] args){
        int n = 12212;
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int n){
        if(revNumber(n) == n){
            return true;
        }
        return false;

    }
    //function to reverse the number
    static int revNumber(int n){
        int reverse = 0;
        while(n > 0){
            int digit =  n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }
}
