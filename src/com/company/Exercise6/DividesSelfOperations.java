package com.company.Exercise6;

public class DividesSelfOperations {
    protected static boolean dividesSelf(int n) {
        int i = n;
        while (i > 0) {
            int r = i % 10;
            if (r == 0) {
                return false;
            }
            else if (n%r != 0)
                return false;
            else
                i = i / 10;
        }
        return true;
    }
}
