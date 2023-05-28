package bai_tap_arrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bai5 {
    public static void main(String[] args) {
        /*cho list={1,3,9,14,5,27,8}
        * viết ct in số lớn thứ 2 và số nhỏ thứ 2
        * in ra vị trsi index số đó */
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        ArrayList<Integer> lstNew = new ArrayList<>(lst);
        // sắp xếp theo tăng dần
        Collections.sort(lstNew);
        System.out.println(lstNew);
        // in ra số lớn thứ 2vaf nhỏ
        int max2 = lstNew.get(lstNew.size()-2);
        int min2 = lstNew.get(1);
        System.out.println("số lớn thứ 2: " + max2);
        System.out.println("số nhỏ thứ 2: " + min2);
        // in ra vị trí index
        System.out.println("vi tri index "+ lst.indexOf(max2));
        System.out.println("vi tri index "+ lst.indexOf(min2));
    }
}
