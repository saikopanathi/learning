import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            //if (arr[i] > max) {
              //  max = arr[i];
          //  }
           max= Math.max(max,arr[i]);
        }
        System.out.println("The maximum value in the array is" + max);

        scan.close();
    }
}