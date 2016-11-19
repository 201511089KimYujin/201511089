import java.util.*;

public class textNum {

	static Map<String, Integer> countChars (String letters){
		char[] letter = letters.toCharArray();
		Map<String,Integer> map = new HashMap<String,Integer>();
		String s;
		
		for(char c:letter){
			s=Character.toString(c);
			if(map.containsKey(s)){
				map.put(s,map.get(s)+1);
			}
			else{
				map.put(s,1);
				}
		}
		return map;
	}
	public static void main(String[] args){
		String sa="sangmyung university";
		Map<String, Integer> x = countChars(sa);
		System.out.println(x);
	}
}
