package InterviewLogical;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatesenetence {

	public static void main(String[] args) {
		
		
		String s ="my my name is Arun Arun";	
		String [] word =s.split(" ");
		Set<String> set  = new LinkedHashSet<String>();
		
		for(String s1 : word) {	
			set.add(s1);	  	
		}
		
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			
			System.out.print(itr.next()+ " ");
			
			
		}
		
		
		
	}

}
