import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.print("The largest number is: " + num1);
        }else{
            System.out.print("The largest number is: " + num2);
        }
    }
}
