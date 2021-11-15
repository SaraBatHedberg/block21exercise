import java.awt.*;

public class TestOverlaps {
    public static void main(String[] args){

        Square s = new Square(90,90);
        Triangle t = new Triangle(10,10);
        Rectangle r = new Rectangle(60,60);
        Polygon q = new Triangle(50, 50);


        t.overlaps(s);
        r.overlaps(s);
        s.overlaps(s);
        q.overlaps(s);

        System.out.println("-----------------------------------------");

        t.overlaps(t);
        r.overlaps(t);
        s.overlaps(t);
        q.overlaps(t);

        System.out.println("-----------------------------------------");

        t.overlaps(r);
        r.overlaps(r);
        s.overlaps(r);
        q.overlaps(r);

        System.out.println("-----------------------------------------");

        t.overlaps(q);
        r.overlaps(q);
        s.overlaps(q);
        q.overlaps(q);



    }

}
