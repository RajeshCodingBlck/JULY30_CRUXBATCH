package LinkedList_demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList();
		
		
		arr.add(34);
		arr.add(78);
		
		ArrayList<Integer> arr2=new ArrayList();
		arr2.add(340);
		arr2.add(780);
     
		LinkedList<Integer> mylist= new LinkedList(arr);
		
		
		mylist.addAll(1, arr2);
		
		
//		 mylist.addFirst(23);
//		 
//		 mylist.addFirst(45);
//		 
//		 mylist.addLast(56);
//		 
//		 mylist.add(2, 60);
		 
		 System.out.println(mylist);
		 
		
		 
		 
		 
		 
	}

}
