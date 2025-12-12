public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        width = 25;
        height= 10;
        System.out.println("Default rectangle created: width = 25, height = 10");
    }

    public Rectangle(int w, int h) {
        if (w < 0 || w > 30 || h < 0 || h > 30) {
            System.out.println("invalid sizes");
            this.width = 0;
            this.height = 0;
        } else {
            this.width = w;
            this.height = h;

            System.out.println("the Rectangle has been created with: width = " + width + ", height = " + height);
        }
    }

    public int getArea() {
        return width * height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
