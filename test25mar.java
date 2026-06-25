import java.util.*;

public class test25mar {
    static int solve(int k, int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        int xr = 0;
        int count = 0;
        for(int x : arr){
            xr ^= x;
            int target = xr ^ k;
            if(mp.containsKey(target)){
                count += mp.get(target);
            }
            mp.put(xr, mp.getOrDefault(xr , 0) +1);
        }
        return count; 
    }
    public static void main(String[] args) {
    }
}
