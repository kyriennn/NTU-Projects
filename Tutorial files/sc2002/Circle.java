package sc2002;

public class Circle extends Point{
    private double radius;

    public Circle(int x, int y, double rad){
        super(x, y);
        radius = rad;
    }
    
    public void setRadius(double rad){
        radius = rad;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Centre: (" + x +", " + y + "), Radius = " + radius;
    }
}
