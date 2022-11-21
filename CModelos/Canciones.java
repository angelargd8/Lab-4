/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CModelos;

public class Canciones {
    String nombre; 
    String duracion;
    String Autor;
    String genero;

    public Canciones(String nombre, String duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        Autor = autor;
        this.genero = genero;
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
     * @return String
     */
    public String getDuracion() {
        return duracion;
    }
    
    /** 
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    /** 
     * @return String
     */
    public String getAutor() {
        return Autor;
    }
    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        Autor = autor;
    }
    
    /** 
     * @return String
     */
    public String getGenero() {
        return genero;
    }
    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }



}
