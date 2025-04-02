//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTR;
        areaTR = (A * C) / 2;

        double areaC;
        double pi;
        pi = 3.14159;
        areaC = pi * (C * C);

        double areaT;
        areaT = (A + B) * C / 2;

        double areaQ;
        areaQ = B * B;

        double areaR;
        areaR = A * B;

        System.out.printf("triangulo: %.3f%n", areaTR);
        System.out.printf("circulo: %.3f%n", areaC);
        System.out.printf("trapezio: %.3f%n", areaT);
        System.out.printf("quadrado: %.3f%n", areaQ);
        System.out.printf("retangulo: %.3f%n", areaR);

        sc.close();
    }
}
