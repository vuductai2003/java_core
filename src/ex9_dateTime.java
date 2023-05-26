import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ex9_dateTime {
    public static void main(String[] args) {
        // hàm date time: Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(ngay);
        System.out.println(thang+1); // muốn đúng tháng thì phải cộng thêm 1
        System.out.println(nam);

        // lấy ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR, 2003);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 8);
        // kiểm tra
        int nams = cal.get(Calendar.YEAR);
        int thangs = cal.get(Calendar.MONTH);
        int ngays = cal.get(Calendar.DAY_OF_MONTH);
        // xuất
        System.out.println("ngày tháng năm sinh "+ ngays+"/" + thangs +"/"+ nams);

        // xuất theo định dạng
        // SimpleDateFormat: định dạng ngày tháng năm giờ phút giây muốn xuất
        SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // tạo một đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dd.format(d);
        System.out.println(s);
    }
}
