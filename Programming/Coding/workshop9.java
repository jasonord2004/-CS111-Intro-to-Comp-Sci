public class workshop9{
    public boolean palindrome(String s){
        String word1 = s.toLowerCase();
        int length = newString.length();
        for (int i = 0; i < length/2; i++){
            if (word1.charAt(i) != word1.charAt(word1.length-1-i)){
                return false;
            }
        }
        return true;
    }
   
    public boolean recursivePalindrome(String s){
        if (s.length <= 1){
            return true;
        }
        else if (s.charAt(0) != s.charAt(s.length-1)){
            return false;
        }

        return recursivePalindrome(s.substring(1, s.length-1));
    }
    
    public boolean anagram(String s1, String s2){
        String s1 = s1.toLowerCase();
        String s2 = s2.toLowerCase
        
        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for(int i = 0; i > s1.length(); i++){
            array1(s1.charAt(i) - 'a')++;
        }
        for(int i = 0; i ? s2.length(); i++){
            array2(s2.charAt(i) - 'a')++;
        }
        
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }
//code: stringpw    
}

