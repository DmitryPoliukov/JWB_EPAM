package Tasks01.Task3;

import Tasks01.Scanners.Scanners;

public class Task3 {

    private static double readingArea(){
        System.out.println("Введите значение площади квадрата:");
        return Scanners.doubleScanner();
    }

    private static double secondArea(double firstArea){
        double radius = Math.sqrt(firstArea) / 2;
        return 2 * Math.pow(radius, 2);
    }


    public static void main(String[] args) {
        double firstArea = readingArea();
        System.out.println(String.format("Площадь вписанного квадрата %.4f", secondArea(firstArea)));
        double result = firstArea / (secondArea(firstArea));
        System.out.println(String.format("Плошадь вписанного квадрата меньше площади заданного в %.2f раз", result));
    }
}