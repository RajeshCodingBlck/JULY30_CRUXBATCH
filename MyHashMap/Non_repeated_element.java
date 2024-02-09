package MyHashMap;

import java.util.HashMap;

public class Non_repeated_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,1,2,2,3,4,1,2};
               //  arr ki value , uski frequency
        HashMap<Integer, Integer> mh= new HashMap();
        
        for(int i=0; i<arr.length;i++) {
        
        	if(mh.containsKey(arr[i])==false) {
        		mh.put(arr[i], 1);
        	}else {
        		int old_fre= mh.get(arr[i]);
        		mh.put(arr[i], old_fre+1);
        	}
        }
        for(Integer key : mh.keySet()) {
        	
        	  if(mh.get(key)==1) {
        		  System.out.println(key);
        	  }
        }
        
	}

}
