public class Rectangle extends  Shape{    /// you can extends Interface Shape1
    int length;
    int width;
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }

    @Override
    double getArea() {
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
