import java.util.Scanner;
    public class PlindromeImport {
        public static void main(String [] args)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("enter a number");
            int number = scan.nextInt();
            scan.close();
        int a = number;
        int sum = 0;
        while (number > 0)
        {
            int digit = number % 10;
            sum= sum * 10 + digit;
            number = number / 10;

        }
        if ( a==sum)
        {
            System.out.println(" it is a paindrome"+ a );
        }
        else{
            System.out.println("it is a not palinrome"+ a );
        }
    }
}
