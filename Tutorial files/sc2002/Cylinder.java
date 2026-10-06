package sc2002;


public class Cylinder extends Circle{
    private int height;

    public Cylinder(int x, int y, double rad, int height){
        super(x, y, rad);
        this.height = height;
    }

    public int setHeight(int height){
        return this.height;
    }

    public int getHeight(){
        return this.height;
    }

    public double volume(){
        return super.area() * height;
    }

    public double area(){
        return 2 * super.area() + 2 * Math.PI * getRadius() * height;
    }

    public String toString(){
        return "Center: (" + x + ", " + y + ") Area: " + area() + ", Volume: " + volume();
    }
}
