import java.util.Scanner; 
import java.lang.Math;
public class armstrong{

     public static void main(String []args){
             double sum=0;
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter number");
             int n = sc.nextInt();
             String s=String.valueOf(n);
             int l=s.length();
             for(int i=1;i<=l;i++){
                 char a=s.charAt(i-1);
                 int num =Character.getNumericValue(a); 
                 sum=sum+(Math.pow(num, 3));
              }
             if(n==sum){
                 System.out.println("The Given Number is Armstrong Number");
             }
             else{
                  System.out.println("The Given Number is Not Armstrong Number");
             }
     }
}
