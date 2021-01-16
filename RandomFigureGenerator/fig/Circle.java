package fig;

public class Circle {

    private double radius = 8;
    private String color  = "violet";

    public Circle( String colorParam, double radiusParam ) {
        color  = colorParam;
        radius = radiusParam;
    }

    public void drawFigure() {
        double figuireArea = findArea();
        String color       = getColor();
        double radius      = getRadius();
        System.out.println("Figuire: Circle\nArea - " + figuireArea + ";\nColor - " + color + ";\nRadius - " + radius + ";\n");
    }

    public String getColor() {
        return color;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    
}