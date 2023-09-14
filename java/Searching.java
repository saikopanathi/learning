import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        int elementToFind = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToFind) {
                found = true;
                System.out.println("Element " + elementToFind + i);
                break; 
            }
        }

        if (!found) {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }

        scan.close();
    }
}