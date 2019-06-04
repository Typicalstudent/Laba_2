import paper.OfficePaper;
import paper.PhotoPaper;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Printer printer = new Printer();
        /* if button "print text" is pressed, uses printText func.
            stock parameters of text size is 600x400
         */
        printer.printText((OfficePaper) human.PaperFill(0), 600, 400);

        /* if button "print image" is pressed, uses printImage func.
            stock parameters of text size is 600x400
        */
        printer.printImage((PhotoPaper) human.PaperFill(1), 600, 400);
    }
}
