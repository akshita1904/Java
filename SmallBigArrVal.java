import java.util.*;

class SmallBigArrVal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers to fill array : ");
        for(int i=0; i<5; i++){
            a[i]=sc.nextInt();
        }
        int anss=a[0];
        for(int i=0; i<5; i++){
            if(a[i]<anss){
                anss=a[i];
            }
        }
        int ansb=a[0];
        for(int i=0; i<5; i++){
            if(a[i]>ansb){
                ansb=a[i];
            }
        }
        System.out.println("The smallest value in the entered array is : "+anss);
        System.out.println("The largest value in the entered array is : "+ansb);
    }
}