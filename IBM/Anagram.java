package IBM;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
       
        
     // your code goes here
		String str1 = "listen";
		String str2 = "silent";

         if(str1.length() != str2.length()){
            System.out.println("Not anagrams");
        
        }


		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		if(str1.equals(str2)){
		    System.out.println("Anagrams");
		}
    }
    
}
