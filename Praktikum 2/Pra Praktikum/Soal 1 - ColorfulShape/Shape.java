public class Shape {
    private Color color;
    private String name;

    /**
     * Konstruktor Shape
     * 
     * @param color
     * @param name
     */
    public Shape(Color color, String name) {
        // TODO: Print constructor message with format
        // "Shape is being built with color [color] and name '[name]'"
        // Example: if color is RGB(255, 0, 0) and name is "Circle", print
        // "Shape is being built with color RGB(255, 0, 0) and name 'Circle'"
        System.out.println("Shape is being built with color " + color + " and name '" + name + "'");
        this.color = color;
        this.name = name;

        // TODO: Initialize the color and name instance variables 
        // with the parameter values
    }

    /**
     * Default constructor for Shape
     */
    public Shape() {
        // TODO: Print constructor message 
        // "Shape is being built with default color and name 'Default'"
        System.out.println("Shape is being built with default color and name 'Default'");

        // TODO: Initialize color with a new Color(0, 0, 0)
        // TODO: Initialize name with "Default"
        this.color = new Color(0, 0, 0);
        this.name = "Default";
    }

    /**
     * Constructor with name parameter
     * 
     * @param name the name of the shape
     */
    public Shape(String name) {
        // TODO: Print constructor message 
        // "Shape is being built with default color and name '[name]'"
        // Example: if name is "Circle", print
        // "Shape is being built with default color and name 'Circle'"
        System.out.println("Shape is being built with default color and name '" + name + "'");

        // TODO: Initialize color with a new Color(0, 0, 0)
        // TODO: Initialize name with the parameter value
        this.color = new Color(0, 0, 0);
        this.name = name;
    }

    /**
     * Constructor with RGB parameters
     * 
     * @param r red component (0-255)
     * @param g green component (0-255)
     * @param b blue component (0-255)
     */
    public Shape(int r, int g, int b) {
        // TODO: Print constructor message 
        // "Shape is being built with color RGB(r, g, b) and default name 'Default'"
        // Example: if r=255, g=0, b=0, print
        // "Shape is being built with color RGB(255, 0, 0) and default name 'Default'"
        System.out.println("Shape is being built with color RGB(" + r + ", " + g + ", " + b + ") and default name 'Default'");

        // TODO: Initialize color with a new Color(r, g, b)
        // TODO: Initialize name with "Default"
        this.color = new Color(r, g, b);
        this.name = "Default";
    }

    /**
     * getColor
     * 
     * @return color
     */
    public Color getColor() {
        // TODO: Return the color instance variable
        return color;
    }

    /**
     * setColor
     * 
     * @param color
     */
    public void setColor(Color color) {
        // TODO: Set the color instance variable to the parameter value
        this.color = color;
    }

    /**
     * getName
     * 
     * @return name
     */
    public String getName() {
        // TODO: Return the name instance variable
        return name;
    }

    /**
     * setName
     * 
     * @param name
     */
    public void setName(String name) {
        // TODO: Set the name instance variable to the parameter value
        this.name = name;
    }
}