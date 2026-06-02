/* Online Java Compiler and Editor */
public class pyramid{

     public static void main(String []args){
         int i,j,rows=6;
         for(i=6;i>=1;i--){
             for(j=rows-i;j>=1;j--){
                 System.out.print(" ");
             }
             for(j=0;j<1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
}