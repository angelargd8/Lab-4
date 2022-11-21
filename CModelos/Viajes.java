/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CModelos;

public class Viajes {
    String Fecha;
    String Pais;
    String Ciudad;
    int boletos;
    public Viajes(String fecha, String pais, String ciudad, int boletos) {
        Fecha = fecha;
        Pais = pais;
        Ciudad = ciudad;
        this.boletos = boletos;
    }
    
    /** 
     * @return String
     */
    public String getFecha() {
        return Fecha;
    }
    
    /** 
     * @param fecha
     */
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    
    /** 
     * @return String
     */
    public String getPais() {
        return Pais;
    }
    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        Pais = pais;
    }
    
    /** 
     * @return String
     */
    public String getCiudad() {
        return Ciudad;
    }
    
    /** 
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    
    /** 
     * @return int
     */
    public int getBoletos() {
        return boletos;
    }
    
    /** 
     * @param boletos
     */
    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }

}
