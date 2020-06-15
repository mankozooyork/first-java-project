package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candidates = new int[m];
        for (int i = 0; i < k; i++) {
            int speech = sc.nextInt();
            candidates[speech - 1]++;
            for (int j = 0; j < candidates.length; j++) {
                if (candidates[j] >= 1) {
                    candidates[speech - 1]++;
                    candidates[j]--;
                }
            }
            if (n > 0) {
                n--;
            }
        }
        Arrays.sort(candidates);
        int maxVal = candidates[candidates.length-1];

        for (int i = 0; i < candidates.length; i++) {
            if (maxVal == candidates[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
