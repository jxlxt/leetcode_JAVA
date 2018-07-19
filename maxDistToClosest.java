package edu.ucsc;

import java.util.Arrays;

/**
 * Leetcode Number: 849
 * Problem Name: Maximize Distance to Closest Person
 *
 * @author: Created by Xiaotong Li 
 * @time: 6/28/18:2018-06-28 09:37.
 */
public class maxDistToClosest {
    public int maxDistToClosest(int[] seats) {
        int N = seats.length;
        int[] left = new int[N], right = new int[N];
        Arrays.fill(left, N);
        Arrays.fill(right, N);
        for (int i = 0; i < N; ++i) {
            if (seats[i] == 1) left[i] = 0;
            else if (i > 0) left[i] = left[i-1] + 1;
        }
        for (int i = N - 1; i >= 0; --i) {
            if (seats[i] == 1) right[i] = 0;
            else if (i < N-1) right[i] = right[i+1] + 1;
        }
        int ans = 0;
        for (int i = 0; i < N; ++i) {
            if (seats[i] == 0)
                ans = Math.max(ans, Math.min(left[i], right[i]));
        }
        return ans;
    }
}
