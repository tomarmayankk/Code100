package String;
//java program to remove all the characters from a string except alphabets
public class Q6 {
    public static void main(String[] args){
    String s = "hel1456lo56wor%^ld";
     s=s.replaceAll("[^a-zA-Z]","");
     System.out.println(s);
    }
}
