/*
Wap to accept 4 numbers in an array and shift each element by one position to the right. Repeat this step n times.

Ex:
  a  =  [10, 24, 4, 6, 20]
  n  =  2

  when n is 1, then a will be [20, 10, 24, 4, 6]
  when n is 2, then a will be [6, 20, 10, 24, 4]

  So, final array will be [6, 20, 10, 24, 4]

 */
import java.util.*;
class CyclicRotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter 5 numbers");
        int a[] = new int[5];
        int k = 1;

        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        while (k <= n)
        {
          for (int i = a.length - 1; i >= 0; i--)
          {
              int last = a[a.length - 1];
            System.out.println(last);
            for (int j = i - 1; j >= 0; j--)
            {
              a[i] = a[j];
              i--;
            }
            a[0] = last;
          }
          k++;
        }

        System.out.println("Output:");
        for (int i = 0; i < a.length; i++)
        {
          System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}