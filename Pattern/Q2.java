package Pattern;
/* java program to print:
          *****
          *   *
          *   *
          *****
    Print hollow square with the help of row and col
 */
public class Q2 {
    public static void main(String[] args){
        int row = 4;
        int col = 5;
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                if((i == 1 || i == row) || (j == 1 || j == col)){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
