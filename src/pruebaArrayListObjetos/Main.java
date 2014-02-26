/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaArrayListObjetos;

import java.util.ArrayList;

/**
 *
 * @author A7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoPrecioso Patata = new ObjetoPrecioso("Patata");
        ArrayList<ObjetoPrecioso> lista = new ArrayList<ObjetoPrecioso>();
        
        // Guarda un objeto en la lista con el String "Patata"
        lista.add(Patata);
        System.out.println("Añadiendo " + Patata.toString());
        
        // Modifica el String a "Terror", y lo añade a la lista
        Patata.setPatata("Terror");
        lista.add(Patata);
        System.out.println("Añadiendo " + Patata.toString());
        
        /*
         * Recorre el array y muestra lo que contiene. Y aquí se ve que devuelve
         * dos veces "Terror", luego en el array hay referencias a los objetos.
         */
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(Patata.toString());
        }
        
    }
}
