public class Size {
    int width;
    int height;
    int depth;

    public Size(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void showInfo(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Dimensions router: \nWidth: " + width + "\nHeight: " + height + "\nDepth: " + depth);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}