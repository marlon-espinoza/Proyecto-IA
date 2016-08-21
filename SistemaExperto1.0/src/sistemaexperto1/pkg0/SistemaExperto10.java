/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto1.pkg0;

import controlador.MotorController;
import views.VentanaUsuario;

/**
 *
 * @author USUARIO
 */
public class SistemaExperto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaUsuario v=new VentanaUsuario();
        MotorController motorController = new MotorController();        
        //EventHandler eventController = new EventHandler(v);
        
        v.setMotorController(motorController);
        
        //motorController.addEscuchador(eventController);
        
        motorController.ejecutar();
    }
    
}
