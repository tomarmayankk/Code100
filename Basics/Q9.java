package Basics;
//Write a java program to reverse a number
public class Q9 {
    public static void main(String[] args){
        int n =13416;
        System.out.println(revNumber(n));
    } 
    static int revNumber(int n){
        int reverse = 0;
        while(n > 0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }
}
