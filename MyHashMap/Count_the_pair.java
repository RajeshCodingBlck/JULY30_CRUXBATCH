package MyHashMap;

import java.util.HashMap;

public class Count_the_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,1,2,2,3,3,3,4};
      
      HashMap<Integer, Integer> mh= new HashMap();
      
      for(int i=0; i<arr.length;i++) {
    	  
    	  if(mh.containsKey(arr[i])==true) {
    		  
    		  int old_fre= mh.get(arr[i]);
    		  mh.put(arr[i], old_fre+1);
    	  }else {
    		  
    		  mh.put(arr[i],1);
    	  }
      }
      
      int count_pair=0;
      for(Integer key : mh.keySet()) {
    	  
    	  int fre= mh.get(key);
    	  count_pair+= (fre*(fre-1))/2;
      }
      
      System.out.println(count_pair);
	}

}
