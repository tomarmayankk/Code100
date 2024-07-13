package Numbers;
/* Question - Permutations in which n people can occupy r seats in a classroom in java
 * Description - https://prepinsta.com/java-program/permutations-in-which-n-people-can-occupy-r-seats-in-a-classroom/
 */
public class Q4 {
    public static void main(String[] args){
        int n = 5;
        int r = 9;
        System.out.println(Permutations(n, r));

    }
    static int Permutations(int n, int r){
        int fact1 =1; //fact1 is factorial of n
        int fact2 =1;//factorial of  n-r
        int number = n-r;

        for(int i = n; i > 1; i--){
            fact1 = fact1*i;
        }
        for(int i = number; i > 1; i--){
            fact2 = fact2* i;
        }
        int per = fact1/fact2;
        return per;
    }
}
