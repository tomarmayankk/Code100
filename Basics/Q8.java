package Basics;
//java program to find the sum of digits of a given number
public class Q8 {
    public static void main(String[] args){
        System.out.println(getSum(55, 0));

    }
    static int getSum(int n, int sum){
        if(n == 0){
            return sum;
        }
        return (n % 10) + getSum(n/10, sum);
    }
}

