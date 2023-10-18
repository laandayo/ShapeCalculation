package Repository;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public interface IShapeRepository {
    Triangle inputTriangle();
    Rectangle inputRectangle();
    Circle inputCircle();
}
