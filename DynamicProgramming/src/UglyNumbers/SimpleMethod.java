package UglyNumbers;

public class SimpleMethod {

	/*This function divides a by greatest 
    divisible power of b*/
    static int maxDivide(int a, int b) 
    { 
        while(a % b == 0) 
            a = a/b; 
        return a; 
    } 
      
    /* Function to check if a number  
    is ugly or not */
    static int isUgly(int no) 
    { 
        no = maxDivide(no, 2); 
        no = maxDivide(no, 3); 
        no = maxDivide(no, 5); 
          
        return (no == 1)? 1 : 0; 
    } 
      
    /* Function to get the nth ugly  
    number*/
    static int getNthUglyNo(int n) 
    { 
        int i = 1; 
          
        // ugly number count  
        int count = 1;  
          
        // check for all integers  
        // until count becomes n  
        while(n > count) 
        { 
            i++; 
            if(isUgly(i) == 1) 
                count++; 
        } 
        return i; 
    } 
      
    /* Driver program to test above 
    functions */
    public static void main(String args[]) 
    { 
        int no = getNthUglyNo(7); 
        System.out.println("7th ugly "
                       + "no. is "+ no); 
    } 
}