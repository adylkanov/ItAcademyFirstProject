package practice_oop;

import java.util.Arrays;

public class Laptop {
    char keyboardStickers[];
    Hdd[] hddArray;
    Ram ram;
    Cpu cpu;
    OperatingSystem operatingSystem;


    public Laptop(Hdd[] hdd, Ram ram, Cpu cpu, OperatingSystem operatingSystem,char[] keyboardStickers) {
        this.hddArray = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.keyboardStickers = keyboardStickers;
    }

    public void setKeyboardStickers(char[] keyboardStickers) {
        this.keyboardStickers = keyboardStickers;
    }

    public char[] getKeyboardStickers() {
        return keyboardStickers;
    }

    public void setHddArray(Hdd hddArray) {
        this.hddArray = new Hdd[]{hddArray};
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Hdd[] getHddArray() {
        return hddArray;
    }

    public Ram getRam() {
        return ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
       String message;
        message = "Hdd: " + Arrays.toString(getHddArray())  +
                "\nRam: " + getRam().model + getRam().size +
                "\nOperationgSystem: " + getOperatingSystem().version + getOperatingSystem().name +
                "\nCpu: " + getCpu().model + getCpu().coreAmount + getCpu().frequency;
        return message;
    }
}
