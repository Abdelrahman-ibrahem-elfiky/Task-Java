package Task3;

public class rectangle {
    float length;
    float width;
    public rectangle(float l,float w)
    {
        length=l;
        width=w;
    }
    public void setLength(float l)
    {
        this.length=l;
    }
    public void setWidth(float w)
    {
        this.width=w;
    }
    public float getLength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    public float area ()
    {
        return length*width;
    }
    public float perimeter ()
    {
        return (length+width)*2;
    }
    public void display_data()
    {
        System.out.println("area="+area());
        System.out.println("perimeter="+perimeter());
    }
}
