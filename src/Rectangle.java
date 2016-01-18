/**
 * Created by NickRadonic on 12/20/15.
 */
public class Rectangle extends shape {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public int compareTo(shape o) {
        return Double.compare(this.area(), o.area());
    }
}
