import paper.*;

public class Printer {

    public void printText(OfficePaper paper) {
        System.out.println("printing text" );
        paper.used();
    }
    public void printImage(PhotoPaper paper) {
        System.out.println("printing image");
        paper.used();
    }
}
