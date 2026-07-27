package com.string;

public class tutorial {
    public static void main(String[] args) {
    String name1=new String("Souvik");
    String name2=new String("Souvik");

    //created object a outside the heap
    //different memory allocations

    System.out.println(name1==name2);//false

    String a="Souvik";
    String b="Souvik";

    //pointing to the same object in string pool
    
    System.out.println(a==b);//true

    }
     
}
