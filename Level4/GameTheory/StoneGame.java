package Level4.GameTheory;

import java.util.Scanner;

public class StoneGame 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%4==0)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }   
}