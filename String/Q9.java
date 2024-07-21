package String;
//java program to find the non repeating character in a string
public class Q9 {
    public static void main(String[] args){
        String str = "HeyAnkitHey";
        nonRepeating(str);
    }
    static void nonRepeating(String str){
        for(char i: str.toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println(i);
                break;
            }
        }
    }
}

