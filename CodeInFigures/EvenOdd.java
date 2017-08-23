import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("is even");
        else if (num % 2 == 1)
            System.out.println("is odd");
    }
}
