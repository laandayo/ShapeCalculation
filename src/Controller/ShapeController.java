package Controller;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import Repository.ShapeRepository;

public class ShapeController{
    ShapeRepository shapeRepository = new ShapeRepository();
    Rectangle rectangle = shapeRepository.inputRectangle();
    Circle circle = shapeRepository.inputCircle();
    Triangle triangle = shapeRepository.inputTriangle();

    public static void display(Rectangle rectangle, Circle circle, Triangle triangle) {
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
