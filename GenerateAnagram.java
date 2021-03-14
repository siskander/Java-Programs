package faceBookGroupsProblems;

import java.util.Scanner;

public class GenerateAnagram{
    
    public static void main(String[] args){
        
        System.out.print("Please, enter a string: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        
        //String str1 = "0123456789";
        StringBuilder str2 = new StringBuilder();
        
        for(int i=str1.length()-1; i>=0; i--)
            str2.append(str1.charAt(i));
        
        System.out.println("The anagram of it is: " + str2.toString());
    } 
}