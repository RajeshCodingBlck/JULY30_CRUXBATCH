package Wrapper_class;
import java.util.*;

public class reverse_the_arrayList {
    
	public static void reverse(ArrayList<Integer> arr) {
		
		 int i=0;
		 int j= arr.size()-1;
		 
		 while(i<j) {
			 
			 int temp= arr.get(i);
			 arr.set(i,  arr.get(j));
			 arr.set(j, temp);
			 i++;
			 j--;
		 }
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> arr= new ArrayList<>();
       arr.add(30);
       arr.add(20);
       arr.add(300);
       arr.add(10);
       arr.add(2000);
       
       System.out.println(arr);
       
        reverse(arr);
       
       System.out.println(arr);
       
       
       
	}

}
