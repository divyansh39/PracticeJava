import java.util.HashMap;
import java.util.Map;import javax.swing.ComponentInputMap;

public class NonRepeatingCharacter {
	
//Find the first non-repeating character in a string.
	//using MAP
	
	public static void main(String[] args) {
		
		String str="catatcai";
		Map<Character,Integer> map=new HashMap<>();
		
		char c=nonRepeatinChar(map,str);
		System.out.println("nonrepeating char is : "+c);
		
	}

	private static char nonRepeatinChar(Map<Character, Integer> map, String str) {
		
		for(char c:str.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		
		for(char ch:str.toCharArray()) {
			if(map.get(ch)==1) {
				return ch;
			}
		}
		return 0;
		
	}

}
