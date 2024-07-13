package Numbers;
//finding the number of times a digit appears in a number using string
public class Q10 {
    public static void main(String[] args){
        int number = 123232;
        String str = Integer.toString(number);
        int target = '2';
        int count = 0;

        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == target ){
                count++;
            }
        } System.out.println(count);
    }
}
