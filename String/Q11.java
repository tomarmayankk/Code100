package String;
//java program to replace a substring in a string
public class Q11 {
    public static void main(String[] args){
        String original = "HeyAnkit";
        String toReplace = "Ankit";
        String replaceWtih = "Abhishek";
        System.out.println(replace(original, toReplace, replaceWtih));
    }
    static String replace(String s1, String s2, String s3){
        if(!s1.contains(s2)){
            System.out.println("can not replace");
        }
        s3 = s1.replaceAll(s2, s3);
        return s3;
    }
}
