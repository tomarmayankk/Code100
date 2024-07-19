package Recursion;

import java.util.HashMap;

//java program to find the permutations of string
public class Q7 {
    public static void main(String[] args){
        String str = "ABC";
        System.out.println(permutaion(str));

    }
    static int permutaion(String str){
        int length = str.length();
        int factorial = factorial(length);
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c: str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0)+ 1);
        }

        for(int count: charCountMap.values()){
            factorial /= factorial(count);
        }
        return factorial;
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
}
