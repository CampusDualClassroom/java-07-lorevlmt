package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {

        int num = 10;

        sumFirstNaturalNumbers(num);

        showFirstNaturalNumbers(num);
    }


    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
   public static void positionInAList(int num) {

   }


    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

        int total = 0;

        for (int i = 1; i <= num; i++) {
            total += i;

        }

        System.out.println("La suma de los primeros " + num + " números positivos es: " + total);
    }


    // Que imprima por pantalla los N primeros números positivos
   public static void showFirstNaturalNumbers(int num) {
       System.out.println("Los " + num + " primeros números positivos son: ");

       int positivos = 1;

       while (positivos <= num) {
           System.out.print(positivos + " ");
           positivos++;
       }


    }

}
