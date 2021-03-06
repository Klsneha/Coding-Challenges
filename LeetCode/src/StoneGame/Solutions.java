package StoneGame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solutions {

	 public boolean stoneGame(int[] piles) {
	        
		 int a=0;
		 int l=0;
		 Boolean af=false;
		 Deque<Integer> q=new LinkedList<Integer>();
		  for(int i=0;i<piles.length;i++)
		  {
			  q.add(piles[i]);
		  }
		  
		  while(!q.isEmpty())
		  {
			  if(q.peekFirst()>q.peekLast())
			  {
				  if(!af)
				  {
				  a=a+q.removeFirst();
				  af=true;
				  }
				  else
				  {
					  l=l+q.removeFirst();
					  af=false;
				  }
			  }
			  else
			  {
				  if(!af)
				  {
					  a=a+q.removeLast();
					  af=true;
				  }
				  else
				  {
					  l=l+q.removeLast();
					  af=false;
				  }
				  
			  }
			  
			  
		  }
		  if(a>l)
			  return true;
		  else
			  return false;
	    }
	 
	 public static void main(String[] args) {
		Solutions s=new Solutions();
		int piles[]= {3,2,10,4};
		System.out.println(s.stoneGame(piles));
		
	}
}
