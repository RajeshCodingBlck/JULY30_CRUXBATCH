package LinkedList_class;

public class MyLinkedList {
    
	Node head;
	
	
	MyLinkedList(){
		
		head=null;
	}
	
	void Insert_At_begin(int val) {
		
		
	   Node new_node= new Node(val);
	   
	   new_node.next=head;
	   
	   head= new_node;
	   
	}
	
	void display() {
		
	   	  Node temp= head;
	   	  
	   	  while(temp !=null) {
	   		  
	   		  System.out.print(temp.data + " -> ");
	   		  
	   		  temp= temp.next;
	   	  }
	   	  
	   	  System.out.println("N");
	}
	 
	
	 void Insert_At_end(int val) {
		 if(head==null) {
			 
			 Insert_At_begin(val);
			 return;
		 }
		 
		 
		 Node temp= head;
		 
		 while(temp.next !=null) {
			 
			 temp=temp.next;
		 }
		 
		 Node new_node = new Node(val);
		 
		 temp.next= new_node;
		 
		 
		 
	 }
	 
	 public void delete_At_end() {
		 
		 
		 if(head==null) {
			 
			 // throw Exception
		 }
		  
		 if(head.next==null) {
			 
			 head=null;
			 
			 return;
		 }
		 
		 Node temp=head;
		 
		 while(temp.next.next !=null) {
			 
			  temp=temp.next;
		 }
		 
		 temp.next=null;
		 
		 
		 
	 }
	 
	 public void delete_At_begin() {
		 
		   if(head==null) {
			   
			   // throw Exception
		   }
		  Node temp= head.next;
		   head.next=null;
		  head= temp;
		  
	 }
	 
	 public void InsertAtIndex(int index, int val) {
		 
		   int jump=index-1;
		   
		   Node temp=head;
		   
		   while(jump>0) {
			   
			   temp=temp.next;
			   jump--;
		   }
		   
		   Node newNode= new Node(val);
		   
		   newNode.next= temp.next;
		   temp.next=newNode;
		   
		   
		   
	 }
	 
	 public void deleteAtIndex(int index) {
		 
		  
		   int jump=index-1;
		   
		   Node temp=head;
		   
		   while(jump>0) {
			   
			   temp=temp.next;
			   
			   jump--;
		   }
		   
		   Node temp2= temp.next;
		   
		   temp.next=temp2.next;
		   
		   temp2.next=null;
		   
	 }
	 
	 
	
}
