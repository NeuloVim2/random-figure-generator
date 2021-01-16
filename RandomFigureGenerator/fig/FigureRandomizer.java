package fig;

public class FigureRandomizer {

    private String[] figures   = {"Circle", "Squere", "Triangle", "Trapezoid"};
    private String[] colors    = { "tomato", "lightgreen", "yellow", "violet", "blue", "red", "lightblue", "ultramarine", "black", "white"};
    private int figureQuantaty = 0;

    public void generete() {

        // Initialize min and max numbers for Math.random()
        int minQuantFig  = 1,
            maxQuantFig  = 10,
            minNum       = 1,
            maxNum       = 100,
            minColor     = 0,
            maxColor     = (int)colors.length - 1,

        // Initialize figures property for random calculations
            randomColor          = 0,
            randomFigure         = 0,

        // Squere property
            randomSideLength     = 0,

        // Circle property
            randomRadius         = 0,
        
        // IsoscelesRightTriangle property 
            randomHypotenus      = 0,
        
        // Trapizoid properties
            randomBaseA          = 0,
            randomBaseB          = 0,
            randomAltitude       = 0;

        // Generate random number to set figueres's quantaty
        setFigureQuantaty( generateWholoeNumInRange(minQuantFig, maxQuantFig) );

        for( int i = 0; i < getFigureQuantaty(); i++ ) {

            // Convert double random value to int and close it in range from 1 to number of elements in array
            randomFigure = (int)( Math.random() * figures.length );
            
            randomColor = generateWholoeNumInRange( minColor, maxColor ); // Get random color's index from colors array

            // Create new figure depending on randomFigure 
            switch (figures[randomFigure]) {

                case "Circle":

                    randomRadius = generateWholoeNumInRange( minNum, maxNum ); // Get random value of circle's radius;

                    Circle newCircle = new Circle( colors[randomColor], randomRadius ); // Initialize Circle with random parameters

                    newCircle.drawFigure();
                    
                    break;

                case "Squere":

                    randomSideLength = generateWholoeNumInRange( minNum, maxNum ); // Get random value of side length;

                    Squere newSquere = new Squere( colors[randomColor], randomSideLength ); // Initialize Circle with random parameters

                    newSquere.drawFigure();

                    break;

                case "Triangle":

                    randomSideLength = generateWholoeNumInRange( minNum, maxNum ); // Get random value of side length;

                    randomHypotenus = generateWholoeNumInRange( minNum, maxNum ); // Get random value of hypotenus;

                    IsoscelesRightTriangle newTriangle = new IsoscelesRightTriangle( colors[randomColor], randomSideLength, randomHypotenus ); // Initialize Circle with random parameters

                    newTriangle.drawFigure();

                    break;

                case "Trapezoid":

                    randomBaseA = generateWholoeNumInRange( minNum, maxNum ); // Get random value of trapizoid's side A;

                    randomBaseB = generateWholoeNumInRange( minNum, maxNum ); // Get random value of trapizoid's side B;

                    randomAltitude = generateWholoeNumInRange( minNum, maxNum );  // Get random value of trapizoid's altitude;

                    Trapezoid newTrapezoid = new Trapezoid( colors[randomColor], randomBaseA, randomBaseB, randomAltitude ); // Create new Trapezoid with random parameters

                    newTrapezoid.drawFigure();

                    break;

            };
        };
    };

    // Method for random generation of whole numbers in specifiec range
    private int generateWholoeNumInRange( int min, int max ) {

        // Evaluate random number from min to max including min and max
        return (int)(Math.random()*(max - min + 1) + min);

    };

    // figureQuantaty getter
    public int getFigureQuantaty() {
        return figureQuantaty;
    };

    // figureQuantaty setter
    private void setFigureQuantaty( int newVal ) {
        figureQuantaty = newVal;
    };

}