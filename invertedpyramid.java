public class invertedpyramid{
  public static void main(String[] args)
  {
    int numberOfRows=7;
    for (int i= 0; i<= numberOfRows-1; i++)
    {
      for (int j=0; j<=i; j++)
      {
        System.out.print(" ");
      }
      for (int k=0; k<=numberOfRows-1-i; k++){
      if(i==1 & k==5){
          continue;
      }
      if(i==2 & k>=3){
          continue;
      }
      if(i==3 & k>=2){
          continue;
      }
      if(i==4 & k>0){
          continue;
      }
      if(i>=5){
          break;
      }
        System.out.print(" " + "*");
      }
      System.out.println();
    }
  }
}  