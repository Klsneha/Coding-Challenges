import java.util.Arrays;

public class RearrangeNosameBeside {

	public static void main(String args[])
	{
		String st="aabbccddab";
		char arr[]=st.toCharArray();
		Arrays.sort(arr);
		StringBuilder stb=new StringBuilder();
		for(int i=0,j=arr.length-1;i<arr.length&& j>i;i++,j--)
		{
			stb.append(arr[i]);
			stb.append(arr[j]);
		}
		System.out.println(stb);
		boolean flag=true;
		for(int i=0,j=i+1;i<(stb.length()-1) && j<(stb.length());i++,j++ )
		{
			if(stb.charAt(i)==stb.charAt(j))
			{
				flag=false;
				break;
			}
		}
		System.out.println(flag);
	}
}
