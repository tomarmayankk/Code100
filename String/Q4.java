package String;
//java program to remove the vovels from a string
public class Q4 {
     public static void main(String[] args){
        String str = "heyAnkit";
        String cleaned = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(cleaned);
     }
}
