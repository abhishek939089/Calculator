import java.util.Scanner;

public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.print("The smallest number is: " + num2);
        }else{
            System.out.print("The smallest number is: " + num1);
        }
    }
}
