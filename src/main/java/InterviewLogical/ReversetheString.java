package InterviewLogical;

public class ReversetheString {

	public static void main(String[] args) {
		
		String s1 ="Testing";
		
		int lenght =s1.length();
		
		String rev = " ";
		
		for (int i =lenght -1; i >=0; i--) {
			
			rev = rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
