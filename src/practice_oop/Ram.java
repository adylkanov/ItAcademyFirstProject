package practice_oop;

public class Ram {
    int size;
    String model;

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        String message = "Model: " + getModel() + "Size: " + getSize();
        return message;
    }
}
