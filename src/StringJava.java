import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
        /*
        - java string là 1 lớp quản lý dữ liệu văn bản
        - chuổi là tập hợp các kí tự vd: " abc ba má chị ..."
        - khai báo trong nháy kép
        * */
        String s = " vũ đức tài" +
                "\n giới tính nam";
        System.out.println(s);
        // StringBuildel: là lớp dùng để quản lý 1 chuổi có thể thay đổi kích thước và nội dung
        StringBuilder str = new StringBuilder();
        // append: thên string vào cuối chuổi gốc
        str.append("xin chào ");
        str.append("mình đang học java");
        System.out.println(str);

        // insert: chèn string từ vị trí index => insert( vị trí index, chuổi cần nhâp)
        str.insert(3,"obama");
        System.out.println(str);
        // delete: xoá tất cả các kí tự từ vị trí Start đến vị trí end
        str.delete(3,8);
        System.out.println(str);
        // length: chả về độ dài chuổi bao gồm cả space
        System.out.println(str.length());
        // indexOf: kiểm tra vị trí xuất hiện đầu tiên của kí tự hoặc chuổi
        String s1 = "fpt cao đẵng fpt";
        System.out.println(s1.indexOf("fpt"));
        // lastIndexOf: trả về vị trí index xuất hiện cuối cùng của kí tự hoặc chuổi
        System.out.println(s1.lastIndexOf("fpt"));
        // contains: kiểm tra chuỗi có phải là chuổi con của chuỗi gốc đưa vào hay không
        String s2 = ".mp3";
        String s3 = "zing.mp3";
        boolean check = s3.contains(s2);
        if (check ){  // chech == true
            System.out.println("có");
        }else {
            System.out.println("không");
        }

        // substring: lấy 1 chuỗi con từ 1 chuỗi ban đầu
        String s4 = "qwertyuio";
        String s5 = s4.substring(3);
        String s6 = s4.substring(0,3);
        System.out.println(s5);
        System.out.println(s6);

        // replace: thay thế toàn bộ chuổi củ thành chuỗi mới
        String s7 = "tôi đi tìm tôi";
        String s8 = s7.replace("tôi","bạn");
        System.out.println(s7);
        System.out.println(s8);
        // replaceFirst: thay thế chuỗi kí tự đầu tiên tìm thấy bằng chuổi mới
        String s9 = s7.replaceFirst("tôi","chị");
        System.out.println(s9);
        // trim: xoá toàn bộ khoảng trắng ở đầu và cuối
        String s10 = "        tôi là vũ tài       ";
        String s11 = s10.trim();
        System.out.println(s10);
        System.out.println(s11);
        // xoá khoảng trăng ở cuối
        String s12 = s10.replaceAll("\\s+$","");
        System.out.println(s10);
        System.out.println(s12); // đã xoá kt cuối
        // xoá ở đầu
        String s13 = s10.replaceFirst("^\\s+","");
        System.out.println(s13); // đã xoá kt đầu
        // compareTo, compareTolgnoreCase( ko phân biệt hoa thường): so sánh 2 chuổi
        // compareTo
        String s15 = "A12345";
        String s16 = "a12345";
        System.out.println(s15.compareTo(s16));
        // compareTolgnoreCase
        String s17 = "A1234";
        String s18 = "a1234";
        System.out.println(s17.compareToIgnoreCase(s18));
        // StringBuilder: nối chuỗi
        StringBuilder stb = new StringBuilder("123456789");
        stb.insert(2,"tài");
        System.out.println(stb);
        // thêm vào cuối chuổi
        StringBuilder s19 = new StringBuilder("123456789");
        s19.append("tài");
        System.out.println(s19);
        // xoá từ start đến end
        StringBuilder s20 = new StringBuilder("123456789");
        s20.delete(1,5);
        System.out.println(s20);
        // đảo ngược chuổi
        StringBuilder s21 = new StringBuilder("123456789");
        s21.reverse();
        System.out.println(s21);
        // split: tách chuổi
        String s22 = "hello, world";
        String[] arr = s22.split(","); // tách theo giấu ","
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // đã tách
        }

        //  toLowercase: chuyển về chữ thường,
        //  toUppercase: chữ hoa
        String s23 = "Tôi đAng hỌc lẬp TrÌnh";
        System.out.println(s23.toLowerCase()); // chữ thường
        System.out.println(s23.toUpperCase()); // chữ hoa

        // toCharArray: tách chuổi thành kí tự rồi cho vào mảng
        String s24 = "agj@123";
        char[] arr2 = s24.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //
    }
}
