package practice_oop;

public class OperatingSystem {
    String name;
    String version;

    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        String message = "Name: " + getName() + "Version: " + getVersion();
                return message;
    }
}
