package UglyNumbers;

public class BottomUpApproach {
	
	
    public boolean isUgly(int num) {
    	int table[]=new int[num+1];
        boolean flag=false;
        
        int temp=num;
        for(int i=num-1;i>1;i--)
        {
        	if(table[i]!=0)
        	{
            if(table[i]%num==0)
            {
                num=num/table[i];
            }
        	}
        }
        num=divide(num,2);
        num=divide(num,3);
        num=divide(num,5);
        
        if(num==1){
            flag=true;
            table[temp]=1;
        }
        else
        {
            flag=false;
        }
        
        
        return flag;
    }
    
    public int divide(int a,int b)
    {
        while(a%b==0)
        {
            a=a/b;
        }
        return a;
    }
    
    public static void main(String args[])
    {
    	BottomUpApproach b=new BottomUpApproach();
    	boolean flag=b.isUgly(8);
    	System.out.println(flag);
    }
    
	
}
