
abstract class Shape {
    String color="red";
   abstract double getArea();


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
