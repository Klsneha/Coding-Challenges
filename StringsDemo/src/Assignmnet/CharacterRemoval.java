package Assignmnet;

public class CharacterRemoval {

	public static void main(String args[])
	{
		String str1=new String("Different");
		String str2=new String("Difficult");
		
		
		CharacterRemoval cr=new CharacterRemoval();
		cr.removal(str1,str2);
		
	}
	
	public void removal(String str1,String str2)
	{
			
				String temp1="";
				String temp2="";
				
					for(int i=0;i<str2.length();i++)
					{
						char alpha=str2.charAt(i);
						System.out.println(alpha);
						int j=0;
						while(j<str1.length())
						{
							if(str1.charAt(j)==alpha)
							{
								temp1=str1.substring(0, j);
								temp2=str1.substring(j+1, str1.length());
								str1=temp1.concat(temp2);		
								//str1=str1.substring(j+1,str1.length());
								System.out.println("The ans is "+str1);
							}
							j++;
						}
						
					}
					System.out.println("The Final ans is "+str1);
					
					
		
	}
	
}
