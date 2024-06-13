package InterviewLogical;


public class StringRearrange {
    
	public static void main(String[] args) {
        
    	
    	String s = "my name is Arun";
        String[] words = s.split(" ");
        
        int length = words.length;
        
        if (words.length >= length) {
            
        	String output = words[3] + " " + words[2] + " " + words[1] + " " + words[0];
            
        	System.out.println(output);
        } 
        else {
           
        	System.out.println("Input string should contain at least four words.");
        }
    }
}
