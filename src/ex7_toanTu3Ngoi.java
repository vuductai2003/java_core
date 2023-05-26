import java.util.Scanner;

public class ex7_toanTu3Ngoi {
    public static void main(String[] args) {
        // toán tử 3 ngôi
/*        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vao");
        double so = sc.nextDouble();
        String kq = (so >=8) ? "gioi" : ((so < 8 && so > 6.5))? "khá": (so < 6.5 && so > 5.5) ? "tb" : "yeu";
        System.out.println(kq);*/

        int tong = 0;
        for (int i =0; i<5; i++){
            tong += i;
        }
        System.out.println(tong);
    }
}
