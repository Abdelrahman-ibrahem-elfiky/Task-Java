package Task4;

import java.util.zip.DeflaterOutputStream;

public class Cylinder extends Circle {
    double height=10;
    public Cylinder()
    {

    }
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height=height;

    }
    public Cylinder(double radius,String color,double height)
    {
        super(radius,color);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "radius="+radius+"\ncolor="+color+"\nheight="+height;
    }
    public double volume()
    {
        return getArea()*height;
    }
}
