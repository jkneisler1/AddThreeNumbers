// YHis little sister now wants a program to read three numbers, add them together and print their total.
import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int addThree;
        int total = 0;

        for(int i = 0; i < 3; i++) {
            addThree = key.nextInt();
            total += addThree;
        }
        System.out.println("The final result: " + total);
    }
}
