package Task3;

public class circle {
    float radius;
    final float  k= (float) 3.14;
    public circle(float r)
    {
        radius=r;
    }
    public void setRadius(float r)
    {
        this.radius=r;
    }
    public float area()
    {
        return k*(radius*radius);
    }
    public float perimeter ()
    {
        return k*(radius*2);
    }
    public void display_data()
    {
        System.out.println("area="+area());
        System.out.println("perimeter="+perimeter());
    }
}
