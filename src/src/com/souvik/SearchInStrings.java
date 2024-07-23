package com.souvik;

public class SearchInStrings {
    public static void main(String[] args) {
        String Name="Souvik";
        char target='o';
        System.out.println(search2(Name,target));

    }

     static boolean search(String str, char trgt) {
        if(str.isEmpty()){
            return false;
        }
         for (int i = 0; i < str.length(); i++) {
             if (trgt == str.charAt(i)) {
                 return true;
             }
         }
         return false;
    }
//using for-each-loop
    static boolean search2(String str, char trgt) {
        if(str.isEmpty()){
            return false;
        }
        for(char ch:str.toCharArray()){
            if (ch==trgt) {
                return true;
            }

        }
        return false;
    }
}
