package MyHashMap;

import java.util.LinkedList;

public class MyHash_map {
    
    LinkedList<Entry> [] arr;
    
    private int count=0;
    
    private double load_factor=0.75;
    
     MyHash_map(){
    	 
    	 arr= new LinkedList[5];
    	 
    	 for(int i=0; i<arr.length;i++) {
    		 
    		 arr[i]=new LinkedList();
//    		 System.out.println(arr[i].size());
    	 }	 
     }
     
     int hashfunction(String key) {
    	 
    	 int hash_value= Math.abs(key.hashCode());
    	 
    	 int index= hash_value%arr.length;
    	 
    	 return index;
     }
     
     public void put(String key, int val) {
    	 
    	 int index= hashfunction(key);
    	 
    	 if(containsKey(key)==true) {
    		 
    		 
    		 for(int i=0; i<arr[index].size();i++) {
    			 
    			 if(arr[index].get(i).key.equals(key)) {
    				 
    				 arr[index].get(i).value=val;
    			 }
    		 }
    	 }
    	 else {
    		 
    		 count++;
    		 Entry ele= new Entry(key, val);
    		 
    		 arr[index].addFirst(ele);
    		 
    	 }
    	 
    	  double curr_load_factor= (double)count/(double)arr.length;
    	  
    	  if(curr_load_factor> load_factor) {
    		  
    		  rehashing();
    	  }
    	 
     }
     private void rehashing() {
		// TODO Auto-generated method stub
		
    	 LinkedList<Entry> [] old_arr=arr;
    	 
    	 arr= new LinkedList[2*old_arr.length];
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 arr[i]=new LinkedList();
    	 }
    	 
    	 
    	 for(int i=0; i<old_arr.length;i++) {
    		 
    		 for(int j=0; j<old_arr[i].size();j++) {
    			 
    			
    			 put(old_arr[i].get(j).key, old_arr[i].get(j).value);
    		 }
    	 }
    	 
	}

	public boolean containsKey(String key) {
    	 
    	  int index= hashfunction(key);
    	  
    	  for(int i=0; i<arr[index].size();i++) {
    		  
    		  
    		   if(arr[index].get(i).key.equals(key)) {
    			   
    			    return true;
    		   }
    	  }
    	  
    	  return false;
     }
     
     public void remove(String key) {
    	 
    	 int index= hashfunction(key);
    	 
    	 if(containsKey(key)==true) {
    		 
    		 for(int i=0; i<arr[index].size();i++) {
    			 
    			 if(arr[index].get(i).key.equals(key)) {
    				 
    				 arr[index].remove(i);
    			 }
    		 }
    	 }
    	 
     }
     
     public int get(String key) throws Exception  {
    	 
    	 int index= hashfunction(key);
    	 if(containsKey(key)==true) {
    		  int ans=0;
    		 for(int i=0; i<arr[index].size();i++) {
    			 if(arr[index].get(i).key.equals(key)) { 
    				 ans= arr[index].get(i).value;
    				 break;
    			 }
    		 } 
    		 return ans;
    	 }else {
    		 
    		  throw new Exception("Key is Not there");
    	 }
     }
     
     public void display() {
    	 
    	 for(int i=0; i<arr.length;i++) {
    		 
    		 for(int j=0; j<arr[i].size();j++) {
    			 
    			 System.out.println("{ "+arr[i].get(j).key+ " "+arr[i].get(j).value+ "}" );
    		 }
    	 }
     }
     
}
