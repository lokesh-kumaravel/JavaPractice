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
