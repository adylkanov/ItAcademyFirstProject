package main;

import java.util.Random;
import static javax.swing.JOptionPane.showMessageDialog;
public class MyRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        number = random.nextInt (100);
        System.out.println(number);
        showMessageDialog(null,"Твоё рандомное число: " +number);

        int x = 10, y = 20;
//        x = random.nextInt(); //Псевдослучайное число
//        y = random.nextInt(); //Это уже другое число
        int result = random.nextInt((y - x) + 1) + x;
        System.out.println(result);

    }

    }

