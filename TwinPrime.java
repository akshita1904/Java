import java.util.*;

class TwinPrime{
    public static void main(String args[]){
        int a, b;
        System.out.println("Enter 2 numbers : ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        boolean checka=true;
        boolean checkb=true;
        int i=0;
        for(i=2; i<=a%2; i++){
            if(a%i==0){
                checka=false;
                break;
            }
        }
        for(i=2; i<=b%2; i++){
            if(b%i==0){
                checkb=false;
                break;
            }
        }
        if(checka=true||checkb==true){
            if(a-b==2||b-a==2){
                System.out.println("The numbers are twin prime");
            }
            else{
                System.out.println("The numbers are not twin prime");
            }
        }
        else{
            System.out.println("The numbers are not twin prime");
       }
    }
}