package com.algoritham.programs;

public class PermutationProblem {
	static void printPermutation(String str, String ans)
    {
  
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = str.substring(0, i) + 
                         str.substring(i + 1);
            printPermutation(result, ans + ch);
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String s = "abb";
        printPermutation(s, "");
    }

}
