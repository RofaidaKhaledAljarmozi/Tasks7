import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        setLocation(x,y);
        setSize(width,height);
    }
    public double getPerimeter()
    {
        double Perimeter=2*(super.getHeight()+super.getWidth());
        return  Perimeter;
    }
    public double getArea()
    {
        double Area=super.getHeight()*super.getWidth();
        return Area;
    }}
