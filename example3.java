public class example3{
  public static void main(String[] args)
  {
    int numberOfRows=5;
    for (int i= 0; i<= numberOfRows-1; i++)
    {
      for (int j=0; j<=i; j++)
      {
        System.out.print(" ");
      }
      
      for (int k=0; k<=6-2*i; k++)
      { 
        if(i=3 & k=1){
            
        }
        System.out.print("*" + " ");
      }
      
      System.out.println();
    }
  }
}  