import java.util.*;

class MagicNumberTwo
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int n = num;
        int r, ans = 0;
        while(n != 1 && n >= 9)
        {
            while(n > 0)
            {
                n = n/10;
                r = n%10;
                ans += r;
            }
            n = ans;
            ans = 0;
        }
        if(n == 1){
            System.out.println("It is a magic number");
        }
        else{
            System.out.println("It is not magic number");
        }
    }
}