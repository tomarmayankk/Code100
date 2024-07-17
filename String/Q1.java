package String;
//write a java program to print all the permutations of a string
public class Q1 {
    public static void main(String[] args){
        String str = "Hey";
        printPermutation(str, " ");

    }
    static void printPermutation(String str, String prefix){
        int n  = str.length();
        if(n==0){
            System.out.print(prefix);
        }
        for(int i = 0; i<n; i++){
            printPermutation(str.substring(0, i) + str.substring(i+1), prefix + str.charAt(i));
        }
    }
}
