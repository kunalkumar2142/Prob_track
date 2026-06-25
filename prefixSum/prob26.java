import java.util.*;

class prob26 {
    public int func(int N, int K, List<Integer> nums) {
        int n = nums.size();
        long mLen = Integer.MIN_VALUE;
        long[] pref = new long[n + 1];

        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + nums.get(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long sum = pref[j + 1] - pref[i];
                if (sum % K == 0) {
                    mLen = Math.max(mLen, j - i + 1);
                }
            }
        }

        return (mLen == Integer.MIN_VALUE) ? -1 : (int) mLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) nums.add(sc.nextInt());
        System.out.println(new prob26().func(N, K, nums));
    }
}


/*
## Visual
```
n = 6
pref = [0, 2, 9, 15, 16, 20, 25]
index:  0  1  2   3   4   5   6

j max must be 5 → pref[j+1] = pref[6] ✅
j max = 6       → pref[j+1] = pref[7] ❌ CRASH

 */
