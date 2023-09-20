package Doubt_class2;

import java.util.Scanner;

public class inverse_number {

public static void main(String args[]) {
        
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int ans=0;

        int place=1;

        while(n>0){

            int  val= n%10; // place_vale;

            ans= ans+ place*(int)Math.pow(10, val-1); // Place_value  is treated as value there.
          
            place++;
            n=n/10;
        }

        System.out.println(ans);
    }

}
