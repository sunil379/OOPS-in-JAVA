package practical_1;
/**
 * Practical No. 1
 * The SumDigit class provides a method to calculate the sum of digits of a given number.
 * It uses a Scanner to get user input and implements a method
 * to compute the sum of digits.
 */
import java.util.Scanner;

public class SumDigit {

    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");
            int n = sc.nextInt();
            int sum = sumOfDigits(n);
            System.out.println("The Sum of the four digit number is "+ sum);
        }
    }
}