package String;
import java.util.Arrays;
//java program to check that the given string is anagram or not
public class Q10 {
    public static void main(String[] args){
        String str1 = "prep";
        String str2 = "repp";
        System.out.println(isAnagram(str1, str2));
    }
    static boolean isAnagram(String str1, String str2){
        Boolean status = true;
        String s1 = str1.replaceAll("[\\s]", "");
        String s2 = str2.replaceAll("[\\s]", "");
        if(s1.length()!= s2.length()){
            status = false;
        }
        else {
         char[] a1 = s1.toLowerCase().toCharArray();
         char[] a2 = s2.toLowerCase().toCharArray();
         Arrays.sort(a1);
         Arrays.sort(a2);
         status = Arrays.equals(a1, a2);
       }
       return status;
    }
}
