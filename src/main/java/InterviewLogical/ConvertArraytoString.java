package InterviewLogical;

import java.util.Arrays;

public class ConvertArraytoString {

	public static void main(String[] args) {
		
		char charArr[] =  { 'g', 'e', 'e', 'k', 's' };
		String s = Arrays.toString(charArr).replaceAll("[,\\s\\[\\]]", "");
		
		System.out.println(s);
		
		
		//2dnd way
		
		char ch[]= {'a','b','c','d','f'};
		String str = new String(ch);
		System.out.print(str);
		
	}

}
