package Recursion;
// java program to reverse a number using recursion
public class Q5 {
    public static void main(String[] args){
        int n = 1234;
        System.out.println(reverse(n, 0));
    }
    
    static int reverse(int n, int rev){
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverse(n / 10, rev);
    }
}
