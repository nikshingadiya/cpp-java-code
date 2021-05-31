import  java.lang.*;
public class ComparableCircle  {

    public  static   void main(String []args)
    {
        Circle c1=new Circle(12);
        Circle c2= new Circle(13);
        c1.compareTo(c2);

    }



}


class Circle implements  Comparable<Circle> {
    double radius;

    Circle(double radius) {
        this.radius = radius;

    }

    double getArea() {
        return 3.14 * this.radius * this.radius;

    }

    @Override
    public int compareTo(Circle circle1) {
        if (this.getArea() == circle1.getArea()) {
            System.out.println("Both Object is equal");
            return 0;
        }
        else if(this.getArea()>circle1.getArea())
        {
            System.out.println("Big Object(Circle) first one");
            return 1;
        }
        else {
            System.out.println("Big Object(Circle) is second one");
            return 2;
        }

    }




    }

