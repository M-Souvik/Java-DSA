package com.string;

public class StringBuild {
  
public static void main(String[] args) {
      StringBuilder SB=new StringBuilder();
    for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
           SB.append(ch);
        }
        System.out.println(SB.toString());
}       

//it uses the same object and keeps adding into it hence preventing memory wastage



}
