package com.company.D67234GC20_labs.labs.examples.les08;

public class ArgsTest {
    public static void main (String args[]) {
        System.out.println("The total is: " + (args[0] + args[1]));
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        System.out.println("The total is: " + (arg1 + arg2));
    }
}
