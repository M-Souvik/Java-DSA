package com.search;


class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 10, 20, 30, 40, 50, 60};
        int target=50;
        int result = search(arr, target);
        System.out.print(result);
        
    }

    static int search(int[] arr, int target){
        int start=0;
        int end=1;

        while (target>get(end, arr)){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }

        return binarySearch(arr, target, start, end);

    }
     static int binarySearch(int[] arr,int n, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(n==arr[mid]){
                return mid;
            } else if (n<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

       static int get(int index, int[] arr) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return Integer.MAX_VALUE;
        }
    }

}