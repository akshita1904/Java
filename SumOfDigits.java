//WAP to accept a number and print the sum of its digits.

import java.util.*;

class SumOfDigits{
    public static void main(String args[]){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=sc.nextInt();
        int i= x;
        int r, q, ans=0;
        while(i>0){
            q=i/10;
            r=i%10;
            ans+=r;
            i=q;
        }
        System.out.println("Ans: "+ans);
    }
}