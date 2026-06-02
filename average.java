import java.util.Scanner; 
public class average{

     public static void main(String []args){
         int num=0;
         for(int i=1;i<=5;i++){
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter number" + " " + i);
             int n = sc.nextInt();
             num+=n;
         }
         double avg =num/5;
         System.out.print("The average is" + " " + avg);
     }
}
