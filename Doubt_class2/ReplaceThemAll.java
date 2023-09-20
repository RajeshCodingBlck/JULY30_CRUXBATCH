import java.util.*;
public class Main {
    public static void main(String args[]) {
      
	  Scanner s= new Scanner(System.in);

	   long n= s.nextLong();

	   if(n==0){
		   System.out.println(5);
	   }else{

		   long ans=0;

		   long place_value=1;

		   while(n>0){

			   long ld= n%10;

			   if(ld==0){
				   ld=5;
			   }
          
		      ans= ans+ place_value*ld;
			  place_value *=10;
			  n=n/10;
			   
		   }

		   System.out.println(ans);

	   }

    }
}
