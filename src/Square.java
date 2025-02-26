import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Square extends Polygon {
    Square(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x - 10, centerPoint.y - 10, 20, 20);
    }

    @Override
    public String toString() {
        return "Square{}";
    }

    @Override
    public void overlaps(Polygon s){
        String tyype = this.toString();
        String other = s.toString();
        Polygon.overlapsHelper( "Square",tyype , other);
    }


}
