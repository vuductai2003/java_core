import java.util.Random;

public class randomJava {
    public static void main(String[] args) {
        Random rd = new Random();
        // lấy ngẫu nhiên 1 số nguyên
        int sng= rd.nextInt(-50,51); // chạy từ -50 đến 51
        System.out.println(sng);
        // chạy ngẫu nhiên số thực
        double x = rd.nextDouble(100);
        System.out.println(x);
    }
}
