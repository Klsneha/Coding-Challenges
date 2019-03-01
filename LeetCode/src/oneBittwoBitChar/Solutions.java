package oneBittwoBitChar;

public class Solutions {

	public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        boolean flag=false;
        while(i<bits.length)
        {
            if(bits[i]==1)
            {
                i=i+2;
            }
            else
            {
                i=i+1;
            }
            if(i==bits.length-1)
            {
                flag=true;
                break;
            }
            else
                flag=false;
        } 
        return flag;
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int bits[]= {1,0,0};
		Boolean flag=s.isOneBitCharacter(bits);
		System.out.println(flag);
				
	}
}
