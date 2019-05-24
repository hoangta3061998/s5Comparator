import java.util.Comparator;
public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rect1 , Rectangle rect2){
        if(rect1.getArea()>rect2.getArea()){
            return 1;
        } else if(rect1.getArea()<rect2.getArea()){
            return -1;
        } else {
            return 0;
        }
    }
}
