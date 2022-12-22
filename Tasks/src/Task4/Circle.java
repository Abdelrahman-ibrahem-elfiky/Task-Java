package Task4;

public class Circle {
    public double radius=1.0;
    public String color="red";
    public Circle()
    {

    }
    public Circle(double radius)
    {
            this.radius=radius;
    }
    public Circle(double radius,String color)
    {
            this.radius=radius;
            this.color=color;

    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return radius+" "+color;
    }
    public double getArea()
    {
        return 3.14*(radius*radius);
    }
}
