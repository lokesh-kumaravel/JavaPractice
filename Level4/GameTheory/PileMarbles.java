package Level4.GameTheory;

import java.util.*;

public class PileMarbles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.replace("[", "").replace("]", "");
        String[] k = str.split(",");
        int[] arr = new int[k.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(k[i]);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        int n = arr.length;
        boolean result = find(a, n);
        System.out.println(result);
    }

    private static boolean find(ArrayList<Integer> a, int n) {
        int f1 = 0;
        int f2 = 0;
        int c = 0;
        int d = 0;
        while (c < n) {
            int n1 = a.get(d);
            a.remove(d);
            int n2 = a.get(a.size() - 1);
            if (n1 == n2) {
                n2 = 0;
            }
            if (c % 2 == 0) {
                if (n1 > n2) {
                    f1 += n1;
                    a.add(n2);
                } else {
                    f1 += n2;
                    a.add(n1);
                }
            } else {
                if (n1 > n2) {
                    f2 += n1;
                    a.add(n2);
                } else {
                    f2 += n2;
                    a.add(n1);
                }
            }
            c++;
            if (c > n) {
                break;
            }
        }
        if (f1 > f2) {
            return true;
        } else {
            return false;
        }
    }
}

// import java.util.*;
// public class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         String[] s=str.replaceAll("\\[","").replaceAll("\\]","").split(",");
//         int[] arr=new int[s.length];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         boolean f=true;
//         int rc=0,kc=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(f)
//             {
//                 rc+=arr[i];
//                 f=false;
//             }
//             else
//             {
//                 kc+=arr[i];
//                 f=true;
//             }
//         }
//         if(rc>kc)
//         {
//         System.out.println("true");
            
//         }
//         else
//         {
            
//         System.out.println("false");
//         }
//     }
// }
