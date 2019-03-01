package ransomNote;
import java.util.*;
public class Solutions {

public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map1=new HashMap();
        HashMap<Character,Integer> map2=new HashMap();
        boolean flag=true;
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map1.containsKey(ransomNote.charAt(i)))
            {
            		map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1 );
            }
            else
            {
                map1.put(ransomNote.charAt(i),1);
            }
        }
        
        for(int j=0;j<magazine.length();j++)
        {
            if(map2.containsKey(magazine.charAt(j)))
            {
            		map2.put(magazine.charAt(j),map2.get(magazine.charAt(j))+1 );
            }
            else
            {
                map2.put(magazine.charAt(j),1);
            }
        }
        
        for(int k=0;k<ransomNote.length();k++)
        {
        	//int ransome=map1.get(ransomNote.charAt(k));
        //	int mag=map2.get(ransomNote.charAt(k));
        	if(map1.containsKey(ransomNote.charAt(k)) && map2.containsKey(ransomNote.charAt(k)))
        	{
            if(map1.get(ransomNote.charAt(k))>map2.get(ransomNote.charAt(k)))
            {
                flag=false;
                break;
            }
        	}
        	else
        	{
        		flag=false;
        		break;
        	}
        }
        return flag;
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		String s1="a";
		String s2="b";
		boolean flag=s.canConstruct(s1, s2);
		System.out.println(flag);
	}
}
