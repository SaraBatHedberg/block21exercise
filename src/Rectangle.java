import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Rectangle extends Polygon {
    Rectangle(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }

     @Override
    public void overlaps(Polygon r){
        String tyype = this.toString();
        String other = r.toString();
        Polygon.overlapsHelper( "Rectangle",tyype , other);
    }

}
