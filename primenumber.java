import java.util.Scanner; 
public class primenumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit");
       int limit = sc.nextInt();
        System.out.println("Enter the start value ");
       for( int i = sc.nextInt();i<=limit;i++){
          if(i==0 || i==1){
              continue;
          }
          else if(i==2||i==3||i==5||i==7){
              System.out.println(i);
          }
          int n=i%2;
          int m=i%3;
          int p=i%5;
          int z=i%7;
              if(n!=0 &m!=0&p!=0&z!=0){
                  System.out.println(i);
              }
    }
}
}