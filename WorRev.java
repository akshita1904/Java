import java.util.*;

class WorRev
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        System.out.println("Input :");
        String s = sc.nextLine();
        s = " " + s;
        String s1 = "";
        String w = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                w += s.charAt(i);
            }
            else
            {
                s1 = w + s.charAt(i) + s1;
                w = "";
            }
        }
        System.out.println("Output :");
        System.out.println(s1.trim());
    }
}