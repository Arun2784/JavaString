package InterviewLogical;

public class RemovetheDuplicate {

	public static void main(String[] args) {

		String s1 = "seleniumnseleniumnseleniumnseleniumnabcdf";
		int length = s1.length();
		String removeDup = "";  // Initialize an empty string to store unique characters
       for(int i=0; i<length; i++) {
	 
	         char ch =s1.charAt(i);
 
		         // Check if the character is not already present in the 'removeDup' string
	         
	           if(removeDup.indexOf(ch)==-1) {
		     
	        	   // If not present, append the character to the 'removeDup' string
	        	   
	        	   removeDup =removeDup +ch;
	        	   
	           }
       }
    // Print the string without duplicate characters
   	System.out.println(removeDup);
	}
	}


