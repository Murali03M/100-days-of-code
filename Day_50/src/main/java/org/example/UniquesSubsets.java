package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniquesSubsets {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,4,4,1,4};

        List<List<Integer>> ans = UniqueSubset(n, arr);

        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }

    static List<List<Integer>> UniqueSubset(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        findSubset(0, arr, n, res, subset, ans);
        return ans;
    }

    static void findSubset(int index, int[] arr, int n, HashSet<String> res, List<Integer> subset, List<List<Integer>> ans) {
        if (index == n) {
            Collections.sort(subset);
            if (res.add(subset.toString())) {
                ans.add(new ArrayList<>(subset));
            }
            return;
        }

        subset.add(arr[index]);
        findSubset(index + 1, arr, n, res, subset, ans);
        subset.remove(subset.size() - 1);

        findSubset(index + 1, arr, n, res, subset, ans);
    }
}
