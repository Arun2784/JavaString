package InterviewLogical;

import java.util.HashMap;
import java.util.Map;

public class CountofEachChar {

	
	public static void main(String[] args) {		
			
		
		    String name  ="Seleniumselenium";		
		    Map<Character, Integer> charmap = new HashMap<Character, Integer>();
			
			
			char[] char1 = name.toCharArray();  // {a,b,c','d'}
			
			for(char ch : char1) {
				
				if (charmap.containsKey(ch))  
				{
				
					charmap.put(ch, charmap.get(ch) +1);
					
				}
				else {
					
					charmap.put(ch, 1);
					
				}
				}
				
			
			System.out.println(name + " :" +charmap);
			
			}
			
		
	}


