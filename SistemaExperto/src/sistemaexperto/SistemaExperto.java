/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto;

import jess.*;

/**
 *
 * @author USUARIO
 */
public class SistemaExperto {

    /**
     * @param args the command line arguments
     */
    public static String nom = "hola.CLP";

    public static void main(String[] args) throws JessException {
        // TODO code application logic here
        Rete r = new Rete();
        r.batch(nom);
        r.reset();
        r.run();
    }
    
}
