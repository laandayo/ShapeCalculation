package Repository;
import Common.Validation;
import DataAccess.ShapeDao;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class ShapeRepository implements IShapeRepository {
    private static final ShapeDao data = new ShapeDao();
    @Override
    public Triangle inputTriangle() {
        return data.inputTriangle();
    }
    @Override
    public Rectangle inputRectangle() {
        return data.inputRectangle();
    }
    @Override
    public Circle inputCircle() {
        return data.inputCircle();
    }
}
