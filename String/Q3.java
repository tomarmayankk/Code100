package String;
//java program to find the length of string using recursion
public class Q3 {
    public static void main(String[] args){
        String str = "heyAnkit";
        System.out.println(getSize(str));
    }
    static int getSize(String str){
        if(str.equals("")){
            return 0;
        }
        return getSize(str.substring(1)) + 1;
        
    }
}
