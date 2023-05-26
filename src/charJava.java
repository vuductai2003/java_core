import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class charJava {
    public static void main(String[] args) {
        // đặt trong nháy đơn
        // lấy char từ dữ kiệu nhập vào
        // charAt: lấy kí tự ở vị trí nhập
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào: ");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        System.out.println(ch);

        // compareTo: so sánh 2 kí tự => chả về 1 số nguyên ( dùng lớp Character )
        /*
         giống nhau => chả về 0
         kí tự 1 trc kí tự 2 trong bảng ASII => chả về âm <0
         kí tự 1 sau kí tự 2 trong bảng ASII => chả về dương >0
         */
        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('A','a')); // A: 65, a:97 => 65 - 97 = -32
        System.out.println(Character.compare('a','A'));

        /*
            isDigit(): kiểm tra có phải số không
            isLetter(): kiểm tra có phải kí tự không
            isWhitespace(): kiểm tra có phải space ( dấu cách) không
            isLowerCase():  kiểm tra có phải kí tự thường không
            is UpperCase(): kiểm tra có phải kí tự hoa không
        */
        char ch1 = '1';
        char ch2 = 'a';
        char ch3 = 'A';
        char ch4 = ' ';
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch2));
        System.out.println(Character.isLowerCase(ch2));
        System.out.println(Character.isUpperCase(ch3));
        System.out.println(Character.isWhitespace(ch4));
    }
}
