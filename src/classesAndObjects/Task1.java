package classesAndObjects;

public class Task1 {
    public static void main(String[] args) {
            Bmw bmw1 = new Bmw();
        bmw1.model = "M5F90";
        bmw1.color = "BLACK";
        bmw1.yearOfRelease = 2019;
        bmw1.producerCountry = "GERMANY";
        bmw1.price = 150000;
        bmw1.engine = "V12";

        System.out.println(" bmw1: " + "model: " + bmw1.model
                + "\n bmw1: " + "color: " + bmw1.color
                + "\n bmw1: " + "producerCountry: " + bmw1.producerCountry
                + "\n bmw1: " + "yearOfRelease: " + bmw1.yearOfRelease
                + "\n bmw1: " + "price: " + bmw1.price
                + "\n bmw1: " + "engine: " + bmw1.engine);



        Bmw bmw2 = new Bmw();
        bmw1.model = "M5E60";
        bmw1.color = "WHITE";
        bmw1.yearOfRelease = 2006;
        bmw1.producerCountry = "GERMANY";
        bmw1.price = 50000;
        bmw1.engine = "V8";

        System.out.println("\n \n bmw2: " + "model: " + bmw1.model
                + "\n bmw2: " + "color: " + bmw1.color
                + "\n bmw2: " + "producerCountry: " + bmw1.producerCountry
                + "\n bmw2: " + "yearOfRelease: " + bmw1.yearOfRelease
                + "\n bmw2: " + "price: " + bmw1.price
                + "\n bmw2: " + "engine: " + bmw1.engine);



        Bmw bmw3 = new Bmw();
        bmw1.model = "M4G82";
        bmw1.color = "GREEN";
        bmw1.yearOfRelease = 2021;
        bmw1.producerCountry = "GERMANY";
        bmw1.price = 100000;
        bmw1.engine = "V10";

        System.out.println("\n \n bmw3: " + "model: " + bmw1.model
                + "\n bmw3: " + "color: " + bmw1.color
                + "\n bmw3: " + "producerCountry: " + bmw1.producerCountry
                + "\n bmw3: " + "yearOfRelease: " + bmw1.yearOfRelease
                + "\n bmw3: " + "price: " + bmw1.price
                + "\n bmw3: " + "engine: " + bmw1.engine);
        }
    }

