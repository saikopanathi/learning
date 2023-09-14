import java.util.Scanner;
public class PrimeNumbers
{
    public static void main (String[] args) {
        int num,count=0;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter a number");
        num = s.nextInt();

            for(int i=2; i<num; i++)
            {
                if(num%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("it is a primenumber");
            }
            else
            {
                System.out.println("it is a not primenumber");
            }
    }
}