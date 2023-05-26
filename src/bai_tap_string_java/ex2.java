package bai_tap_string_java;

public class ex2 {
    public static void main(String[] args) {
        /*bài 2
        * cho string str1 = " English = 78 = Science = 83 Math = 68 History = 65"
        * 1. tính tổng các số trên
        * 2. tính tbc*/

        String str1 = " English = 78 = Science = 83 Math = 68 History = 65";
        int sum = 0, count = 0;
        // tách chuỗi thành các phần
        String[] part = str1.split(" ");
        // duyệt qua từng phần và chuyển nó sang kiểu số nếu có thể
        for (String pt : part){
            System.out.println(pt);
            try {
                // chuyển đổi sang số nguyên bằng phương thức parseIn() của lớp integer
                int num = Integer.parseInt(pt);
                sum+=num; // cộng thêm số vào tổng
                count ++;
            } catch (NumberFormatException e){
                // để trống
            }
        }
        // tính tbc
        double tbc = (double) sum/count;
        System.out.println("tổng các số: " + sum);
        System.out.println("trung bình cộng: " + tbc);
    }
}

