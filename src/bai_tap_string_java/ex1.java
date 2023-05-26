package bai_tap_string_java;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /* bài 1:
         * nhập vào 1 chuổi từ bàn phím
         * đếm xem có bao nhiêu kí tự thường
         * bao nhiêu in hoa
         * bao nhiêu số
         * bao nhiêu space */
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập vào 1 chuổi: ");
        String scan = sc.nextLine();
        // gán biến đếm
        int dso = 0;
        int dktt = 0;
        int dkth = 0;
        int dspc = 0;

        for (int i = 0; i < scan.length(); i++) {
            char c = scan.charAt(i);
            if (Character.isLowerCase(c)){
                dktt++;
            }else if(Character.isUpperCase(c)){
                dkth++;
            } else if (Character.isDigit(c)) {
                dso++;
            } else if (Character.isWhitespace(c)) {
                dspc++;
            }
        }
        System.out.println("số lượng kí tự thường " + dktt);
        System.out.println("số lượng kí tự hoa " + dkth);
        System.out.println("số lượng kí tự số " + dso);
        System.out.println("số lượng kí tự space " + dspc);
    }
}
