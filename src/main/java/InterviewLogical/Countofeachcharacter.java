package InterviewLogical;

import java.util.HashMap;
import java.util.Map;

public class Countofeachcharacter {

	public static void main(String[] args) {
		
		
		String  name= "eleniuumTest" ;	
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		char[] ch1 = name.toCharArray(); //
		
      for (char ch : ch1) {
	
	if(charmap.containsKey(ch)) {
		
		charmap.put(ch, charmap.get(ch)+1);    //T, 
		
		
	}
	
	else {
	
	charmap.put(ch, 1);
	
	}
}		
	System.out.println (name + " " + charmap);

	}

}
