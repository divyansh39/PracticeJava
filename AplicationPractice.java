import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AplicationPractice {
		//aaraa
		//aarba
	
	static boolean isPallindrome(String str) {
		
		int left=0, right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--; 
		 }
		return true;
		
	}
	
	public static void main(String[] args) {
		String str= "aarraa";
		
		boolean ans=isPallindrome(str);
		
		System.out.println(ans);
		
	}

}
