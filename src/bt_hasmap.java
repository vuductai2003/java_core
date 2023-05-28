import java.util.HashMap;
import java.util.Scanner;

public class bt_hasmap {
    public static void main(String[] args) {
        /*viết ct sử dụng dict chứa 10 usename và pass
        * ct yêu cầu nhập vào usename và pass
        * nếu use ko có trong dict thfi báo ko tồn tại
        * nếu use đugns pass ssai thì thông báo*/

        // tạo hasmap
        HashMap<String,String> user = new HashMap<>();
        user.put("use1","123456");
        user.put("use2","654321");
        user.put("use3","129456");
        user.put("use4","154456");
        user.put("use5","124456");
        user.put("use6","165456");
        user.put("use7","199456");
        user.put("use8","169456");
        user.put("use9","166456");
        user.put("use10","613456");
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập username: ");
        String usename = sc.nextLine();
        System.out.println("nhập pass: ");
        String pass = sc.nextLine();

        // kiêm tra
        if (!user.containsKey(usename)){
            System.out.println("use ko tồn tại");
        } else if (!user.get(usename).equals(pass)) {
            System.out.println("sai mật khẩu");
        }else {
            System.out.println("thành công"); // thành quả
        }
    }
}
