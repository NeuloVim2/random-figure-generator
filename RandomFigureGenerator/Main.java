import fig.FigureRandomizer;

//* App divede into 7 classes where:
//** 4 classes are figure: Circle, IsoscelesRightTriangle, Squere, Trapezoid;
//** Figure class - the interface for Circle, IsoscelesRightTriangle, Squere, Trapezoid;
//** FigureRandomizer class - util that use figures classes to generate random quantaty of them;
//** Main class - implements main() method; 

// App entry point
public class Main {
    public static void main(String[] args) {

        // FigureRandomizer initialization
        FigureRandomizer newRandomizer = new FigureRandomizer();

        // Generete random number of radom figures type, where each have random properties
        newRandomizer.generete();

    }
}