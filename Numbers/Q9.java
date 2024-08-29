package Numbers;
//number of digits in an integer
public class Q9 {
    public static void main(String[] args){
        int n = 123444567;
        int digit = 0;
        while (n!= 0) {
            n = n/10;
            digit++;
        }
        System.out.println(digit);
    }
}
