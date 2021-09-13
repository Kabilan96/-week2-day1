package week2.day1;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "stops";
		String s2 = "potss";
		
		if (s1.length()!= s2.length()) {
			System.out.println("Both the strings are not equal, so are Not Anagram");
		}
		else {
			char[] String1=s1.toCharArray();
			char[] String2=s2.toCharArray();
		
			Arrays.sort(String1);
			Arrays.sort(String2);
			
		    System.out.println(Arrays.toString(String1));
		    System.out.println(Arrays.toString(String2));
		    
			if(Arrays.equals(String1,String2)==true) 
			{
				System.out.println("Anagram");
			}
			else 
			{
				System.out.println("Not Anagram");			
			}	
		}		
	}
}
