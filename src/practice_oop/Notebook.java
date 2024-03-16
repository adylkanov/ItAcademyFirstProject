package practice_oop;

import arrays.Array;

public class Notebook {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(512, 123);
        Hdd hdd1 = new Hdd(1028, 7000);
        Hdd[] hddArray = new Hdd[]{
                hdd, hdd1
        };
        Ram ram = new Ram(16, "SDD");
        char[] keyboardStickers = new char[]{'a', 'w', 'd', 's', 'f'};
        Cpu cpu = new Cpu("Core i5", 6, 3.33);
        OperatingSystem operatingSystem = new OperatingSystem("Windows", "22H2");
        Laptop laptop = new Laptop(hddArray, ram, cpu, operatingSystem, keyboardStickers);
        printLaptopInfo(laptop);

        Ram ram1 = new Ram(32, "RTX");
        OperatingSystem operatingSystem1 = new OperatingSystem("Ubuntu", "16.04");
        Cpu cpu1 = new Cpu("i9", 20, 10);

        laptop.setHddArray(hdd1);
        laptop.setRam(ram1);
        laptop.setOperatingSystem(operatingSystem1);
        laptop.setCpu(cpu1);
        printLaptopInfo(laptop);

    }

    public static void printLaptopInfo(Laptop laptop) {
        System.out.println("\n\nNOTEBOOK:");
        for (int i = 0; i < laptop.getHddArray().length; i++) {
            System.out.println("Hdd - size: " + laptop.getHddArray()[i].getSize()
                    + ";  speed: " + laptop.getHddArray()[i].getSpeed());
        }

        System.out.println("Cpu - model: " + laptop.getCpu().getModel()
                + "; core amount: " + laptop.getCpu().getCoreAmount()
                + "; frequency: " + laptop.getCpu().getFrequency()
                + "\nOperating system - name: " + laptop.getOperatingSystem().getName()
                + "; version: " + laptop.getOperatingSystem().getVersion()
                + "\nRam - size: " + laptop.getRam().getSize()
                + "; model: " + laptop.getRam().getModel());

        for (char i = 0; i < laptop.getKeyboardStickers().length; i++) {
            System.out.println("KeyboardSticker - " + laptop.getKeyboardStickers()[i]);
        }
        System.out.println(laptop);
    }
}