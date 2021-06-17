/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            Calendar c = Calendar.getInstance();
            c.clear();
            c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            c.set(Calendar.MONTH, sc.nextInt() - 1);
            c.set(Calendar.YEAR, sc.nextInt());
            Date ngayNhap = c.getTime();
            System.out.printf("Case #%d:\n", i);            
            System.out.println(ngayNhap);;
        }
    }
}
