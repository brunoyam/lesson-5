import com.brunoyam.figures.Figure;
import com.brunoyam.figures.Point;
import com.brunoyam.figures.Rectangle;

public class Main {

    public static void main(String[] args) {
        Point topLeft = new Point(1.0, 3.0);
        Point bottomRight = new Point(4.0, 1.0);
        Figure rectangle1 = new Rectangle(topLeft, bottomRight);

        Figure rectangle2 = new Rectangle(new Point(1.0, 4.0), new Point(2.0, 1.0));
        System.out.println(((Rectangle) rectangle2).getTopLeft());
        System.out.println(((Rectangle) rectangle2).getBottomRight());

        System.out.println("Периметр: " + rectangle1.getPerimeter());
        System.out.println("Площадь: " + rectangle1.getSquare());
    }
}
