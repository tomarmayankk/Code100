package Numbers;
//Java program for binary to decimal conversion
public class Q3 {
    public static void main(String[] args){
        int binary = 100101;
        double decimal = 0;
        int n = 0;

        while(binary > 0){
            int digit = binary % 10;
            decimal = decimal + digit*Math.pow(2, n);
            binary = binary/10;
            n++;
        }
        System.out.println(decimal);
    }
    
}
