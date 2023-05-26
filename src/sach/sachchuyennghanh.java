package sach;

public class sachchuyennghanh extends book {
    private int idSach;

    public sachchuyennghanh(String id, String name, int money, int idSach) {
        super(id, name, money);
        this.idSach = idSach;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    @Override
    public void xuat() {
        super.xuat();
    }
}
