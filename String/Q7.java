package String;
//java program to calculate the sum of characters in a string
public class Q7 {
    public static void main(String[] args){
        String str = "1Hey23A5n7kit";
        System.out.println(getSum(str));
    }
    static int getSum(String str){
        int sum = 0;
        for (int i = 0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum+Character.getNumericValue(str.charAt(i));
            }
        } return sum;
    }
}
