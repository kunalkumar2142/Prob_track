import java.io.*;
import java.util.*;

//printing subsequences whose sum is K;

public class lec7{

    static void prints(int ind,ArrayList<Integer> ds, int s, int sum, int[]arr, int n){
        if(ind == n){
            if(s==sum){
                System.out.print(ds);
            }
            return;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        prints(ind+1, ds, s, sum, arr, n);

        ds.remove(ds.size() -1);
        s -= arr[ind];
        prints(ind+1, ds, s, sum, arr, n);

    }
    public static void main(String args[]) throws IOException{

        // Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1};
        int sum = 2;
        int n=3;
        ArrayList<Integer> ds = new ArrayList<>();
        prints(0, ds, 0, sum, arr, n);
    }
}