package com.company.Exercise5;

public class HasOneOperations {
    protected static boolean hasOne(int n) {
        while (n > 0) {
            int r = n % 10;
            if (r == 1) {
                System.out.println(true);
                return true;
            } else
                n = n / 10;
        }
        System.out.println(false);
        return false;
    }
}
