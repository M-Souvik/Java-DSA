package com.string;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            series=series+ch;
        }

        System.out.println(series);

    }
    //but this solution is not good, becoz memory is wasted as objects are created in every iteration which are useless like "", "a", "ab"
    
}
