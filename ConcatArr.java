import java.util.*;

class ConcatArr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p[]=new int[6];
        int q[]=new int[4];
        System.out.println("Enter 6 numbers to fill p : ");
        for(int i=0; i<6; i++){
            p[i]=sc.nextInt();
        }
        System.out.println("Enter 4 numbers to fill q : ");
        for(int i=0; i<4; i++){
            q[i]=sc.nextInt();
        }
        int r[]=new int[10];
        for(int i=0; i<6; i++){
            r[i]=p[i];
        }
        for(int i=6 , y=0; i<10 && y<4; i++ , y++){
            r[i]=q[y];
        }
        System.out.println("Ans :");
        for(int i=0; i<10; i++){
            System.out.println(r[i]);
        }
    }
}