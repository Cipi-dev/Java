
import java.util.Scanner; 
public class leapyear{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the year: ");
       int year = sc.nextInt();
       int num=year%100;
       if(num==0){
           int n=year%400;
           if(n==0){
                System.out.println(year + " is leap year");
           }
           else{
                System.out.println(year + " is not leap year");
           }
       }
       int x=num%4;
       if(x==0){
           System.out.println(year + " is leap year");
       }
       else{
           System.out.println(year + " is not leap year");
       }
       
}
}