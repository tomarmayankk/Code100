package Recursion;
//java program to find power of number
public class Q1 {
    public static void main(String[] args){
        int base = 10;
        int x = 2;
        System.out.println(calPower(base, x));

    }
    static int calPower(int base, int x){
        if(x ==0){
            return 1;
        }
        return (base * calPower(base, x-1));
    }
}
