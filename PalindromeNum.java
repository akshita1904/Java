import java.util.*;

class PalindromeNum{
    Scanner sc=new Scanner(System.in);
    int num=0;
    int q=0, r=0;
    int c=0;
    int x;
    System.out.println("Enter a number");
    num=sc.nextInt();
    x=num;
    while(x!=0){
        x=num%10;
        c+=1;
    }
    for(int i=0,int j=c;i<j;i++,j--){
    }
}