import java.util.*;

public class KnightsMove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        str1 = str1.replace("a", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr1 = str1.toCharArray();
        String str2 = s.nextLine();
        str2 = str2.replace("b", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr2 = str2.toCharArray();
        String str3 = s.nextLine();
        str3 = str3.replace("c", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr3 = str3.toCharArray();
        String str4 = s.nextLine();
        str4 = str4.replace("d", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr4 = str4.toCharArray();
        String str5 = s.nextLine();
        str5 = str5.replace("e", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr5 = str5.toCharArray();
        String str6 = s.nextLine();
        str6 = str6.replace("f", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr6 = str6.toCharArray();
        String str7 = s.nextLine();
        str7 = str7.replace("g", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr7 = str7.toCharArray();
        String str8 = s.nextLine();
        str8 = str8.replace("h", "").replace(":", "").replace(" ", "").replace(",", "");
        char[] arr8 = str8.toCharArray();
        s.close();
        char[][] a = new char[8][8];
        int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
        for (int i = 0; i < 8; i++) {
            if (arr1[i] == 'S') {
                r1 = 0;
                c1 = i;
            } else if (arr1[i] == 'X') {
                r2 = 0;
                c2 = i;
            }
            a[0][i] = arr1[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr2[i] == 'S') {
                r1 = 1;
                c1 = i;
            } else if (arr2[i] == 'X') {
                r2 = 1;
                c2 = i;
            }
            a[1][i] = arr2[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr3[i] == 'S') {
                r1 = 2;
                c1 = i;
            } else if (arr3[i] == 'X') {
                r2 = 2;
                c2 = i;
            }
            a[2][i] = arr3[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr4[i] == 'S') {
                r1 = 3;
                c1 = i;
            } else if (arr4[i] == 'X') {
                r2 = 3;
                c2 = i;
            }
            a[3][i] = arr4[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr5[i] == 'S') {
                r1 = 4;
                c1 = i;
            } else if (arr5[i] == 'X') {
                r2 = 4;
                c2 = i;
            }
            a[4][i] = arr5[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr6[i] == 'S') {
                r1 = 5;
                c1 = i;
            } else if (arr6[i] == 'X') {
                r2 = 5;
                c2 = i;
            }
            a[5][i] = arr6[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr7[i] == 'S') {
                r1 = 6;
                c1 = i;
            } else if (arr7[i] == 'X') {
                r2 = 6;
                c2 = i;
            }
            a[6][i] = arr7[i];
        }
        for (int i = 0; i < 8; i++) {
            if (arr8[i] == 'S') {
                r1 = 7;
                c1 = i;
            } else if (arr8[i] == 'X') {
                r2 = 7;
                c2 = i;
            }
            a[7][i] = arr8[i];
        }
        a[r1][c1] = '0';
        if (find(r1, c1, r2, c2, a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean find(int i, int j, int dr, int dc, char[][] a) {
        if (i == dr && j == dc && a[i][j] == 'X') {
            return true;
        }
        if (i >= 0 && i <= 7 && j >= 0 && j <= 7 && a[i][j] != '1') {
            a[i][j] = '1';
            if (find(i + 1, j + 2, dr, dc, a)) {
                return true;
            }
            if (find(i + 1, j - 2, dr, dc, a)) {
                return true;
            }
            if (find(i - 1, j + 2, dr, dc, a)) {
                return true;
            }
            if (find(i - 1, j - 2, dr, dc, a)) {
                return true;
            }
            if (find(i + 2, j + 1, dr, dc, a)) {
                return true;
            }
            if (find(i + 2, j - 1, dr, dc, a)) {
                return true;
            }
            if (find(i - 2, j + 1, dr, dc, a)) {
                return true;
            }
            if (find(i - 2, j - 1, dr, dc, a)) {
                return true;
            }
            // a[i][j] = '0';
            return false;
        }
        return false;
    }
}
// // package BackTracking;
// public class KnightsMove {
// public static void main(String[] args)
// {
// // char[][] a = {
// // {'1', 'S', '0', '0', '0', '0', '0', '1'},
// // {'0', '0', '0', '0', '0', '0', '0', '0'},
// // {'X', '0', '1', '0', '1', '0', '0', '0'},
// // {'0', '1', '0', '0', '0', '1', '0', '0'},
// // {'0', '0', '0', '0', '0', '0', '0', '0'},
// // {'0', '1', '0', '0', '0', '1', '0', '0'},
// // {'0', '0', '1', '0', '1', '0', '0', '0'},
// // {'0', '0', '0', '0', '0', '0', '0', '0'}
// // };
// char[][] a = {
// {'1', '0', '0', '0', '0', '0', '0', '1'},
// {'0', '0', '0', '0', '0', '0', '0', '0'},
// {'0', '0', '0', '0', 'X', '0', '0', '0'},
// {'0', '0', '0', '0', '0', '0', '0', '0'},
// {'0', '0', '0', '0', '0', '0', '0', '0'},
// {'0', '1', '0', '0', '0', '0', '0', '0'},
// {'0', '0', '1', '0', '0', '0', '0', '0'},
// {'S', '0', '0', '0', '0', '0', '0', '0'}
// };
// if(find(7,0,2,4,a))
// {
// System.out.println("YES");
// }
// else
// {
// System.out.println("NO");
// }
// for(int i = 0;i<8;i++)
// {
// for(int j = 0;j<8;j++)
// {
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }
// }
// // public static char count = 'a';
// private static boolean find(int i,int j,int dr,int dc,char[][] a)
// {
// if(i==dr&&j==dc&&a[i][j]=='X')
// {
// return true;
// }
// if(i>=0&&i<=7&&j>=0&&j<=7&&a[i][j]!='1' )
// {
// a[i][j] = '1';
// if(find(i+1,j+2,dr,dc,a))
// {
// return true;
// }
// if(find(i+1,j-2,dr,dc,a))
// {
// return true;
// }
// if(find(i-1,j+2,dr,dc,a))
// {
// return true;
// }
// if(find(i-1,j-2,dr,dc,a))
// {
// return true;
// }
// if(find(i+2,j+1,dr,dc,a))
// {
// return true;
// }
// if(find(i+2,j-1,dr,dc,a))
// {
// return true;
// }
// if(find(i-2,j+1,dr,dc,a))
// {
// return true;
// }
// if(find(i-2,j-1,dr,dc,a))
// {
// return true;
// }
// // a[i][j] = '0';
// return false;
// }
// return false;
// }
// }