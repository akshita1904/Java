import java.util.*;
class The
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        int c = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)=='t' || s.charAt(i)=='T')
            {
                if((s.charAt(i+1)=='h' || s.charAt(i+1)=='H') && (s.charAt(i+2)=='e' || s.charAt(i+2)=='E'))
                {
                    c+=1;
                }
            }
        }
        System.out.println("There are " + c + " THE's in the sentence entered");
    }
}