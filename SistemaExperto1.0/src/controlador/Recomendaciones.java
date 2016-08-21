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
import maps.java.StaticMaps.Maptype;

/**
 *
 * @author USUARIO
 */
public class Recomendaciones implements Serializable{
    private static ArrayList<String> recomendaciones = new ArrayList();
    private static final HashMap<String,PuntoTuristico> puntosTuristicos = new HashMap<>();
    private javax.swing.JLabel JLABEL_MAPA;
    private javax.swing.JFrame ventana = new JFrame("olla");
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
            Iterator it = puntosTuristicos.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry)it.next();
                PuntoTuristico p = (PuntoTuristico)e.getValue();
            }
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
            PuntoTuristico p=puntosTuristicos.get(nombrePunto);
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
    
   
 
    
    public Image getStaticMap(String centerAddress,int zoom,Dimension size,int scale,String format, String maptype) throws MalformedURLException, UnsupportedEncodingException{
        String URLRoot = "http://maps.googleapis.com/maps/api/staticmap";
        URL url=new URL(URLRoot + "?center=" + URLEncoder.encode(centerAddress, "utf-8") + "&zoom=" + zoom +
                "&size=" + size.width + "x" + size.height + "&scale=" + scale +
                "&format=" + format+ "&maptype=" + maptype + 
                "&markers=" + URLEncoder.encode(centerAddress, "utf-8")+"&region=es&language=es&sensor=false" );
        try {
            Image imageReturn;
            imageReturn=ImageIO.read(url);
            //storeInfoRequest(url,null,null,null);
            return imageReturn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
     }
    
    private void crearMapa() throws MalformedURLException, UnsupportedEncodingException{
             this.JLABEL_MAPA.setText("");
             Image imagenMapa=getStaticMap("ecuador",
                     Integer.valueOf(7),new Dimension(500,500),
                     Integer.valueOf(1),"png",
                     "roadmap");
            if(imagenMapa!=null){
                ImageIcon imgIcon=new ImageIcon(imagenMapa);
                Icon iconImage=(Icon)imgIcon;
                JLABEL_MAPA.setIcon(iconImage);
            }
         
     }
   
    public void ventana(){
            JLABEL_MAPA = new javax.swing.JLabel();
            
            ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            ventana.setSize(600, 600);
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(ventana.getContentPane());
            ventana.getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JLABEL_MAPA, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JLABEL_MAPA, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addContainerGap())
            );
        }
    
     public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException{
        Recomendaciones r=new Recomendaciones();
        r.readTuristPoints();
        r.ventana();
        r.crearMapa();
        r.ventana.setVisible(true);
    }
}
