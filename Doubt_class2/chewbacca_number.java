package Doubt_class2;

import java.util.Scanner;

public class chewbacca_number {

	public static int countdigit(long n){

        int count=0;

        while(n>0){

            long  rem= n%10;

            count++;
            n=n/10;
        }

        return count;
    }
    public static void main(String args[]) {
        // Your Code Here

        Scanner s= new Scanner(System.in);

        long n= s.nextLong();

        int nofdigit= countdigit(n);


        long ans=0;

        long place_value=1;

        while(nofdigit>1){

            long rem= n%10;

            if(rem>=5){
                rem= 9-rem;
            }
            ans= ans+ place_value*rem;
            place_value=place_value*10;
            n=n/10;
            nofdigit--;
        }

        if(n==9 || n<5){
            ans= ans+ place_value*n;
        }else{
            ans= ans+ place_value*(9-n);
        }

        System.out.println(ans);
    }

}
