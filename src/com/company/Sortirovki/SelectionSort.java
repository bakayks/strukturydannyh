package com.company.Sortirovki;

class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {10,4,2,5,1,6,3,7,8,9};
        int n = arr.length;
        for (int i= 0; i < n-1; i++) {
           int minIndex = i;
           for(int z = i+1; z<n; z++ ){
                if(arr[z]<arr[minIndex]){
                    minIndex = z;
                    int a = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = a;
                }
           }
        }
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
    }
}


