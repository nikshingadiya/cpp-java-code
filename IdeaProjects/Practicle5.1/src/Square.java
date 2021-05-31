public class Square extends  Rectangle{
      Square(double side)
    {
      super(side,side);
    }
    Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
    }
    double getSide()
    {
        return width;
    }
   void  setSide(double side)
    {
       width=side;

    }
   void setLength(double side)
    {
        length=side;
    }

    @Override
    public String toString() {
          String s4= "A "+this.getClass()+"Width= "+this.getSide()+"which   is   a   subclass   of "+super.toString();
          s4= "A  Square  with  side="+this.getSide()+" which   is   a   subclass   of  "+super.toString();
        return s4;
    }
}
