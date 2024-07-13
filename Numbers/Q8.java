package Numbers;
//java program to exress a number as the sum of two prime numbers
public class Q8 {
    public static void main(String[] args){
        int number = 14;
        System.out.println(canExpress(number));
    }
    static boolean canExpress(int n){
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return true;
            }
        }
        return false;
    }
    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i =2; i <= Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        } return true;
    }
}
