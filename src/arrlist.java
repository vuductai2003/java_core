import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrlist {
    public static void main(String[] args) {
        /*
        * do hạn chế của mảng: ko thể thêm, xoá
        * java cung cấp tập collection
        * có 2 lớp collection:
        * array list và hasmap
        * arratlist: nó giống như là mảng nhưng có thể co giản kích thước phần tử
        * hasmap: cho phép bạn lưu trữ các cặp( key, value) và tìm kiếm các giá trị bằng key
        *
        * khai báo list:
        * sử dụng wrapper class( chữ cái viết hoa)*/
        ArrayList<Integer> lst = new ArrayList<>();
        // khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst1= new ArrayList<>(5);
        // khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1,2,3,4));
        // xuất list
//        System.out.println(lst);
//        System.out.println(lst1);
//        System.out.println(lst2);

        // add: thêm phầm tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(7);
        lst4.add(78);
        lst4.add(1,99); // thêm số 99 vào vị trí 1
        System.out.println(lst4);

        // size: trả về số phần tử của list
        System.out.println("số phần tử của list 4 là: " + lst4.size());

        // get: trả về giá trị list tại vị tri index
        System.out.println(lst4.get(2));

        // remove: xoá phần tử theo index
        lst4.remove(1);
        System.out.println("list sau xoá" + lst4);

        //  remove ( 1 phần tử dc chỉ định):
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4));
        lst5.remove(Integer.valueOf(2));
        System.out.println("sau xoá" + lst5);

        // set: thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4));
        lst6.set(1,99);
        System.out.println(lst6);

        // contains: kiểm tra collection có chưa phần tử nào đó hay ko
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4));
        boolean ktra = lst7.contains(4);
        System.out.println(ktra);

        // collections.soft: sắp xếp tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(11,2,32,41));
        Collections.sort(lst8);
        System.out.println(lst8);

        // index of: tìm vị trí của element trong list, nếu ko tồn tại thì trả về 0
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(lst9.indexOf(3));

        // duyệt list
        // cách 1: dùng for
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(1,2,3,4));
        for (int l :lst10){
            System.out.println(l);
        }
        // cách 2: dùng các chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(12,2,33,4));
        for (int i = 0; i<lst11.size(); i++){
            int vl = lst11.get(i);
            System.out.println(vl);
        }
    }
}
