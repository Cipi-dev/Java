public class javaexample
{
  public static void main(String[] args)
  {
    int numberOfRows=7;
    for (int i= 0; i<= numberOfRows-1; i++)
    {

      //This loop prints starting spaces for each row of pattern
      for (int j=0; j<=i; j++)
      {
        System.out.print(" ");
      }
      
      for (int k=0; k<=numberOfRows-1-i; k++)
      {
        System.out.print("*" + " ");
      }
      
      System.out.println();
    }
  }
}  