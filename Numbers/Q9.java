package Numbers;
//number of digits in an integer
public class Q9 {
    public static void main(String[] args){
        int integer = 1234568756;
        int digit = 0;

        while (integer!= 0) {
            int n = integer % 10;
            digit++;
            integer = integer/10;
        }
        System.out.println(digit);
    }
}
