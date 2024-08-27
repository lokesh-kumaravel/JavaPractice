import java.util.*;
public class CoinGame
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++)
        {
            int n = s.nextInt();
            ArrayList<Integer> k = find(n);
            Iterator<Integer> itr = k.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> find(int n)
    {
        int[] coin = {1,2,5,10,20,50,100,200,500,1000};
        int[] dp = new int[n+1];
        int[] prev = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0;i<10;i++)
        {
            for(int j = coin[i];j<n+1;j++)
            {
                if(dp[j-coin[i]]<dp[j])
                {
                    dp[j] = dp[j-coin[i]]+1;
                    prev[j] = coin[i];
                }
            }
        }
        int current = n;
        ArrayList<Integer> result = new ArrayList<>();
        while(current>0)
        {
            result.add(prev[current]);
            current = current - prev[current];
        }
        return result;
    }
}
// import java.util.*;
// public class CoinGame {
//     public static void main(String[] args) {
//         int n = 43;
//         System.out.println(find(n));
//     }
//     private static ArrayList<Integer> find(int n) {
//         int[] coin = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
//         ArrayList<Integer>[] a = new ArrayList[n + 1];
//         for (int i = 1; i <= 10; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (coin[i - 1] == j) {
//                     ArrayList<Integer> temp = new ArrayList<>();
//                     temp.add(coin[i - 1]);
//                     a[j] = temp;
//                 } else if (coin[i - 1] < j) {
//                     ArrayList<Integer> temp = new ArrayList<>();
//                     temp.add(coin[i - 1]);
//                     temp.addAll(a[j - coin[i - 1]]);
//                     a[j] = temp;
//                 } else {

//                 }
//             }
//         }
//         // print(n, a);
//         return a[n];
//     }
//     static void print(int n, ArrayList<Integer>[] mat) {
//         System.out.println("a");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(mat[i] + " ");
//         }
//     }
// }
// public class Main1 {
// public static void main(String[] args) {
// int n = 3;
// int[] p = {0,4,5,6};
// int[] w = {0,1,2,3};
// int target = 1;
// int[][] a = new int[n+1][target+1];
// for(int i = 1;i<=n;i++)
// {
// for(int j = 1;j<=target;j++)
// {
// if(w[i]<=j)
// {
// int taken = a[i-1][j];
// int not_taken = a[i-1][j-w[i]]+p[i];
// int maxi = Math.max(taken, not_taken);
// a[i][j] = maxi;
// }
// else{
// a[i][j] = a[i-1][j];
// }
// }
// }
// System.out.println(a[n][target]);
// }
// }
// // import java.util.*;
// // public class Main1 {
// // public static void main(String[] args)
// // {
// // Scanner s = new Scanner(System.in);
// // int n = 9;
// // int[] a = {1,4,5,-1,2,-1,-2,2,7};
// // int max = Integer.MIN_VALUE;
// // for(int i = 0;i<n;i++)
// // {
// // int sum = a[i];
// // for(int j = i+1;j<n;j++)
// // {
// // sum+=a[j];
// // if(sum>max)
// // {
// // max = sum;
// // }
// // }
// // }
// // System.out.println(max);
// // }
// // }