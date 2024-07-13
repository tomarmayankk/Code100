package Numbers;
//java program to find the LCM
public class Q2 {
    public static void main(String[] args){
        int a = 8;
        int b = 12;
        int max = (a>b) ? a : b;

        for(int i = max; i <= a*b; i++){
            if(i % a == 0 && i % b == 0){
                System.out.println("LCM is: " + i);
                break;
            }
        }
    }
}
