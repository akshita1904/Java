/*1
10
101
1010
10101
*/

class Pattern
{
  public static void main(String args[])
  {
    for(int row = 1; row <= 5; row++)
    {
      for(int col = 1; col <= row; col++)
      {
        System.out.print(col%2);
      }
      System.out.println();
    }

  }
}