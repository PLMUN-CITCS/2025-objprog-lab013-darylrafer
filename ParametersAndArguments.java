public class ParametersAndArguments {
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;
         //... (variable declarations)...
         int area = calculateArea(roomWidth, roomHeight);
         System.out.println("The calculated area is: " + area);
    }
    //... (main method)...

    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}