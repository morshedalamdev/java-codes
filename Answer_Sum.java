import java.util.Scanner;
import java.util.Random;

public class Answer_Sum {
    public static void main(String[] args){
        Random rand = new Random();

        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1; 
        int sum = num1 + num2;

        System.out.println("What is the sum of " + num1 + " and " + num2 + "? ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer: ");
        int guess = input.nextInt();

        if (guess == sum) {
            System.out.println("Correct! The sum is " + sum);
        } else {
            System.out.println("Wrong! The correct answer is " + sum);
        }
        input.close();
    }
}