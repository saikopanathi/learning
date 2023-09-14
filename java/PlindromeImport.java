import java.util.Scanner;
{
    public class PalindromeImport {
        public static void main(String [] args)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println("enter a number");
            int num = scan.nextInt();
            scan.close();
        }
        int a = num;
        int sum = 0;
        while (num > 0)
        {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num = num / 10;

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
