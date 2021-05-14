import java.util.*;

class ErrorHandling{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=0;
        try{
            n=sc.nextInt();
            System.out.println(n);
            int a = n/0;
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic Exception "+e);
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
}