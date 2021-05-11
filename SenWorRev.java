import java.util.*;

class SenWorRev
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        System.out.println("Input : ");
        String str=sc.nextLine();
        str+=" ";
        String st1 = "";
        String w = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                w += str.charAt(i);
            }
            else
            {
                st1 = w + str.charAt(i) + st1;
                w = "";
            }
        }
        System.out.println("Output : ");
        System.out.println(st1.trim());
    }
}