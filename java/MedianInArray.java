import java.util.Scanner;

public class MedianInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scan.nextInt();
        System.out.println("Enter " + n + " integers:");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        double median;
        if (n % 2 == 0) {
            int middle1 = num[n / 2 - 1];
            int middle2 = num[n / 2];
            median = (double) (middle1 + middle2) / 2;
        } else {
            median = num[n / 2];
        }

        System.out.println("The median is: " + median);
        scan.close();
    }
}