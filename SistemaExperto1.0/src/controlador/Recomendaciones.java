/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
public class Recomendaciones implements Serializable{
    private static ArrayList<String> recomendaciones = new ArrayList();
    private static final HashMap<String,PuntoTuristico> puntosTuristicos = new HashMap<>();
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
                System.out.println("Key: "+e.getKey() + " - Valor: " + p.mostrarPunto());
            }
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
    public static void main(String[] args){
        Recomendaciones r=new Recomendaciones();
        r.readTuristPoints();
    }
    class PuntoTuristico{
        private float longitud;
        private float latitud;
        private String nombre;
        private String descripcion;

        public PuntoTuristico(float longitud, float latitud, String nombre, String descripcion) {
            this.longitud = longitud;
            this.latitud = latitud;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public float getLongitud() {
            return longitud;
        }

        public void setLongitud(float longitud) {
            this.longitud = longitud;
        }

        public float getLatitud() {
            return latitud;
        }

        public void setLatitud(float latitud) {
            this.latitud = latitud;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        
        public String mostrarPunto(){
            return this.descripcion+" latitud: "+this.latitud+" longitud: "+this.longitud;
        }
        
        
    }
}
