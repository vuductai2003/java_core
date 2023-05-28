package bai_tap_arrList;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bt_arr {
    public static void main(String[] args) {
        // tạo 1 arr 1 chiều gồm các phần tử là số nguyên, có n phan tử ngẫu nhiên, n do người dùng nhập
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
        System.out.println("nhập số nguyên n: ");
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < m.length; i++) {
            int ngauNhien = rd.nextInt(6);
            m[i] = ngauNhien;
        }
        // xuất các giá trị trong mảng
        System.out.println("giá trị arr là: "+Arrays.toString(m));
        // đảo ngược arr và xuất
        for (int i = 0, j = m.length-1;i<j;i++,j--){
            int temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
        System.out.println("mảng sau đảo là:" + Arrays.toString(m));
        // xắp sếp tăng dần
        Arrays.sort(m);
        System.out.println("mảng sắp xếp là" + Arrays.toString(m));
        // tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        // hoặc
//        for (int s :m){
//            sum+=s;
//        }
        System.out.println("tổng các phần tử trong mảng là:" + sum);
        // cho người dùng nhập 1 số bất kì: kiểm tra số đó có trong arr ko, nuêus có xuất ra vị trí arr trong mảng
        System.out.println("nhập số kiểm tra: ");
        int m1 = sc.nextInt();
        boolean ktra = false;
        String gps = "";
        for (int i = 0; i < m.length; i++) {
            if (m[i] == m1){
               ktra = true;
               gps+= (i+ " ");
            }
        }
        if (ktra){
            System.out.println(m1 + " có tồn tại với vị trí "+ gps);
        }else {
            System.out.println(m1 + " ko tồn tại");
        }
    }
}
