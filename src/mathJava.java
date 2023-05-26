public class mathJava {
    public static void main(String[] args) {
        System.out.println("pi" + Math.PI);
        // trị tuyệt đối
        int a = -8;
        System.out.println(Math.abs(a));
        // max min

        System.out.println(Math.max(4,9));
        System.out.println(Math.min(4,9));

        // căn bậc 2
        System.out.println(Math.sqrt(4));
        // luỹ thừa (mũ)
        System.out.println(Math.pow(2,3));
        // sin cos tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        System.out.println(sin);
    }
}
