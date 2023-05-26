import java.util.Arrays;
import java.util.Scanner;

public class arrayJava {
    public static void main(String[] args) {
/*        // khai báo mảng
        String[] arrString;
        int[] arrint;
        // khai báo mảng kèm theo kích thước
        String[] arr = new String[15]; // chứa đc tối đa 15 phần tử
        int[] iarr = new int[10]; // chứa đc 10 pt
        // khai báo kèm giá trị ban đầu
        String[] sarr = new String[]{"tài","mùi","ngọc","nhật"};
        String[] sar = {"hoá","lí","văn"};
        // truy suất
        System.out.println(sarr[1]);
        // duyệt mảng dùng for
        for(String st: sarr){
            System.out.println(st);
        }
        // thay đổi giá trị cho mảng
        sarr[0] = "đức";
        for(String st: sarr){
            System.out.println(st);
        }
        // update toàn bộ danh sách
        int[] sarr2 = new int[]{1,2,3,4,5,6};
        for (int ar2 :sarr2){
            ar2 += 5;
            System.out.println(ar2);
        }*/

/*        // mảng 1 chiều
        // ex. viết chương trình tạo 1 mảng 1 chiểu gồm các phần tử là số nguyên có n phần tử, n do người dùng nhập từ bp
        Scanner sc = new Scanner (System.in);
        System.out.println("nhập vào số phần tử: ");
        int s = sc.nextInt();
        int[] arr1c = new int[s];
        // nhập sữ liệu cho từng phần tử
        for (int i = 0; i<s; i++){
            System.out.println("arric[" + i + "]= ");
            arr1c[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1c)); // xuất mảng
        // sort: xắp xếp mảng
        int[] sx = new int[]{1,3,2,6,5,4};
        Arrays.sort(sx);
        System.out.println(Arrays.toString(sx));
        // đâo ngược mảng
        int[] dn = new int[]{1,2,3,4,5,6};
        for (int i = 0,j=dn.length -1; i<j;i++,j--){
            int temp = dn[i];
            dn[i] = dn[j];
            dn[j] = temp;
        }
        System.out.println(Arrays.toString(dn));*/


        // phép gán mảng
        // gán mảng mới = mảng  đã tồn tại(tham chiêu cùng vùng nhớ)
        // chú ý: khi thay đổi giá trị của 1 mảng thì mảng còn lại cũng thay đổi, do mảng là kiểu tham chiếu, nó se tham chiếu đến 1 vùng nhớ
        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = arr5;
        // thay đổi vị trí o của mảng 5
        arr5[0] = 3;
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        // khi đó phải dùng clone mảng ( lưu trên vùng nhớ khác)
        int[] arr7 = {1,2,3,4,5};
        int[] arr8 = arr7.clone();
        // thay đổi vị trí o của mảng 7
        arr7[0] = 55;
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
    }
}
