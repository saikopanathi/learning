import java.util.Scanner;
public class Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            //if (arr[i] < min) {
             //   min = arr[i];
           // }
           min = Math.min(min,arr[i]);
        }
        
        System.out.println("The minimum value in the array is" + min);
        
        scan.close();
    }
}