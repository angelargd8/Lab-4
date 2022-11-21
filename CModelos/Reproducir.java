/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CModelos;

import java.util.ArrayList;

public class Reproducir {
    String nombre;
    ArrayList<Canciones> canciones = new ArrayList<>();
    
    public Reproducir(String nombre) {
        this.nombre = nombre;
        //this.canciones = canciones;
    }
    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** 
     * @return ArrayList<Canciones>
     */
    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }
    
    /** 
     * @param canciones
     */
    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }



}
