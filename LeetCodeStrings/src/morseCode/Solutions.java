package morseCode;
import java.util.*;
public class Solutions {

	public int uniqueMorseRepresentations(String[] words) {
     
		HashMap<Character, String> map = new HashMap<>(); 
		char strt=97;
		String Codes[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> MorseCodes=new HashSet<>();
		for(int i=0;i<Codes.length;i++)
		{
			map.put(strt, Codes[i]);
			strt++;
		}

		for(Map.Entry<Character,String> h:map.entrySet())
		{
			
			System.out.print(h.getKey());
			System.out.println(h.getValue());
			
		}
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String morseCode="";
			for(int j=0;j<word.length();j++)
			{
				char key=word.charAt(j);
				morseCode=morseCode+map.get(key);
					
			}
			MorseCodes.add(morseCode);
			
		}
		
		
		
		return MorseCodes.size();
		
    }
	
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		String words[]= {"gin", "zen", "gig", "msg"};
		int res=s.uniqueMorseRepresentations(words);
		System.out.println(res);
	
		
	}

}
