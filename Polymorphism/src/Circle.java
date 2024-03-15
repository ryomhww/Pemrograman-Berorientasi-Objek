public class Circle extends Shape{
    protected Double radius;

    public Circle(Double radius, String name) {
        super.setName(name);
        this.calculateArea(radius);
        this.calculateParimeter(radius);
    }

    public void calculateArea(double radius) {
        super.area = Math.PI * Math.pow(radius, 2);
    }

    public void calculateParimeter(double radius) {
        super.perimeter = 2 * Math.PI * radius;
    }
}