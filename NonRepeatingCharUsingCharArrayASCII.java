//non repeating characters using character Array of ASCII
public class NonRepeatingCharUsingCharArrayASCII {

	public static void main(String[] args) {
		String str="assdettsahd";
		
		int[] newCharArray=new int[256];
		
		char c=notrepeating(newCharArray,str);
		System.out.println(c);
		
		
	}

	private static  char notrepeating(int[] newCharArray, String str) {
		
		for(char c:str.toCharArray()) {
			newCharArray[c]++;
		}
		
		for(char ch: str.toCharArray()) {
			if(newCharArray[ch]==1) {
				return ch;
			}
		}
		return 0;

		
	}

}
