
import java.util.Scanner;  // Import the Scanner class
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");

        int num = sc.nextInt();
        int sum=0;
        int digit,a;
        int n=num;
        while (n!=0){
            digit=n%10;
            n=n/10;
            sum=(sum+digit)*10;
        }
        sum=sum/10;
        if(num==sum){
            System.out.print("The Given number is Palindrome");
            }
        else{
            System.out.print("The Given number is not Palindrome");
            }
       
            
        
    }
}