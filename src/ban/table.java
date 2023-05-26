package ban;

public class table {
    private String sizieable;double length, width;

    double acreage(){
        return length*width;
    }
    public table(){

    }

    public table(String sizieable, double length, double width) {
        this.sizieable = sizieable;
        this.length = length;
        this.width = width;
    }

    public String getSizieable() {
        return sizieable;
    }

    public void setSizieable(String sizieable) {
        this.sizieable = sizieable;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void ex(){

        System.out.printf("\n%-12d%-12d%-12d", this.length, this.width, this.acreage());
    }
}
