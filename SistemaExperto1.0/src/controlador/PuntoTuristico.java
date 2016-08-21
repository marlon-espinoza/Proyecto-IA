/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author USUARIO
 */
public class PuntoTuristico{
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
