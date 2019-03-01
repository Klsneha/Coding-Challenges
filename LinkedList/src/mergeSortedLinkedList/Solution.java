package mergeSortedLinkedList;

class Solution {
    
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x)
        {
            val=x;
        }
    }
    public void mergeTwoLists(ListNode l1, ListNode l2) {
        
    ListNode l=l1;
     
     if(l1.val<=l2.val)
     {
    	 l.val=l1.val;
    	 l1=l1.next;
     }
     else
     {
    	 l.val=l2.val;
    	 l2=l2.next;
     }
        
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        ListNode l1=new ListNode(1);
        ListNode l11=new ListNode(3);
        ListNode l12=new ListNode(5);
        ListNode l13=new ListNode(7);
        
        ListNode l2=new ListNode(2);
        ListNode l21=new ListNode(4);
        ListNode l22=new ListNode(6);
        ListNode l23=new ListNode(8);
        
        
        l1.next=l11;
        l11.next=l12;
        l12.next=l13;
        
        l2.next=l21;
        l21.next=l22;
        l22.next=l23;
       
        s.mergeTwoLists(l1, l2);
        
        
        
    }
}