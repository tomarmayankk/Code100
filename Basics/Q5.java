package Basics;
//greatest of three numbers
public class Q5 {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 9;
        int num3 = 333;
        if(num1 == num2 && num2 == num3){
            System.out.println("all are equal");
        }else if (num1 > num2 && num1 > num3) {
            System.out.println(  num1 + " is bigger");       
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(  num2 + " is bigger");       
        }else System.out.println(num3 + " is bigger than ");
    }
}
