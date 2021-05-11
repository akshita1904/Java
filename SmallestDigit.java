/*
 * WAP to accept a number and print the smallest digit of the number
*/

import java.util.*;

class SmallestDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int q = num, r = 0, ans = q % 10;
        while(q != 0){
            r = q % 10;
            q = q / 10;
            if(r < ans)
            {
                ans = r;
            }
        }
        System.out.println("The Smallest digit in "+num+" is "+ans);
    }
}