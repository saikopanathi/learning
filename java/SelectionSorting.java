public class SelectionSorting {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 2, 9, 1, 7 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int minIndx = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndx = j;
                }
            }

            // if(minIndx != i) {
            int temp = a[i]; 
            a[i] = a[minIndx];
            a[minIndx] = temp;
            // }
        }

        for (int i=0;i <= n - 1;i++) //
        {
            System.out.println(a[i]); //
        }
    }

}
