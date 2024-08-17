import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int enter = num.nextInt();
        while (enter < 1 || enter > 10) {
            System.out.print(enter + " is out of range, please try again: ");
            enter = num.nextInt();
        }

        System.out.println("Thanks");
    }
}
