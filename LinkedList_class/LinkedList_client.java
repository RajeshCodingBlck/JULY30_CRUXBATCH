package LinkedList_class;

public class LinkedList_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   MyLinkedList list= new MyLinkedList();
	   
	   list.Insert_At_end(10);
	  
	   list.Insert_At_end(20);
	   list.Insert_At_end(30);
	   list.Insert_At_end(50);
	   list.Insert_At_end(60);
	   
	   list.display();
	   
	  
	   
	   list.InsertAtIndex(3, 40);
	   
	   list.display();
	   
	   
	   
	}

}
