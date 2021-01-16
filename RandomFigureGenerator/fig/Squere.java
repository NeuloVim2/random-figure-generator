package fig;

class Squere implements Figure {

    private String color      = "red";
    private double sideLength = 4;

    public Squere( String colorParam, double sideLengthParam ) {
        color = colorParam;
        sideLength = sideLengthParam;
    }

    public void drawFigure() {
        double figuireArea = findArea();
        String color       = getColor();
        System.out.println("Figuire: Squere\nArea - " + figuireArea + ";\nColor - " + color + ";\nSide length - " + sideLength + ";\n");
    }

    public String getColor() {
        return color;
    }

    public double findArea() {
        return sideLength * sideLength;
    }
    
}