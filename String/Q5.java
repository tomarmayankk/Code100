package String;
//toggle each character in a string (if a character is in lower case, then turn it into uppercase, and turn uppercase to lower case)
public class Q5 {
    public static void main(String[] args){
        String str = "HeyAnkIt";
        System.out.println(toggle(str));
    }
    static String toggle(String str){
        String s1 = "";
        for(int i = 0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                s1 = s1+Character.toLowerCase(str.charAt(i));
            }
            else{
                s1 = s1+Character.toUpperCase(str.charAt(i));
            }
        }
        return s1;
    }
}
