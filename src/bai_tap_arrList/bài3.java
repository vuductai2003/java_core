package bai_tap_arrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bài3 {
    public static void main(String[] args) {
        /*viết tt trả lời kết quả các pt
        * quest = {"2 + 5 + 7 =","5*10=","sqrt(16)=","12%2=*/
        Scanner sc = new Scanner (System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2 + 5 + 7 =",
                "5 * 10 =",
                "sqrt(16) =",
                "12 % 2="
        ));
        ArrayList<Float> rep = new ArrayList<>(List.of(14f,50f,4f,0f));
        // duyệt lish câu hỏi
        for (int i = 0; i < quest.size(); i++) {
            System.out.println(quest.get(i));
            // nhập kq
            System.out.println("nhập kq");
            Float kq = sc.nextFloat();
            // kiểm tra với đáp án
            if (kq.equals(rep.get(i)))
                System.out.println("dung");
            else
                System.out.println("sai");
        }
    }
}
