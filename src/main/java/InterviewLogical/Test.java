package InterviewLogical;

import java.util.HashMap;
import java.util.Map;

public class Test {

	
public static void main(String[] args) {
		
		
		 String  name= "eleniuumTest" ;	
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		char[] char1 = name.toCharArray(); //
		
		for(char ch : char1) {
			
				System.out.println (charmap.get(ch) +1);
				
			}
		
}		
	
}
