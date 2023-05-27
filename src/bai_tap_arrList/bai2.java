package bai_tap_arrList;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        /*viết tt nhập 1 danh sách list
        * tạo ra 1 list mới bình phương các phần tử
        * xác định bao nhiêu phần tửlowns hơn 50*/
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập list: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ: " + (i+1));
            int nhap = sc.nextInt();
            list.add(nhap);
        }
        System.out.println(list);
        // tạo ra 1 lish mới bình phương ca phần tử
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x: list){
            binhPhuong.add(x*x);
        }
        System.out.println("danh sách bình phương: " + binhPhuong);
        // xác định
        int count = 0;
        for (int x :binhPhuong){
            if (x > 50){
                count ++;
            }
        }
        System.out.println("số pt > 50 là: " + count);
    }
}
