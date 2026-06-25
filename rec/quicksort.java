import java.util.Arrays;

public class quicksort{

    static void swap(int[] arr,int a, int b){
        int k = arr[a];
        arr[a] = arr[b];
        arr[b] = k;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low , j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    static void qs(int[] arr, int low, int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        qs(arr,0,arr.length-1);
        System.err.println(Arrays.toString(arr));
    }
}