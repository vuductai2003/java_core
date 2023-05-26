package ban;

import java.util.ArrayList;
import java.util.Scanner;

public class manageTable {
    ArrayList <table> arrTable = new ArrayList<>();
    void imprt(){
        int k,d=0;
        do {
            d++;
            table t = new table();
            Scanner sc = new Scanner(System.in);
            System.out.println("ban so: " + d);
            System.out.println("loại bàn: ");
            t.setSizieable(sc.nextLine());
            System.out.println("nhập dài: ");
            t.setLength(sc.nextDouble());
            System.out.println("nhập rộng: ");
            t.setWidth(sc.nextDouble());
            arrTable.add(t);
            System.out.println("nhập tiếp: ");
            k = sc.nextInt();
        }while (k!=0);
    }

    void export(){
        for (table tbl : arrTable){
            tbl.ex();
        }
    }

}
