package Basics;
//sum of numbers in range
public class Q4 {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println(getSum(0, a, b));
    }
    static int getSum(int sum, int i, int b){
        if (i > b) {
            return sum;
        }
        return i + getSum(sum, i+1, b);
    }
}

