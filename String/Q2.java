package String;
//java program to check that the string has vovels or not
public class Q2 {
    public static void main(String[] args) {
        String str = "heyAnkit";
        boolean hasVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break; // Exit the loop as we found a vowel
            }
        }
        if (hasVowel) {
            System.out.println("The string has vowels");
        } else {
            System.out.println("The string has no vowels");
        }
    }
}
