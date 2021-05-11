import java.util.*;

class TaxCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        double tax;
        if(age > 65)
        {
            System.out.println("Not eligible to pay taxes");
        }
        else
        {
            System.out.println("Please enter your income : ");
            int inc = sc.nextInt();
            if(inc < 500000)
            {
                System.out.println("Not eligible to pay taxes");
            }
            else if(inc >= 500000 && inc <= 700000){
                tax = ( inc - 500000) * 0.1;
                System.out.println("The tax you need to pay is : "+ tax);
            }
            else if(inc >= 700000 && inc <= 1000000){
                tax = (inc - 700000) * 0.2 + 35000;
                System.out.println("The tax you need to pay is : "+ tax);
            }
            else if(inc > 1000000)
            {
                tax = (inc - 1000000) * 0.3 + 95000;
                System.out.println("The tax you need to pay is : "+ tax);
            }
        }
    }
}