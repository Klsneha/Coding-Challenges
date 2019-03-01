
public class ReverseWords {

	public static void main(String args[])
	{
		String st="Sneha is a good girl";
		String arr[]=st.split(" ");
		
		StringBuilder fs=new StringBuilder();
		
		for(int j=arr.length-1;j>=0;j--)
		{
			StringBuilder temp=new StringBuilder(arr[j]);
			fs.append(temp.reverse());
			fs.append(" ");
		}
		
		System.out.println(fs);
		
	}
}
