// Lots of isPalindromes.

public class Palindromes{
  public static void main(String[] args){
 
    System.out.print("Enter String: ");
    String str = StdIn.readString();

    // Test Algorithm 1: isPalindrome (checking equality with reverse string)
    System.out.println("Ispalindrome for " + str + " is " + isPalindrome1(str));

    //Test Algorithm 1B IsPalindrome1B
    System.out.println("Ispalindrome1B for " + str + " is " + isPalindrome1B(str));

    //Test Algorithm 3 IsPalindrome3
    System.out.println("Ispalindrome2 for " + str + " is " + isPalindrome2(str));

   // Test Algorithm4 for RECURSIVE isPalindrome.
   System.out.println("Ispalindrome3(rec) for " + str + " is " + isPalindrome3(str));
   
    }
/*****************************************************************/
  //returns reverse of parameter string - for Algorithm1
  public static String reverse(String s){
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--)
    {
      rev = rev + s.charAt(i);
    }
    return rev;
  }
/****************************************************************/
  //Algorithm1 isPalindome1 (with a call for reversing String)
  public static boolean isPalindrome1(String s){
    String reversed = reverse(s); 
    if (s.equals(reversed)){
      return true;
    } 
    return false;
  }
  //RECURSIVE reverse string
   public static String reverseRec(String s){
    if(s.length() <= 1){
      return s;
    }
    return s.charAt(s.length() - 1) + reverseRec(s.substring(0, s.length()-1));
   }
/*******************************************************************/
//Algorithm1B isPalindome with recursive reverse 
public static boolean isPalindrome1B(String s){
    String reversed = reverseRec(s);
    return (s.equals(reversed));
}
/*******************************************************************/
//Algorithm2 isPalindrome Checking 1st w/last, 2nd with secondToLast, etc.
  public static boolean isPalindrome2(String s){
    int len = s.length();
    int last = s.length() - 1;
    for (int i = 0; i < len/2; i++)
    {
      if (s.charAt(i) != s.charAt(last-i))
      {
        return false;
      }
    }
    return true;
  }
/*****************************************************************/
    //Algorithm 3: Recursive Algorithm3 isPalindrome
    public static boolean isPalindrome3(String s){
      if (s.length() <= 1){
        return true;
      }
      
      return (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome3(s.substring(0, s.length() - 1)));
  }
}