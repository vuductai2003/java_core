package sach;

public class book {
    private String id, name;
    private int money;

    public book(String id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
    public book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void xuat(){
        System.out.printf("%-12s%-12s%-12d\n" , this.name , this.id , this.money);
    }
}
