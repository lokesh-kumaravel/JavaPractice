public class Main1 {
    public static void main(String[] args) {
        int[] a = {0,1,1,2,2,2,2,3,3,3,3,3,4};
        int n = 12;
        int[] b = new int[n];
        int[] freq = new int[n];
        for(int i = 0;i<n;i++)
        {
            int k = a[i];
            b[a[i]]++;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}