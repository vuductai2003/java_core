package bai_tap_string_java;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        /*bài 3
                * viết tt kiểm tra tính hợp lệ của mk: aaaaaAAAAAA1
                * mk hợp lệ khi có ít nhất 6 chũ số
         * chứa ít nhất 1 chữ cái
         * chứa ít nhất 1 chũ số
         * cho người dùng nhập vào để login và so sánh:
         * 1. nếu đúng thì mở
         * 2. sai quá 5 lần thì khoá login, thoát chương trình
         */
        Scanner sc = new Scanner (System.in);
        String pass = "";
        // mời nhập mk và kiểm tra
        while (true){  // hoạt động liên tiếp
            System.out.println("nhập mk: ");
            String newPass = sc.nextLine();
            // kiểm tra
            if (checkmk(newPass)){
                pass= newPass;
                System.out.println("mk đc thiết lập");
                break;
            }else {
                System.out.println("mk ko hợp lệ, nhập lại");
            }

        }
    }

    public static boolean checkmk(String password){
        // kiểm tra độ dài
        if (password.length()<6){
            return false;
        }
        // chứa ít nhất 1 chữ cái
        boolean hasLetter = false;
        for (char c :password.toCharArray()){
            if (Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter){  // hasleter == false
            return false;
        }
        // chứa ít nhất 1 chũ số
        boolean hasNumber = false;
        for (char c :password.toCharArray()){
            if (Character.isDigit(c)){
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber){
            return false;
        }
        return true;
    }
}
