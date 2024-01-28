package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Inbuilt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        
        for(int it: arr){
            System.out.print(it +" ");
        }
        scan.close();
    }
}
