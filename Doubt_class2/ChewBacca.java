import java.util.*;
public class Main {
    public static void winner(int limitA, int limitH){

        int i=1;

        int sumA=0;

        int sumH=0;

        while(true){
           
           // Aayush Turn
           if(i%2==1){
               
             if(i+sumA<=limitA){
                 sumA+=i;
             }else{
                 System.out.println("Harshit");
                 break;
             }
           }else{
             
             if(i+sumH<=limitH){
                 sumH+=i;
             }else{
                 System.out.println("Aayush");
                 break;
             }

           }

            i++;
        }
    }
    public static void main(String args[]) {
     
      Scanner s= new Scanner(System.in);

      int t= s.nextInt();

      while(t>0){
          
          int limitA=s.nextInt();

          int limitH=s.nextInt();

          winner(limitA, limitH);
          t--;
      }
    }
}
