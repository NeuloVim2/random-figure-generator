package fig;

public class IsoscelesRightTriangle {
    
    private String color       = "green";
    private double sideLength  = 6;
    private double hypotenus = 6;

    public IsoscelesRightTriangle( String colorParam, double sideLengthParam, double hypotenusParam ) {
        color      = colorParam;
        sideLength = sideLengthParam;
        hypotenus  = hypotenusParam;
    }

    public void drawFigure() {
        double figuireArea = findArea();
        String color       = getColor();
        double hypotenus   = getHypotenus();
        System.out.println("Figuire: Isosceles Right Triangle\nArea - " + figuireArea + ";\nColor - " + color + ";\nSide length - " + sideLength + ";\nHypotenus - " + hypotenus + ";\n");
    }

    public String getColor() {
        return color;
    }

    public double findArea() {
        return sideLength * hypotenus / 2;
    }

    public double getHypotenus() {
        return hypotenus;
    }
    
}
