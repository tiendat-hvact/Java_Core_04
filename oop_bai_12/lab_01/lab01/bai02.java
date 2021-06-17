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
public class bai02 {

    static void show(Date date) {
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        String str = df.format(date);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            Calendar c = Calendar.getInstance();
            c.clear();
            c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            c.set(Calendar.MONTH, sc.nextInt() - 1);
            c.set(Calendar.YEAR, sc.nextInt());
            System.out.printf("Case #%d:\n", i);
            Date ngayNhap = c.getTime();
            show(ngayNhap);
            c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
            Date ngayDauTuan=c.getTime();
            show(ngayDauTuan);
            c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
            Date ngayCuoiTuan=c.getTime();
            show(ngayCuoiTuan);
        }
    }
}
