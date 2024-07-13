package Numbers;
/* Question - Maximum number of handshakes
 * Description - https://prepinsta.com/java-program/maximum-number-of-handshakes/
 */
public class Q5 {
    public static void main(String[] args){
        int n = 30;
        System.out.println(noHandshakes(n));

    }
    static int noHandshakes(int n){
        int handshakes = (n*(n-1))/2;
        return handshakes;
    }
}
