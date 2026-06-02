
import java.util.Scanner; 
public class swapping {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the a value: ");
       int a = sc.nextInt();
       System.out.println("Enter the b value: ");
       int b = sc.nextInt();
       System.out.println("The value of a before swapping is " + a + " and b is " + b);
      a=a+b;
      b=a-b;
      a=a-b;
       System.out.println("The value of a after swapping is " + a + " and b is " + b);
}
}