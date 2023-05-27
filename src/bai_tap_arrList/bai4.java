package bai_tap_arrList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        /*
        *viết  ct nhập 1 list, n ngẫu nhiên, nhập từ bàn phím
        *  in a cso bn số < 80
        *  in ra vị trí các index đó*/
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập số phần tử");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            int nn = rd.nextInt(100);
            list.add(nn);
        }
        System.out.println(list);
        int count = 0;
        String gpt = " ";
        for (int x: list){
            if (x<80)
                count++;
            gpt += x + " ";
        }
        if (count ==0)
            System.out.println("ko có số <80");
        else
            System.out.println("số pt < 80: " + count);
        System.out.println("vị trí" + gpt);
    }
}
