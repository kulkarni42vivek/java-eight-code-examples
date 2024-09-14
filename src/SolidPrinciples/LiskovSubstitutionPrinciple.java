package SolidPrinciples;

class Rectangle{
    int length ;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return this.length * this.width;
    }
}
class Square extends Rectangle{

    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }


    public void setHeight(int height){
        super.setWidth(height);
        super.setLength(height);
    }
}
public class LiskovSubstitutionPrinciple {
    public static void resizeRectangle(Rectangle r) {
        r.setWidth(5);
        r.setLength(10);
        System.out.println("Expected area: 50, Actual area: " + r.getArea());
    }
    public static void main(String[] args) {
        // the subclass should be replaceble where there is superclass without affecting the prgramm correctness
        Rectangle rectangle = new Rectangle();
        resizeRectangle(rectangle);

        Square square = new Square();
        resizeRectangle(square);
    }
}
