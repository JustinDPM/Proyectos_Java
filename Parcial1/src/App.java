//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Models.Triangle;

import java.util.Scanner;

public class App {
    void main() {

        Scanner sc = new Scanner(System.in);

        double[] lados = new double[3];
        String color;
        boolean filled;
        int band;

        for (int i = 0; i < 3; i++){
            int contador = i + 1;
            System.out.println("Ingrese el lado " + contador + ": ");
            lados[i] = sc.nextDouble();
        }

        System.out.println("Ingrese el color: ");
        color = sc.next();

        System.out.println("¿La figura esta rellena?: 0/1");
        band = sc.nextInt();
        if (band == 0){
            filled = false;
        } else if (band == 1) {
            filled = true;
        } else {
            filled = false;
        }

        Triangle t1 = new Triangle(color,filled, lados[0],lados[1],lados[2]);

        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println(t1.toString());
    }
}