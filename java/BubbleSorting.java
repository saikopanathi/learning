public class BubbleSorting {
    public static void main (String[] args) {
        int [] a = { 1,8,6,7,3,4,2};
        int n = a.length;
        for ( int i=0;i<=n-1;i++)
        {
            for ( int j=0;j<=n-i-2;j++)
            {                   //  j = 0
                if(a[j]>a[j+1]) //  1 > 8
                {
                    int c = a[j];   //  
                    a[j] = a[j+1];  //
                    a[j+1]=c;       //
                }
            }
        }
        for (int i=0;i <= n - 1;i++) //
        {
            System.out.println(a[i]); //
        }
    }
    
}
