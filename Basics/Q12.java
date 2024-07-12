package Basics;
//find the armstrong number in a given range, Example - Armstrong numbers between 1 to 1000;
public class Q12 {
    public static void main(String[] args){
        int low = 1;
        int high  = 1000;
        for(int i = low; i< high; i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int len = String.valueOf(n).length();
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

