package MonotonicFunction;

public class Solutions {

public boolean isMonotonic(int[] A) {
        
	boolean ascOrder = false;
    for(int i=0; i<A.length - 1; i++){
        if(A[i] < A[i+1]){
            ascOrder = true;
            break;
        }  
     // System.out.println( ascOrder);
    }
       
           
    
    	for(int i=0;i<A.length-1;i++)
    	{
    		if(ascOrder) {
    		if(A[i]>A[i+1])
    			return false;
    		}
    		if(!ascOrder)
    		{
    			if(A[i]<A[i+1])
        			return false;
        		
    		}
    	}
    	return true;
    
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int A[]= {5,5,6,7,7,8};
		boolean flag=s.isMonotonic(A);
		System.out.println(flag);
	}
}
