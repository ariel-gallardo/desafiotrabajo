package com.example.java;

import java.math.BigInteger;

class Puzzle {



    final static Long M = 2021L;

    private static BigInteger compute(Long n) {
        /*
         * Primero calcule el modulo para ver por cuantos numeros 1 tengo que
         * multiplicar n. Esta tarea me va a facilitar utilizar la funcion repeat que
         * lleva menos tiempo de procesamiento que un bucle for.
         */
        Long numUnos = n % M;

        // Repeti n x numUnos veces.
        String repeticion = n.toString().repeat(Integer.valueOf(numUnos.toString()));

        // Converti la repeticion a un BigInteger
        return new BigInteger(repeticion);
    }

    public static void main(String args[]) {

        for (long n : new long[] { 1L, 2L, 5L, 10L, 20L, 67489454811002199L }) {

            System.out.println("" + n + ": " + compute(n));

        }

    }

}
