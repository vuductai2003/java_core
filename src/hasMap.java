import java.util.HashMap;

public class hasMap {
    public static void main(String[] args) {
        // khai báo
        HashMap<Integer, String> hm = new HashMap<>();

        // put(): thêm pt vào hm
        hm.put(1,"tài");
        hm.put(2,"nam");
        hm.put(3,"đức");

        // get(): lấy giá trị của pt
        String value = hm.get(1);
        System.out.println(value);

        // remove() xoá phần tử
        hm.remove(1);
        System.out.println(hm.get(1));

        // containsKey() kiểm tra xem có pt trong hm hay ko
        boolean ktra = hm.containsKey(2);
        System.out.println(ktra);
        //dđối với giá trị
        boolean kttra = hm.containsValue("đức");
        System.out.println(kttra);

        // isEmpty(): kiểm tra hm có rỗng ko
        boolean check = hm.isEmpty();
        System.out.println(check);

        // lấy số lượng pt trong hm
        int sl = hm.size();
        System.out.println(sl);

        // duyệt hm
        for (Integer key : hm.keySet()){
            String vl = hm.get(key);
            System.out.println(key + " :" + vl);
        }
    }
}
