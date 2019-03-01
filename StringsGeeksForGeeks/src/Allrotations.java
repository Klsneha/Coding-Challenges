
public class Allrotations {
	
	
	public static void main(String args[])
	{
		String st="geeks";
		//String arr[]=new String[st.length()];
		for(int i=0;i<st.length();i++)
		{
			String left=st.substring(0,i+1);
			String right=st.substring(i+1,st.length());
			System.out.println(right+left);
			
		}
	}

}
