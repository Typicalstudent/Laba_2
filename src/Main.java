import paper.OfficePaper;
import paper.Paper;
import paper.PhotoPaper;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Printer printer =  new Printer();
        printer.printText((OfficePaper)human.PaperFill(0));
        printer.printImage((PhotoPaper)human.PaperFill(1));
    }
}
