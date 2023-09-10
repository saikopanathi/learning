public class EvenOddCheck {
    public static void main (String[] args) {
        if(args.length>0) {
            int val=Integer.parseInt(args[0]);
            if(val%2==0)
            {
                System.out.println("given number is even");

            }
            else
            {
                System.out.println("given number is odd");
            }
        }
    }
}
