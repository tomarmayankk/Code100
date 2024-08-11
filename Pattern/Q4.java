package Pattern;
/* java program to print:
          *
          **
          ***
          ****
    Print hollow square with the help of row and col
 */
public class Q4 {
    public static void main(String[] args){
        int n = 4;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
