public class Rectangle extends Shape {
    double width=1.0;
    double length=1.0;
    Rectangle()
    {

    }
    Rectangle(double width,double length)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;

    }
    double getWidth()
    {
        return  this.width;

    }
    double getLength()
    {
        return  this.length;
    }
    void setWidth(double width)
    {
        this.width=width;
    }
    void setLength(double length){
        this.length=length;
    }
    double getArea()

    {
        return this.length*this.width;
    }
    double getParimeter()
    {
        return 2*(this.width+this.length);

    }
    public  String  toString()
    {
        String s3;
        s3="A "+"Rectangle"+" width= "+this.width+" and length ="+this.length+"  which is a subclass of "+super.toString();

        return  s3;
    }

}
