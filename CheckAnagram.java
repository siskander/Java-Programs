package faceBookGroupsProblems;

import java.util.Scanner;

public class CheckAnagram{
    
    public static boolean checkAnagram(String str1, String str2){
        
        if(str1.length() != str2.length())
           return false;
        
        int n = str1.length();
        for(int i=0; i<n; i++)
            if(str1.charAt(i) != str2.charAt(n-1-i))
                return false;
        
        return true;        
    }
//------------------------------------------    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please, enter the first string: ");
        String str1 = input.nextLine();
        
        System.out.print("Please, enter the second string: ");
        String str2 = input.nextLine();
        
        if(checkAnagram(str1, str2))
            System.out.println("They are anagram.");
        else
            System.out.println("They are NOT anagram.");
    }
}