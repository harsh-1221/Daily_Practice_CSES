package org.example.cses_daily;

public class IncreasingArray {
    public void minimumMoves(int n,int[] arr){
        int moves = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                moves = moves+(arr[i-1]-arr[i]);
            }
        }
        System.out.println(moves);
    }
}
