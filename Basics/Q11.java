package Basics;
//write a java program to check for the armstrong number
public class Q11 {
    public static void main(String[] args){
        int n = 723;
        int len = String.valueOf(n).length();
        System.out.println(isArmstrong(n, len));
    }
    static boolean isArmstrong(int n, int len){
        int orgNumber = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, len);
            n = n/10;
        }
        return sum == orgNumber;
    }
}
