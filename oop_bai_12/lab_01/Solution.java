/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacor.basic.les12;

/**
 *
 * @author LaptopDT
 */
public class Solution {

    static void sum() {
        long s = 0;
        for (int i = 0; i < 1000; i++) {
            s = s + i;
        }
    }

    static void run(int n) {
        for (int i = 0; i < n; i++) {
            sum();
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        run(100000);
        long finish = System.currentTimeMillis();
        System.out.println("Time: " + (finish - start));
    }
}
