package com.string;

public class Palidrome {
    public static void main(String[] args) {
        System.out.println("res:"+ checkStringPalindrome("t"));
    }

    static boolean checkStringPalindrome(String string){
        if(string.length()==0||string==null){
            return true;
        }
        string=string.toLowerCase();
        int s=0;
        int e=string.length()-1;

        while (s<=e) {
            if(string.charAt(e)!=string.charAt(s)){
                return false;
            }
            s++;
            e--;
            
        }
        return true;
    }
}
