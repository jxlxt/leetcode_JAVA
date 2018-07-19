package edu.ucsc;

/**
 * Leetcode Number:
 * Problem Name:
 *
 * @author: Created by Xiaotong Li 
 * @time: 7/6/18:2018-07-06 08:50.
 */
public class climbStairs {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int one_step_befpre = 2;
        int two_step_before = 1;
        int all_ways = 0;

        for (int i = 2; i < n; i++){
            all_ways = one_step_befpre + two_step_before;
            two_step_before = one_step_befpre;
            one_step_befpre = all_ways;
        }
        return all_ways;
    }
}
