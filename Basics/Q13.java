package Basics;
//java program to find the fibonacci number till the nth term
public class Q13 {
    public static void main(String[] args){
        int n = 10;
        for(int i = 0; i< n; i++){
            System.out.print(fibonacci(i)+ " ");
        }

    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
