import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by NickRadonic on 12/20/15.
 */
public class MyShapes {
    ArrayList<shape> myShapeCollection = new ArrayList<shape>();

    public MyShapes(){

    }
    public void addShapeToCollection(shape myShape){
        myShapeCollection.add(myShape);
    }

    public void sortMyShapes(){
        Collections.sort(myShapeCollection);
    }

    public ArrayList<shape> getMyShapeCollection(){
        return myShapeCollection;
    }

}
