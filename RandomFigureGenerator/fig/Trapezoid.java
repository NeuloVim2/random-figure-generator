package fig;

public class Trapezoid {

    private String color = "ultramarine";
    private double altitude = 8;
    private double baseA = 6;
    private double baseB = 16;

    public Trapezoid( String colorParam, double baseAParam, double baseBParam, double altitudeParam ) {
        color    = colorParam;
        altitude = altitudeParam;
        baseA    = baseAParam;
        baseB    = baseBParam;
    }

    public void drawFigure() {
        double figuireArea = findArea();
        String color       = getColor();
        double baseA       = getBaseA();
        double baseB       = getBaseB();

        System.out.println("Figuire: Trapezoid\nArea - " + figuireArea + ";\nColor - " + color + ";\nAltitude - " + altitude + ";\nBase A - " + baseA + ";\nBase B - " + baseB + ";\n");
    }

    public String getColor() {
        return color;
    }

    public double findArea() {
        return ( baseA * baseB / 2 ) * altitude;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getAltitude() {
        return altitude;
    }
    
}