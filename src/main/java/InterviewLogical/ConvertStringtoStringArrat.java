package InterviewLogical;

public class ConvertStringtoStringArrat {

	public static void main(String[] args) {
		
		String str = "Converting string to string array using split() method"; 

		String str_arr[] =str.split(" ");
		
		for(int i=0; i<str_arr.length; i++) {
			System.out.print(str_arr[i]);
			
			//System.out.print("string array[] = " + "{" +str_arr[i] +"}");			
			
		}
		
	
		
		

	}

}
