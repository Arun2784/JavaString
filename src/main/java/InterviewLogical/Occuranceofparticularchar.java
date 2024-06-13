package InterviewLogical;

public class Occuranceofparticularchar {

	public static void main(String[] args) {

		
		String s1 ="seleniumtest";
		
		int length =s1.length();
		
		int count =0;
		
		char ch='e';
		
		for (int i=0; i<length; i++) {
			
			char ch1 = s1.charAt(i); //ch1=e; 
			
		        if (ch==ch1) {   ////s==e//
			
			count++;
			
			
		}	
			
		}
		
		System.out.println("character of  = ," +ch+  ",  occuring times= " +count );
			
	}


	
}
