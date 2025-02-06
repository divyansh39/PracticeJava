//Find duplicates in an array

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,7,8,2,3,2,1};
		List<Integer> ans=new ArrayList<>();
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for( int i:nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
			if(map.get(i)==2) {
				ans.add(i);
			}
		}
		
		
		System.out.println(ans);
		

	}

}
