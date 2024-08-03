package Assesment;
/* Question - given a string with characters repeating consicutively. you have to write it downn mathematically as given.
 * Example - Input : aabbbbeeeeffggg || Output: a2b4e4f2g3
 */
public class Q1 {
    static String retrunString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            int count = 1;
            while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i)).append(count);
        }
        return sb.toString();
    }
    public static void main(String[] args){ 
        String input = "aabbbbeeeeffggg";
        String result = retrunString(input);
        System.out.println(result);
    }
}

