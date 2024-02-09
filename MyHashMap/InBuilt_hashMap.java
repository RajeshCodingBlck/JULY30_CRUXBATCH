package MyHashMap;

import java.util.HashMap;

public class InBuilt_hashMap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //         <key, value>
		HashMap<String, Integer> mh= new HashMap();
		
		mh.put("Rohan", 50);
		mh.put("Mohan", 30);
		mh.put("Mohit", 30);
		
		System.out.println(mh);
		
		mh.put(null, 60);
		
		System.out.println(mh);
		
		System.out.println(mh.containsKey("Mohan"));
		System.out.println(mh.get("Sohan"));
		System.out.println(mh.getOrDefault("Sohan", -1));
		
		System.out.println(mh.keySet());
		for(String key : mh.keySet()) {
			
			 System.out.println(key +" "+ mh.get(key));
			 
		}
		
		
		
	}

}
