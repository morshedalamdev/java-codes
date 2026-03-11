import java.util.Scanner;

public class Display_time {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remaining_seconds = seconds % 60;

        System.out.println(seconds + " seconds = " + minutes + " minutes and " + remaining_seconds + " seconds.");

        input.close();
    }
}
