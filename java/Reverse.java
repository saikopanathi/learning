import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
    }
    public static int reverse(int n) {
        int reversenumber = 0;
        while (n!= 0) {
            int digit = n%10;
            reversenumber = reversenumber * 10 + digit;
            n= n/10;
        }
        return reversedNumber;
    }
}




