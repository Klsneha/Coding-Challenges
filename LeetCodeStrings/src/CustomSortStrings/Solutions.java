package CustomSortStrings;

public class Solutions {

public String customSortString(String S, String T) {
        
		 char s[]=S.toCharArray();
		 char t[]=T.toCharArray();
		 int pt=0;
		 
		for(int i=0;i<s.length;i++)
		{
			for(int j=i;j<t.length;j++)
			{
				if(s[i]==t[j])
				{
					char temp=t[pt];
					t[pt]=t[j];
					t[j]=temp;
					pt++;
					
				}
			}
		}
		
		String st=new String(t);
		return st;
		
    }
public static void main(String[] args) {
	
	String s="kqep";
	String t="pekeq";
	Solutions s1=new  Solutions();
	System.out.println(s1.customSortString(s, t));
	
}
}
