
public class MyQueue {
   
	// state
	
	 private int [] data;
	 
	 private int front;// index of the front element
	 
	private int rear; // index of the last element
	 
	 MyQueue(){
		 
		 data=new int [5];
		 
		  front=-1;
		  rear=-1;
	 }
	 
	 
	 public boolean IsEmpty() {
		 
		 if(front==-1 && rear ==-1) {
			 
			 return true;
		 }
		 
		 return false;
	 }
	 
	 public boolean IsFull() {
		 
		  if(rear== data.length-1) {
			  
			  return true;
		  }
		  
		  return false;
	 }
	 
	 public void enqueue(int val)  throws Exception {
		 
		  if(IsFull()==true) {
			  
			   throw new Exception("Queue is full");
		  }
		  else if(IsEmpty()==true) {
			  front++;
			  rear++;
			  data[front]=val;
		  }else {
			  
			  rear++;
			  data[rear]=val;
		  }
	 }
	 
	 
	 public int  dequeue()  throws Exception{
		 
		 if(IsEmpty()==true) {
			 
			throw new Exception("Queue is Empty");
		 }
		 
		 if(front==rear) {
			 int front_value=data[front];
			 
			 front=-1;
			 rear=-1;
			 return front_value;
			 
		 }
		 
		 int front_value=data[front];
		 front++;
		 
		 return front_value;
	 }
	 
	 public int front() throws Exception {
		 
		 if(IsEmpty()==true) {
			  throw new Exception("queue is Empty");
		 }
		 
		 return data[front];
	 }
	 
	 
	 
	 
	 
	 
	 
}
