package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = new int[] {1,3,2,6,5,4,7,8,9,0};

        int n = arr.length;

        for(int i =0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}