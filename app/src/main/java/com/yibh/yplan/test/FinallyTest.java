package com.yibh.yplan.test;

/**
 * Created by Test on 2017/10/19.
 * finally是在return执行之后执行,是在return返回之前执行.
 */

public class FinallyTest {

    public static void main(String[] st) {
        System.out.print(test1());
    }

    public static int test1() {
        try {
            System.out.print("try...\n");
            return 30;
        } catch (Exception e) {
            System.out.print("catch...\n");
        } finally {
            System.out.print("finally...\n");
        }
        return 20;

    }

}
