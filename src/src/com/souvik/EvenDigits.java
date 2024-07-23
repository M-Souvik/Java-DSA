package com.souvik;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={-12,450,7890,90};
//        int digit=122;
        int ans=Check(arr);
        System.out.println(ans+" even-digits-no.");
    }

//to check whether the no. of digits is even or not
    static int Check(int[] array) {
        int counter=0;
        for (int num:array) {
        if (even(num)){
            counter++;
        }
        }
        return counter;
    }

    static boolean even(int num) {
        int NoOfDigits=digits2(num);

        return NoOfDigits%2==0;
    }
    //optmised way to count digit
    static int digits2(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
    //to count the no. of digit
    static int digits(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
