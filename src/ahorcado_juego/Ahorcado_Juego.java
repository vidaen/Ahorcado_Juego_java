
package ahorcado_juego;

import java.util.Scanner;

public class Ahorcado_Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese palabra Secreta")
        String palabraSecreta = "";
        
        int intentosmaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //buble para recorrer la palabraSecreta y con el iterador 
        //reemplazamoslos lugares de las letras por guiones
        System.out.println( "la cantidad de letras es:( " +palabraSecreta.length()+ " )");
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            
            letrasAdivinadas[i] = '_';
          
           letrasAdivinadas[0]= palabraSecreta.charAt(0);
        }
        while (!palabraAdivinada && intentos < intentosmaximos) {
//          
          System.out.println("La palabra es= "+  String.valueOf(letrasAdivinadas));

            System.out.println("introduce una letra");
            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;
            //bucle para recorrer la palabra xletra(i q es iterador) y si la letra
            //ingresada es igual a la que esta en el guion la reemplazamos
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("No esta. Te quedan= " + (intentosmaximos - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                System.out.println("Ganaste. La palabra es=" + palabraSecreta);
                palabraAdivinada = true;
            }

        }
        //Para avisar que perdio
        if (!palabraAdivinada) {
            System.out.println("Se agotaron los intentos");
            System.out.println("---Gamer Over----");
        }
        sc.close();

    }
} 