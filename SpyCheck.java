import java.util.*;

class SpyCheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int q=num, r=0;
        int a=0, m=1;
        while(q!=0){
            r=q%10;
            q=q/10;
            a+=r;
            m*=r;
        }
        if(a==m){
            System.out.println("Spy");
        }
        else{
            System.out.println("Not Spy");
        }
    }
}