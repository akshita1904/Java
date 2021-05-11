import java.util.*;

class Sqrt_Pow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x=sc.nextInt();
        double anspow=Math.pow(x,2);
        double anssqrt=Math.sqrt(x);
        System.out.println("The function Math.pow helps us to put power and Math.sqrt helps us to find square root");
        System.out.println("Square of x : "+anspow+" & Square root of x : "+anssqrt);
    }
}