package Recursion;
//java program to find the length of string using Recursion
public class Q6 {
    public static void main(String[] args){
        String str = "HyeMayMay";
        System.out.println(findLength(str));
    }
    static int findLength(String str){
        if(str.equals("")){
            return 0;
        }
        return findLength(str.substring(1)) + 1;
    }
}
