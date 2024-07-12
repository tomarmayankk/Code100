package Basics;
//java program to find the nth term of the fibonacci series
public class Q14 {
    public static void main(String[] args){
        int n = 10;
        int nth = 9;
        //print the series
        for(int i = 1; i< n; i++){
            System.out.print(fibonacci(i)+ " ");
        }
        System.out.println(nthTerm(nth));

    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    //nth term of the series
    static int nthTerm(int n){
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}


