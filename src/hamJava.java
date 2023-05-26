public class hamJava {
    // hàm có giá trị trả về (bắt buộc phải có return trong hàm )
    public static int sum(int x,int y){
        System.out.println(x);
        System.out.println(y);
        return x + y;
    }
    //

    // hàm ko có giá trị trả về
    /*
    trong chuổi không thể so sánh == mà phải dùng "equals"
    * */
    public static void helllo(String sex){
    if (sex.equals("nu")){
        System.out.println("toi la nu");
    }else if (sex.equals("nam")){
        System.out.println("toi la nam");
    }
    }
    public static void main(String[] args) {
        var kp = sum(4,5);
        System.out.println(kp);
        // gọi hàm hello
        helllo("nu");
    }
}
