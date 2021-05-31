public class Shape {
    String color;
    boolean filled;
    Shape()
    {
        color="red";
        filled=true;
    }
    Shape(String color1,boolean filled1)
    {
        color=color1;
        filled=filled1;
    }
    String getColor()
    {

        return  color;
    }
    void setColor(String color1)
    {
           color=color1;
    }
    boolean isFilled()
    {
        return  filled;
    }
    void setFilled(boolean filled1){
        filled=filled1;
    }
    public  String toString()
    {
        String s1;
        s1="A  Shape  with  color  of "+getColor()+"  "+ filled;
        return s1;
    }

}
