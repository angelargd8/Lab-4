/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CModelos;

public class Contactos {
    String Nombre;
    int Numero;
    public Contactos(String nombre, int numero) {
        Nombre = nombre;
        Numero = numero;
    }
    
    /** 
     * @return String
     */
    public String getNombre() {
        return Nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    /** 
     * @return int
     */
    public int getNumero() {
        return Numero;
    }
    
    /** 
     * @param numero
     */
    public void setNumero(int numero) {
        Numero = numero;
    }


}
