package algorithms.sorting.bubblesort;

import java.util.Scanner;
class Solution {
    void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            obj.bubbleSort(arr, n);

            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
