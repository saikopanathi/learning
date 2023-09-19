public class Palindrome {
    public static void main(String [] args)
    {
        int num = 121;
        int a = num;
        int sum = 0;
        while (num > 0)
        {
            int rev = num % 10;
            sum = sum * 10 + rev;
            num = num / 10;
        }
        if(a==sum)
        { 
            System.out.println(" it is a palindrome");
        }
        else
        {
            System.out.println("it is a not palindrome");
        }
        
    }
    
}
