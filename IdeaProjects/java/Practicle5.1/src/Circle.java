public class Circle extends  Shape{
    double radius=1.0;
    Circle()
    {

    }
    Circle (double radius)
    {
        this.radius=radius;
    }
    Circle (double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;


    }
    double getRadius()
    {
        return  this.radius;
    }
    void  setRadius(double radius)
    {
        this.radius=radius;
    }
    double getArea()
    {
        return  3.14*this.radius*this.radius;
    }
    double getParimeter()
    {
        return  3.14*2*this.radius;
    }
    public String toString()
    {
        String s2;
        s2="A "+"Circle "+" with Radius="+this.radius+" which is a subclass of "+super.toString();
        return s2;
    }
}
