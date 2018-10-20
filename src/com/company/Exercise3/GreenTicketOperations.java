package com.company.Exercise3;

public class GreenTicketOperations {
    protected static int greenTicket(int a, int b, int c) {
        if (((a == b) && (b != c)) || ((a == c) && (b != c)) || ((b == c) && (a != c))) {
            System.out.println(10);
            return 10;
        } else if ((a == b) && (b == c)) {
            System.out.println(20);
            return 20;
        } else
            System.out.println(0);
        return 0;
    }
}
