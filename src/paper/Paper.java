package paper;

public class Paper {
    private int len;
    private int hig;
    boolean isUsed;

    public Paper() {
        len = 100;
        hig = 20;
        isUsed = false;
    }

    public void setLen(int len) {this.len = len;}
    public void setHig(int hig) {this.hig = hig;}
}
