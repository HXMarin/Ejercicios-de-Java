package com.company;

public class Main {

    public static void main(String[] args) {
        int vector[] = {2, -5, 1, 20, 12};
        printVector(vector);
        maxVector(vector);
        minVector(vector);
        mediaVector(vector);
        burbujaVector(vector);
        printVector(vector);
        vector  = new int[]{2, -5, 1, 20, 12};
        seleccionVector(vector);
        printVector(vector);
        vector  = new int[]{2, -5, 1, 20, 12};
    }

    private static void printVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    private static void maxVector(int vector[]) {
        int maxNumber = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maxNumber) {
                maxNumber = vector[i];
            }

        }
        System.out.println("El valor Máximo es: " + maxNumber);
    }

    private static void minVector(int vector[]) {
        int minNumber = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < minNumber) {
                minNumber = vector[i];
            }
        }
        System.out.println("El Valor Mínimo es: " + minNumber);
    }

    private static void mediaVector(int vector[]) {
        int sumaVector = 0;
        int media = 0;
        for (int i = 0; i < vector.length; i++) {
            sumaVector = sumaVector + vector[i];
            media = sumaVector / vector.length;
        }
        System.out.println("La Media da: " + media);
    }

    private static void burbujaVector(int vector[]) {
        int tmp;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[j] < vector[j - 1]) {
                    tmp = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = tmp;
                }
            }
        }
    }

    private static void seleccionVector(int vector[]) {
        for (int i = 0; i < vector.length - 1; i++) {
            int tmp = vector[i];
            int minPosition = i;
            for (int j = i; j < vector.length; j++) {
                if (vector[j] < tmp) {
                    tmp = vector[j];
                    minPosition = j;
                }
            }
            vector[minPosition] = vector[i];
            vector[i] = tmp;
        }
    }
}
