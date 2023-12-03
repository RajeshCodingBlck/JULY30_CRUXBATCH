package oops;

public class Max_min_find {
   
	public static Pair getMaxMin(int [] arr) {
		
		Pair p= new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		
		for(int i=0; i<arr.length;i++) {
			
			p.max= Math.max(p.max, arr[i]);
			
			p.min= Math.min(p.min, arr[i]);
		}
		
		return p;
		
	}
	
	public static Pair getFre(String str, char ch1, char ch2) {
	
		
		Pair p= new Pair(0,0);
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)==ch1) {
				p.fre_ch1++;
			}
			
			if(str.charAt(i)==ch2) {
				p.fre_ch2++;
			}
		}
		
		return p;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {-1,3,4,10,-10,30,5};
     
//      Pair ans= getMaxMin(arr);
      
//      System.out.println(ans.max+ " "+ ans.min);
      
      
      String str= "abbbbbbaac";
      
      Pair ans= getFre(str, 'a', 'b');
       
      
      System.out.println(ans.fre_ch1+ " "+ ans.fre_ch2);
      
      
	}

}
