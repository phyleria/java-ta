
package com.solution;

public class Solution {



    public static boolean getresult(String str)
    {
      // your code goes here

        return false;
    }



    public static void main(String[] args)
    {
        if (args.length < 1)
        {
             System.exit(1);
        }
        String str = args[0];
        if (str.length() < 0)
        {
             System.exit(2);
        }
        boolean result = Solution.getresult(str);
        System.out.print("is (" + str + ") a palindrome:  " + result + "\n");
    }

}
