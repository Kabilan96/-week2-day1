package week2.day1;

public class ReversePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String A = "MADAM";
     String B = "";
      
 for(int i=A.length()-1;i>=0;i--) {
	 B = B+A.charAt(i);
 }
 System.out.println(B);
 
 if (A.equals(B)) {
	 System.out.println("Palindrome");
 }
 
 else System.out.println("Not Plaindrome");
	}

}
