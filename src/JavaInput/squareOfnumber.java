package JavaInput;
import java.util.Scanner;
public class squareOfnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        int square = x * x;
        System.out.println("The square of number is "+square);
    }
}
