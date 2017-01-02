/**
 * Java Program that finds the equilibrium index for any given array in O(n) time complexity
 * 
 * @author 	Varun Mantri
 * 
 * Version 1.0
 *
 */
class Solution
{
	//method that returns equilibrium index or returns -1 if no such index possible
    public static int solution(int[] A) 
    {
        // write your code in Java SE 8
    	long leftSum=0;
    	long rightSum=0;
    	int flag=0;
    	for(int i=0;i<A.length;i++)
    	{
    		if(flag==0)
    		{
    			//right sum calculator
    			for(int jright=i+1;jright<A.length;jright++)
    			{
    				rightSum=rightSum+A[jright];
    			}
    			flag=1;//setting the flag after first iteration
    		}
    		else
    		{
    			leftSum=leftSum+A[i-1];
    			rightSum=rightSum-A[i];
    		}
    		if(leftSum==rightSum)
    		{
    			return i;
    		}
    	}
    	return -1;
    }
    public static void main(String args[])
    {
    	//test case
    	int a[]={-1, 3, -4, 5, 1, -6, 2, 1};
    	System.out.println(solution(a));
    }
}