public class numpyramid{

     public static void main(String []args){
         int num=1;
       for(int i=1;i<=7;i++){
           for(int j=1;j<=i;j++){
               if(i==5 &num==15){
                   continue;
               }
               if(i==6 &num==20){
                   continue;
               }
               if(i==7 &num==26){
                   break;
               }
               System.out.print(num + " ");
               ++num;
       }
       System.out.println();
     }
}
}
