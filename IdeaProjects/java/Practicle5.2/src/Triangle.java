public class Triangle extends  Shape {  /// you can extends Interface Shape1
int base;
int height;
    Triangle(int base,int height)
    {
    this.base=base;
    this.height=height;
    }

    @Override
    double getArea() {
        return 0.5*height*base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
