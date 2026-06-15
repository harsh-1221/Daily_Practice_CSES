package org.example.cses_daily;

public class Repitions {
    public void maxRepitions(String[] arr){
        int n = arr.length;
        int currlength = 1;
        int maxlength = 1;
        for(int i =1;i<n;i++){
            if(!(arr[i].equals(arr[i-1]))){
                maxlength = Math.max(maxlength,currlength);
                currlength = 1;
            }
            else {
                currlength++;
            }
        }
        maxlength = Math.max(maxlength,currlength);
        System.out.println(maxlength);

    }
}
