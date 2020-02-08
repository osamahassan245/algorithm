package string;

import java.util.*;

public class SearchString {
	   public static String mostCommonWord(String p, String[] banned) {
	        Set<String> ban = new HashSet<String>(Arrays.asList(banned));
	        Map<String, Integer> count = new HashMap<String, Integer>();
	        String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
	       
	        for (String w : words) {
	        	System.out.println(count.getOrDefault(w, 0));
	        	if (!ban.contains(w)) 
	        		count.put(w, count.getOrDefault(w, 0) + 1);
	        }
	        return  Collections.max(count.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

	      //  return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Bob hit a ball  the hit BALL flew far after it was hit";
		String banned[] = {"hit"};
		System.out.println(mostCommonWord(paragraph,banned));
		
	}

}
