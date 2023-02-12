package isPalindromOrNot;

public class checkPalindrom {

	static boolean isPalindrom(int number) {
		
		int testSayisi=number, reverseNumber=0,  lastDigit;
		
		while(testSayisi != 0) {
			
			lastDigit = testSayisi % 10;
			
			reverseNumber = (reverseNumber * 10 ) + lastDigit;
			
			testSayisi/= 10;
		
		}
		
		if (number == reverseNumber) {
			
		   return true;
		}
		return false; 
		
		}
	
	
public static void main(String[] args) {
		
	System.out.println(isPalindrom(8118));
	
		
		

	}

}
