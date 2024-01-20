package Interface_demo;

import java.util.*;

interface MyComparator{
	
	public int MyCompare(Integer val1, Integer val2);
}

class Decr implements MyComparator{

	@Override
	public int MyCompare(Integer val1, Integer val2) {
		 
		if(val1>val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
class Incr implements MyComparator{

	@Override
	public int MyCompare(Integer val1, Integer val2) {
		 
		if(val1<val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
//class cmp implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer val1, Integer val2) {
//		// TODO Auto-generated method stub
//		
//		System.out.println(val1+" "+val2);
//		if(val1%10<val2%10) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}
//	
//	
//}
public class demo1 {

	public static  void bubbleSort(ArrayList<Integer> arr, MyComparator obj) {
		
		
		for(int i=0; i<arr.size();i++) {
			
			for(int j=0; j<arr.size()-i-1;j++) {
				
				
				if(obj.MyCompare(arr.get(j), arr.get(j+1))>0) {
					
					int temp=arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer> arr= new ArrayList<Integer>();
		 arr.add(23);
		 arr.add(230);
		 arr.add(42);
		 arr.add(236);
		 arr.add(237);
		
//		Collections.sort(arr,obj );
		bubbleSort(arr, new Decr());
		System.out.println(arr);
		bubbleSort(arr, new Incr());
		System.out.println(arr);
		
		
    
	}

}
