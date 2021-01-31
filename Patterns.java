/*1
 * 21
 * 321
 * 4321
 * 54321
 */

class Patterns
{
  public static void main(String args[])
  {
    for(int row = 1; row <= 5; row++)
    {
      for(int col = row; col >= 1; col--)
      {
        System.out.print(col);
      }
      System.out.println();
    }

  }
}