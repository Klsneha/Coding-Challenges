package GoatLatin;

public class Solutions {

public String toGoatLatin(String S) {
        
        String arr[]=S.split(" ");
        String output=new String();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder s=new StringBuilder(arr[i]);
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                s=s.append("ma");
            }
            else
            {
                char app=s.charAt(0);
               // s=s.substring(1,5);
                s=s.append(app);
                s=s.append("ma");
                
            }
            
            for(int k=0;k<i+1;k++)
            {
                s=s.append('a');
            }
            output=output+s.toString()+' ';
        }
        return output;
    }


public String solution(int N, String S, String T) {
	
	String res="";
	
	
	
	
	return null;
    
}


	public static void main(String args[])
	{
		Solutions s=new Solutions();
		String st="I speak goat Latin";
		String res=s.toGoatLatin(st);
		System.out.println(res);
	}
}
