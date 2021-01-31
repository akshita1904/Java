import java.util.*;

class PalindroneNumber{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int q=num, r=0, rev=0, d=0;
        while(q!=0){
            r=q%10;
            q=q/10;
            rev=rev*10+r;
        }
        if(num==rev){
            System.out.print(" is a Palindrome number");
        }
        else{
            System.out.print(" is not a Palindrome number");
        }
    }
}