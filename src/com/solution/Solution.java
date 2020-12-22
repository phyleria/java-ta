
package com.solution;

public class Solution {



    public static int getresult(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }
	else if (n < 2)
	{
	    return n;
	}
	else
	{
	    return getresult(n - 1) + getresult(n - 2);
	}
    }



    public static void main(String[] args)
    {
        if (args.length < 1)
        {
             System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0)
        {
             System.exit(2);
        }
        int fibonacci = Solution.getresult(n);
        System.out.print("Fibonacci(" + n + ") = " + fibonacci + "\n");
    }

}
