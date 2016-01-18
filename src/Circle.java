/**
 * Created by NickRadonic on 12/20/15.
 */
public class Circle extends shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(shape o) {
        return Double.compare(this.area(), o.area());
    }
}
