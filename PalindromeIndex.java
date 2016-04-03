/* Hacker Rank Problem : https://www.hackerrank.com/challenges/palindrome-index */

public class PalindromeIndex {

	public static void main(String[] args) {
		String str = "bcbc" ;
		findPalindormeIdnex(str);
		
		
	}

	private static void findPalindormeIdnex(String str) {
	
		for ( int i = 0 , j= str.length() -1 ; i<j ; i++ , j--){
			if(str.charAt(i)!= str.charAt(j)){
				String rearranged = str.substring(0, i) + str.substring(i+1);
				String reversed = Reversed(rearranged);
					if (rearranged.equals(reversed)){
						System.out.println(i);
						return;
					}
					System.out.println(j);
					return;
			}
		}
		
		System.out.println("-1");
		
		
	}

	private static String Reversed(String rearranged) {
		// TODO Auto-generated method stub
		StringBuilder reversedString = new StringBuilder();
		reversedString.append(rearranged);
		reversedString = reversedString.reverse();
	//	System.out.println("Here i am " +reversedString);
		return reversedString.toString();
		
}
}
