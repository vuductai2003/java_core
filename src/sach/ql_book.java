package sach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class ql_book {
    ArrayList<book> arrbook = new ArrayList<>();
    int k, d=0;
    void inport() {
        do{
        d++;
        book b = new book();
        Scanner sc = new Scanner(System.in);
        System.out.println("sách thứ: " + d);
        System.out.println("tên sách:");
        b.setName(sc.nextLine());
        System.out.println("mã sách:");
        b.setId(sc.nextLine());
        System.out.println("giá tiền:");
        b.setMoney(sc.nextInt());
        arrbook.add(b);
        System.out.println("nhâp tiếp: 1-có,0-không");
        k=sc.nextInt();
        }while (k != 0);
    }

    public void export(){
        for ( sach.book book : arrbook) {
            book.xuat();
        }
    }

    public void  seach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá sách muốn tìm: ");
        int number = sc.nextInt();
        for (sach.book book : arrbook){
            if (book.getMoney() > number){
                book.xuat();
            }
        }
    }

    public void arrange(){
        Collections.sort(arrbook, new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
