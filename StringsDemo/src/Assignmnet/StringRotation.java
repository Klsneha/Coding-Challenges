package Assignmnet;

public class StringRotation {
	
	public static void main(String args[])
	{
		String str1="abcd";
		String str2="cdab";
		StringRotation sr=new StringRotation();
		sr.Rotation(str1, str2);
		
	}
	public void Rotation(String str1,String str2)
	{
		int j=0;
		int i=0;
		String temp1="";
		String temp2="";
		String finalSting="";
		char alp=str2.charAt(i);
		System.out.println("alp is"+alp);
		while(j<str1.length())
		{
			
			if(str1.charAt(j)==alp)
			{
				System.out.println("Match at"+j);
				 temp1=str1.substring(j, str1.length());
				 temp2=str1.substring(0,j);
				 finalSting=temp1.concat(temp2);
				 break;

			}
			j++;
		}
		/*System.out.println("String is temp1"+temp1);
		System.out.println("temp2"+temp2);
		System.out.println("Final string is"+finalSting);*/
		if(str2.equals(finalSting))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
