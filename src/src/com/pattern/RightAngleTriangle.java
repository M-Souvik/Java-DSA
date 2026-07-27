package com.pattern;

public class RightAngleTriangle {
    public static void main(String[] args) {

        int n=5;
        normalTriangle(n);
        
    }

    public static void rightAngleTriangle(int n){
for (int i=0; i<n; i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }

     public static void numberTriangle(int n){
for (int i=1; i<n; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }

    }
    public static void reversedRightAngleTriangle(int n){
for (int i=1; i<=n; i++){
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }

    static void mirrorTriangle(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalCols=row>n?2*n-row:row;
            for (int col = 0; col < totalCols; col++) {
                System.err.print("*");
            }
            System.out.println();

            
        }
    }

    static void mirrorNormalTriangle(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalCols=row>n?2*n-row:row;
            for (int col = 0; col < totalCols; col++) {
                System.err.print("*");
            }
            System.out.println();

            
        }
    }

    static void normalTriangle(int n){
       for (int row = 1; row <= n; row++) {
            for (int j = row; j < 2*n-row; j++) {
                System.err.print(" ");
            }
            
            for (int k = 1; k < 2*row ; k++) {
                // System.err.print("*");
                System.out.print("* ");
                
            }
            System.out.println();
       }
    }




}
