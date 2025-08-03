package com.souvik;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'e'};
        char target = 'c';
        int result = smallestLetter(letters, target);
        System.out.println("The smallest letter greater than target is at index " + result + " and the value is " + letters[result]);
        
    }

    static int smallestLetter(char[] arr, char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start%arr.length;
    }
}
