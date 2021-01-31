import java.util.*;

class PalindromeRange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s, e;
        System.out.println("Enter start point :");
        s=sc.nextInt();
        System.out.println("Enter end point :");
        e=sc.nextInt();
        int q, r, rev=0;
        for(int i=s; i<=e; i++){
            q=i;
            rev=0;
            while(q!=0){
                r=q%10;
                q=q/10;
                rev=(rev*10)+r;
            }
            if(rev==i){
                System.out.println(i);
            }
        }
    }
}