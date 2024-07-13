package Numbers;
//java program to replace all zeros to one
public class Q7 {
    public static void main(String[] args){
        int n = 908690764;
        String str = Integer.toString(n);

        String cleaned = str.replaceAll("0", "1");
        System.out.println(cleaned);
    }
}
