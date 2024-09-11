package LeetCode;

public class MinBitFlips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        int count = 0; 
        int xor = start ^ goal;
        while(xor!=0){
            count += xor & 1; 
            xor >>=1; 
        }
        System.out.println("Minimum number of flips : "+count);
    }
}
// class Solution {
//     public int minBitFlips(int start, int goal) {
//         String str = Integer.toBinaryString(start);
//         String end = Integer.toBinaryString(goal);
//         String a = "";
//         String b = "";
//         while(str.length()<end.length()&&a.length()+str.length()<end.length())
//         {
//             a+="0";
//         }
//         a+=str;
//         while(str.length()>end.length()&&b.length()+end.length()<str.length())
//         {
//             b+="0";
//         }
//         b+=end;
//         int c = 0;
//         for(int i =0 ;i<a.length();i++)
//         {
//             if(a.charAt(i)!=b.charAt(i))
//             {
//                 c++;
//             }
//         }
//         return c;
//     }
// }
