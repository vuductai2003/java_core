import java.util.Calendar;
import java.util.Scanner;

public class ex9_baiTap {
    public static void main(String[] args) {
        // ex: nhập vào ngày sinh và tính tuổi
        int day, month, year, yearOld;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ngày: ");
        day = sc.nextInt();
        System.out.println("nhập tháng: ");
        month = sc.nextInt();
        System.out.println("nhập năm: ");
        year = sc.nextInt();

        // khởi tạo
        Calendar brd = Calendar.getInstance();
        brd.set(year,month -1, day);
        // xuất
        int namsinh = brd.get(Calendar.YEAR);
        int thangsinh = brd.get(Calendar.MONTH);
        int ngaysinh = brd.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngaysinh+ "/" + (thangsinh + 1) + "/" + namsinh);

        // tính tuổi
        Calendar now = Calendar.getInstance();
        int namht = now.get(Calendar.YEAR);
        // tính
        yearOld = namht - namsinh;
        System.out.println( yearOld);
    }
}
