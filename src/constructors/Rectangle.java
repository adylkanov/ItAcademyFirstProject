package constructors;

public class Rectangle {
    int length;
    int width;

   public Rectangle(int l, int w) {
    width = w;
    length = l;
   }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}

