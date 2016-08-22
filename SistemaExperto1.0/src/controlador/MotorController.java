package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import jess.Fact;
import jess.JessEvent;
import jess.JessException;
import jess.RU;
import jess.Rete;
import jess.Value;

/**
 *
 * @author Alex
 */
public class MotorController implements Serializable{
    Rete motor;

    public MotorController() {
        try {
            motor = new Rete();
            
            motor.reset();
            motor.batch("clips/Rules.clp");
            //motor.run();
        } catch (JessException ex) {
            System.out.println(ex);
            //Logger.getLogger(MotorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void afirmar(ArrayList<String>climas,ArrayList<String>lugares,ArrayList<String>actividades) throws JessException, MalformedURLException, UnsupportedEncodingException{
        motor.reset();
        Recomendaciones.clear();
        //Iterator iterator = motor.listFacts();
        for(String hecho:climas){
            Fact f = new Fact("clima", motor);
            f.setSlotValue("tipo-clima", new Value(hecho, RU.STRING));
            motor.assertFact(f);
        }
        for(String hecho:lugares){
            Fact f = new Fact("lugares", motor);
            f.setSlotValue("lugares-interes", new Value(hecho, RU.STRING));
            motor.assertFact(f);
        }
        for(String hecho:actividades){
            Fact f = new Fact("actividades", motor);
            f.setSlotValue("tipo-actividades", new Value(hecho, RU.STRING));
            motor.assertFact(f);
        }
        //f=motor.findFactByFact(f);
        
        
        //motor.assertString("(\"Frío\")");
        
        motor.run();
        
        /*Recomendaciones r=new Recomendaciones();
        r.inicializarVentana();
        r.crearMapa();*/
        System.out.println(Recomendaciones.getRecomendaciones());
    }
    
    
    public void ejecutar(){
        try {
            this.motor.run();
        } catch (JessException ex) {
            Logger.getLogger(MotorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
