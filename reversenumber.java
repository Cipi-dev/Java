import java.util.Scanner;  // Import the Scanner class
class reversenumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");

        int n = sc.nextInt();
        int sum=0;
        int digit;
        while (n!=0){
            digit=n%10;
            n=n/10;
            sum=(sum+digit)*10;
        }
        sum=sum/10;
        System.out.print(sum);
    }
}