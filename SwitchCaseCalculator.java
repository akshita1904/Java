import java.util.*;

class SwitchCaseCalculator
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("/n 1. Addition /n 2. Subtraction /n 3. Multiplication /n 4. Division ");
        int choice = sc.nextInt();
        
        int a, b, result = 0;
        
        switch(choice)
        {
            
            case 1:
                a = acceptNumber("first");
                b = acceptNumber("second");
                result=a+b;
                break;
                
            case 2:
                a = acceptNumber("first");
                b = acceptNumber("second");
                result = a > b ? a - b : b - a;
                break;
                
            case 3:
                a = acceptNumber("first");
                b = acceptNumber("second");
                result = a * b;
                break;
                
            case 4:
                a = acceptNumber("first");
                b = acceptNumber("second");
                result = a > b ? a / b : b / a;
                break;
                
            default:
                System.out.println("Wrong choice entered !!!! Please try again ....");
                
        }
        
        System.out.println("Result "+ result);
    }
    public static int acceptNumber(String msg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter "+ msg +" number");
        int number = sc.nextInt();
        
        return number;
    }
}