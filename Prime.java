// WAP to enter a number and check if number is prime or not

import java.util.*;

class Prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int a=sc.nextInt();
    System.out.println("Enter another number :");
    int b=sc.nextInt();
    boolean isPrimeA = false, isPrimeB = false;
    Prime obj = new Prime();
    isPrimeA = obj.checkPrime(a);
    isPrimeB = obj.checkPrime(b);
    System.out.println("Is "+a+" Prime: " + isPrimeA);
    System.out.println("Is "+b+" Prime: " + isPrimeB);
    if(isPrimeA==true && isPrimeB==true){
        if(a-b==2||b-a==2){
            System.out.println("The numbers are Twin prime");
        }
        else{
            System.out.println("The numbers are Not Twin prime");
        }
    }
    else{
        System.out.println("The numbers are Not Twin prime");
    }
  }

  public boolean checkPrime(int num)
  {
    int count = 0;
    for(int i=2; i<=num/2; i++)
    {
     
 if(num%i==0)
      {
        count=0;
        return false;
      }
      else
      {
       count+=1;
      }
    }
    if(count!=0){
      return true;
    }
    return false;
  }
}