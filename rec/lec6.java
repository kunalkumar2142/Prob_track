import java.util.*;

public class lec6{

    static void prints(int ind,ArrayList<Integer> ds,int n, int[] arr){
        if(ind>=n){
            System.out.println(ds);
            return;
        }
        ds.add(arr[ind]);
        prints(ind+1, ds, n, arr);

        ds.remove(ds.size()-1);
        prints(ind+1, ds, n, arr);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = 3;
        ArrayList<Integer> ds = new ArrayList<>();
        prints(0,ds,n,arr);
    }
}
