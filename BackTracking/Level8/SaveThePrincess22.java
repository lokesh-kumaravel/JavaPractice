package Level8;

import java.util.*;

public class SaveThePrincess22 {
    public static int count = 0;
    public static String[] stri = { "B....", ".X...", "..X.X", "......", "...X.", "..X..", "....T" };
    public static char[][] a = new char[5 + 2][5];
    public static char[][] solution = new char[5 + 2][5];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                solution[i][j] = '0';
            }
        }
        int n = 5;
        int m = 5;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 2; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n + 2; i++) {
            String str = stri[i];
            for (int j = 0; j < m; j++) {
                a[i][j] = str.charAt(j);
                if (a[i][j] == 'X') {
                    list.get(i).add(j);
                }
            }
        }
        // System.out.println(list);
        // for(int u = 0;u<n+2;u++)
        // {
        // ArrayList<Integer> change = new ArrayList<>();
        // if(list.get(u).size()>0)
        // {
        // for(int ll = 0;ll<m;ll++)
        // {
        // a[u][ll] = '.';
        // }
        // if(u%2!=0)//-->
        // {
        // for(int j = list.get(u).size()-1;j>=0;j--)
        // {
        // int l = list.get(u).get(j);
        // if(l+1<m)
        // {
        // a[u][l+1] = 'X';
        // change.add(l+1);
        // }
        // else{
        // a[u][0] = 'X';
        // change.add(0);
        // }
        // }
        // }
        // else if(u%2==0)//<--
        // {
        // for(int j = 0;j<list.get(u).size();j++)
        // {
        // int l = list.get(u).get(j);
        // if(l-1>=0)
        // {
        // a[u][l-1] = 'X';
        // change.add(l-1);
        // }
        // else{
        // a[u][m-1] = 'X';
        // change.add(m-1);
        // }
        // }
        // }
        // list.set(u,change);
        // }
        // }
        // System.out.println();
        // System.out.println(list);
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        track(0, 0, n, m, list);

        // track(0,0,n,m,list);
        // for(int i = 0;i<n+2;i++)
        // {
        // for(int j = 0;j<m;j++)
        // {
        // System.out.print(a[i][j]);
        // }
        // System.out.println();
        // }
        // System.out.println();
        // track(0,0,n,m,list);
        // track(0,0,n,m,list);
        // track(0,0,n,m,list);
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // System.out.println(list);
        // System.out.println(list.size());

    }

    public static boolean track(int i, int j, int n, int m, List<List<Integer>> list) {
        if (i == n + 1 && j == m - 1) {
            // count++;
            a[i][j] = '1';
            solution[i][j] = '1';
            System.out.println(count);
            return true;
        }
        if (i >= 0 && i < n + 2 && j >= 0 && j < m && (a[i][j] == '.' || a[i][j] == 'B')) {
            // System.out.println("KJ");
            count++;
            // a[i][j] = '1';
            solution[i][j] = '1';
            if (track(i + 1, j, n, m, list) && monstermoves(n, m, list)) {
                // count++;
                return true;
            }
            if (track(i, j + 1, n, m, list) && monstermoves(n, m, list)) {
                // count++;
                return true;
            }
            if (track(i - 1, j, n, m, list) && monstermoves(n, m, list)) {
                // count++;
                return true;
            }
            if (track(i, j - 1, n, m, list) && monstermoves(n, m, list)) {
                // count++;
                return true;
            }
            // a[i][j] = '.';
            solution[i][j] = '0';
            count--;
            return false;
        }
        return false;
    }

    public static boolean monstermoves(int n, int m, List<List<Integer>> list) {
        // for(int i = 0;i<n+2;i++)
        // {
        // for(int j = 0;j<m;j++)
        // {
        // System.out.print(a[i][j]);
        // }
        // System.out.println();
        // }
        // System.out.println();
        // System.out.println(list);
        for (int u = 0; u < n + 2; u++) {
            ArrayList<Integer> change = new ArrayList<>();
            if (list.get(u).size() > 0) {
                for (int ll = 0; ll < m; ll++) {
                    a[u][ll] = '.';
                }
                if (u % 2 != 0)// -->
                {
                    for (int j = list.get(u).size() - 1; j >= 0; j--) {
                        int l = list.get(u).get(j);
                        if (l + 1 < m) {
                            a[u][l + 1] = 'X';
                            change.add(l + 1);
                        } else {
                            a[u][0] = 'X';
                            change.add(0);
                        }
                    }
                } else if (u % 2 == 0)// <--
                {
                    for (int j = 0; j < list.get(u).size(); j++) {
                        int l = list.get(u).get(j);
                        if (l - 1 >= 0) {
                            a[u][l - 1] = 'X';
                            change.add(l - 1);
                        } else {
                            a[u][m - 1] = 'X';
                            change.add(m - 1);
                        }
                    }
                }
                list.set(u, change);
            }
        }
        return true;
    }
}
