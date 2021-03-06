//WAP to check if a number is a magic number

import java.util.*;

class MagicNumber
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int n = num;
        int r, ans = 0;
        while(ans != 1)
        {
            n = ans;
            while(n > 0)
            {
                n = n/10;
                r = n%10;
                ans += r;
            }
        }
        System.out.println(ans);
        if(ans == 1){
            System.out.println("It is a magic number");
        }
        else{
            System.out.println("It is not magic number");
        }
    }
}
