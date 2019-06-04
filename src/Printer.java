import paper.*;

public class Printer {

    public void printText(OfficePaper paper, int newLen, int newHig) {
        System.out.println("printing text" );
        paper.used();
        paper.setLen(newLen);
        paper.setHig(newHig);
    }
    public void printImage(PhotoPaper paper, int newLen, int newHig) {
        System.out.println("printing image");
        paper.used();
        paper.setLen(newLen);
        paper.setHig(newHig);
    }
}
