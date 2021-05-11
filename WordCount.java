import java.util.*;

class WordCount
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.nextLine();
    int c = 0;
    String w = "";

    for (int i = 0; i < str.length(); i++)
    {
      while (str.charAt(i) != ' ')
      {
        w = w + str.charAt(i);
        i++;
        if (i >= str.length())
          break;
      }

      if (w.length() > 0)
      {
        c++;
        w = "";
      }
    }

    System.out.println("The number of words are: " + c);
  }
}