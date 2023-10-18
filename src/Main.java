import Controller.ShapeController;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import Repository.ShapeRepository;

public class Main {
    public static void main(String[] args) {
        ShapeRepository sr = new ShapeRepository();
        System.out.println("\n");
        System.out.println("=====Calculator Shape Program=====");
        Rectangle rectangle = sr.inputRectangle();
        Circle circle = sr.inputCircle();
        Triangle triangle = sr.inputTriangle();
        ShapeController.display(rectangle, circle, triangle);
    }
}