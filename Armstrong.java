import java.util.*;

class Armstrong
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        int ans = 0;
        int i = 0;
        int q = num;
        int r;
        while(q != 0)
        {
            r = q % 10;
            q = q / 10;
            ans += r * r * r;
        }
        if(num == ans)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}