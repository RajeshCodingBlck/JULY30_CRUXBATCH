import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int row=1;

        int outer_nsp=n-1;
        int nsp=n-2;

        int nst=n;

        while(row<=n){

            // outerSpace Print

             int i=1;
             while(i<=outer_nsp){
                 System.out.print(" ");
                 i++;
             }

             // star 

             if(row==1 || row==n){
                 
                 int j=1;

                 while(j<=nst){
                     System.out.print("*");
                     j++;
                 }
             }else{
                 
                 System.out.print("*");
                 // innerSpace

                 int j=1;

                 while(j<=nsp){
                     System.out.print(" ");
                     j++;
                 }

                 System.out.print("*");
             }

             // Preparation for Next Row

             outer_nsp--;
             row=row+1;
             System.out.println();
        }

    }
}
