import java.util.*;

//All UNIQUE subsequences (no duplicates)
//Approach 1 (Easy): Use Set (Brute but safe)
public class new1 {

    static void prints(int ind, ArrayList<Integer> ds, int n, int[] arr,
                       Set<List<Integer>> set) {

        if (ind >= n) {
            set.add(new ArrayList<>(ds)); // ✅ unique automatically
            return;
        }

        // take
        ds.add(arr[ind]);
        prints(ind + 1, ds, n, arr, set);

        // not take
        ds.remove(ds.size() - 1);
        prints(ind + 1, ds, n, arr, set);
    }

    public static List<List<Integer>> getUniqueSubsequences(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        ArrayList<Integer> ds = new ArrayList<>();

        prints(0, ds, n, arr, set);

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(getUniqueSubsequences(arr));
    }
}



//Approach 2 (BEST – Interview Optimal)

/*
import java.util.*;

public class new1 {

    static void solve(int index, int[] arr,
                      List<Integer> ds,
                      List<List<Integer>> result) {

        result.add(new ArrayList<>(ds)); // store

        for (int i = index; i < arr.length; i++) {

            // 🔥 skip duplicates
            if (i > index && arr[i] == arr[i - 1]) continue;

            ds.add(arr[i]);
            solve(i + 1, arr, ds, result);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> getUniqueSubsequences(int[] arr) {
        Arrays.sort(arr); // 🔥 important

        List<List<Integer>> result = new ArrayList<>();
        solve(0, arr, new ArrayList<>(), result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(getUniqueSubsequences(arr));
    }
}
 */