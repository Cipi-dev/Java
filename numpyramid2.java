public class numpyramid2{

     public static void main(String []args){
       for(int i=1;i<=5;i++){
           for(int j=4;j>=i;j--){
               System.out.print(" ");
           }
           for(int k=1;k<=i*2;k++){
               if(i==1 & k==2){
                   System.out.print(" ");
                   continue;
               }
               if(i==2 & k==4){
                   System.out.print(" ");
                   continue;
               }
               System.out.print(6-i);
           }
           System.out.println();
       }
     }
}