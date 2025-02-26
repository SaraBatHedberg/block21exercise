import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Triangle extends Polygon {
    Triangle(int x, int y) {
        super(x,y);
    }

   @Override
    public void paint(Graphics g){
        g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
        g.drawLine(centerPoint.x-10, centerPoint.y+10,
                centerPoint.x+10, centerPoint.y+10);
        g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }

     @Override
    public void overlaps(Polygon t) {
        Polygon.overlapsHelper("Triangle", this.toString(), t.toString());
    }
    boolean overlaps (Triangle t){
        System.out.println("We do not know");
        return true;
    }
}
