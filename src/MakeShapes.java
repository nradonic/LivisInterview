/**
 * Created by NickRadonic on 12/20/15.
 */
public class MakeShapes {
    public static void main(String[] args){
        MyShapes myShapes = new MyShapes();

        Circle shapeC = new Circle(3.0);
        Rectangle shapeR = new Rectangle(14, 3);
        Square shapeS = new Square(6);

        myShapes.addShapeToCollection(shapeC);
        myShapes.addShapeToCollection(shapeR);
        myShapes.addShapeToCollection(shapeS);
        System.out.println(myShapes.getMyShapeCollection().toString());

        myShapes.sortMyShapes();
        System.out.println("Post sort:");
        System.out.println(myShapes.getMyShapeCollection().toString());
    }
}
