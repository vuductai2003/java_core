package sach;

import java.util.Scanner;

public class menuBook {
    public static void main(String[] args) {
    ql_book bk = new ql_book();
    sachchuyennghanh scn = new sachchuyennghanh("v"," tin hoc",4,2);
    Scanner sc = new Scanner(System.in);
        int chon;
        do{
        System.out.println("1: nhập");
        System.out.println("2: xuất");
        System.out.println("3: tìm sách");
        System.out.println("4: sắp xếp theo tên");
        System.out.println("0: thoát");
        System.out.println("chọn chức năng: ");
        chon = sc.nextInt();
        switch (chon){
            case 1:
                bk.inport();
                break;
            case 2:
                System.out.printf("%-12s%-12s%-12s\n", "tên sách" , "ID" , "money");
                bk.export();
                break;
            case 3:
                bk.seach();
                break;
            case 4:
                bk.arrange();
                break;
            default:
                System.exit(0);
        }
        }while (chon!=0);

    }
}
