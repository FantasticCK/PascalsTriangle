package com.CK;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> singleRes = new ArrayList<>();
            int resLen = res.size() - 1;
            if (i == 0) {
                singleRes.add(1);
                res.add(singleRes);
            } else {
                for (int l = 0; l < i + 1; l++) {
                    if (l == 0 || l == i)
                        singleRes.add(1);
                    else
                        singleRes.add(res.get(resLen).get(l - 1) + res.get(resLen).get(l));
                }
                res.add(singleRes);
            }
        }
        return res;
    }
}