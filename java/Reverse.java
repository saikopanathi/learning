import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int sum =0;
        while (number>0)
        {
            int digit = number % 10;
            sum = sum *10 + digit ;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
       

