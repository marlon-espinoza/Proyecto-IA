/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.csvreader.CsvReader;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class Recomendaciones implements Serializable{
    private static ArrayList<String> recomendaciones = new ArrayList();
    private ArrayList<String> puntosLugar = new ArrayList();
    private static final HashMap<String,PuntoTuristico> puntosTuristicos = new HashMap<>();
    private javax.swing.JLabel JLABEL_MAPA;
    private javax.swing.JFrame ventana = new JFrame("Mapa");
    private javax.swing.JLabel JlabelEc;
    private javax.swing.JLabel JlabelGa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList ListaR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel jPanelR;
    
    public void readTuristPoints(){
        try {
         
            ArrayList<String[]> usuarios = new ArrayList();
            CsvReader datosTuristicos = new CsvReader("src/datos/puntos_turisticos.csv");
            datosTuristicos.readHeaders();

            while (datosTuristicos.readRecord())
            {
                String coordenadas = datosTuristicos.get(0);
                String descripcion = datosTuristicos.get(1);
                String nombre = datosTuristicos.get(2);
                Float[] f = new Float[2];
                f=coordenadas(coordenadas);
                if(f!=null){
                    Float lat=new Float(f[1]);
                    Float log=new Float(f[0]);

                    PuntoTuristico p = new PuntoTuristico(lat, log, nombre, descripcion);
                    puntosTuristicos.put(nombre, p);

                }
            }

            datosTuristicos.close();
            
            System.out.println(puntosTuristicos.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clear() {
        System.out.println("Entra al clear");
        recomendaciones.clear();
    }
    
    public static ArrayList<String> getRecomendaciones() {
        return recomendaciones;
    }
    
    public HashMap<String,PuntoTuristico> getPuntosTuristicos(){
        HashMap<String,PuntoTuristico> recomendaciones = new HashMap();
        for(String nombrePunto:this.recomendaciones){
            System.out.println(nombrePunto);
            System.out.println((PuntoTuristico)this.puntosTuristicos.get(nombrePunto));
            PuntoTuristico p= (PuntoTuristico)this.puntosTuristicos.get(nombrePunto);
            recomendaciones.put(nombrePunto,p);
        }
        return recomendaciones;
    }
    public static void setRecomendaciones(ArrayList<String> recomendaciones) {
        Recomendaciones.recomendaciones = recomendaciones;
    }
    
    public static void addRecomendacion(String value){
        recomendaciones.add(value);
    }
    private static Float[] coordenadas(String datos){
        String[] s = datos.split(",");
        if(s.length==2){
            Float[] coordenadas =new Float[]{Float.parseFloat(s[0]),Float.parseFloat(s[1])};
            return coordenadas;
        }
        else return null;
        
    }
    
}
