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


public class Radio{
    String d;
    Boolean estado;
    int volumen;
    //modo radio
    String ModulacionDeOnda;
    Double emisoras;
    ArrayList<Double> EmisorasLista = new ArrayList<>();
    //modo reproduccion
    ArrayList<Canciones> canciones = new ArrayList<>();
    int NoLista=0;
    int IcancionActual=0;
    //modo telefono
    Boolean estadoTelefono;
    ArrayList<Contactos> Contactos = new ArrayList<>();
    Boolean EstadoLlamada;
    String Audio;
    ArrayList<Viajes> Viajes = new ArrayList<>();
    
    
    public Radio(Boolean estado, int volumen, String modulacionDeOnda, Double emisoras, ArrayList<Double> emisorasLista,
            ArrayList<Canciones> canciones, int noLista, int icancionActual, Boolean estadoTelefono,
            Boolean estadoLlamada, String audio) {
        this.estado = estado;
        this.volumen = volumen;
        ModulacionDeOnda = modulacionDeOnda;
        this.emisoras = emisoras;
        EmisorasLista = emisorasLista;
        this.canciones = canciones;
        NoLista = noLista;
        IcancionActual = icancionActual;
        this.estadoTelefono = estadoTelefono;
        //Contactos = contactos;
        Contactos= new ArrayList<Contactos>();
        EstadoLlamada = estadoLlamada;
        Audio = audio;
        //viajes
        Viajes= new ArrayList<Viajes>();

    }
    public Radio(){

    }
    
    
    /** 
     * @return ArrayList<Viajes>
     */
    public ArrayList<Viajes> getViajes() {
        return Viajes;
    }
    
    /** 
     * @param viajes
     */
    public void setViajes(ArrayList<Viajes> viajes) {
        Viajes = viajes;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean getEstadoLlamada() {
        return EstadoLlamada;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean setEstadoLlamada() {
        if (EstadoLlamada==false){
            EstadoLlamada= true;

        }else if (EstadoLlamada== true){
            EstadoLlamada= false;
        }
        return EstadoLlamada;
        //EstadoLlamada = estadoLlamada;
    }


    
    /** 
     * @return int
     */
    public int getIcancionActual() {
        return IcancionActual;
    }

    
    /** 
     * @param icancionActual
     */
    public void setIcancionActual(int icancionActual) {
        IcancionActual = icancionActual;
    }

    
    
    /** 
     * @return int
     */
    public int getNoLista() {
        return NoLista;
    }

    
    /** 
     * @param noLista
     */
    public void setNoLista(int noLista) {
        NoLista = noLista;
    }

    
    /** 
     * @return Boolean
     */
    //
    public Boolean getEstado() {
        return estado;
    }

    
    /** 
     * @return Boolean
     */
    //@Override
    public Boolean setEstado() {
        if (estado==false){
            estado= true;
        }else if (estado== true){
    
            estado= false;
        }
        return estado;
        
    }

    
    /** 
     * @return int
     */
    public int getVolumen() {
        return volumen;
    }
    
    /** 
     * @param tempVolumen
     */
    public void setVolumen(int tempVolumen) {
        if (volumen>=0){
            if (tempVolumen==1){
                volumen++;

            }else if (tempVolumen==2){
                volumen--;
                if (volumen<0){
                    volumen=0;
                    System.out.println("el volumen esta en lo más bajo");
                }
            }
        }
        //this.volumen = volumen;
    }

    
    /** 
     * @param tempmodulacionDeOnda
     */
    public void setModulacionDeOnda(String tempmodulacionDeOnda) {
            if (tempmodulacionDeOnda=="FM"){
                ModulacionDeOnda="AM";

            }else if (tempmodulacionDeOnda=="AM"){
                ModulacionDeOnda="FM";
            }

        //ModulacionDeOnda = modulacionDeOnda;
    }
    
    
    /** 
     * @return String
     */
    public String getModulacionDeOnda() {
        return ModulacionDeOnda;
    }
    



    
    /** 
     * @return Double
     */
    public Double getEmisoras() {
        return emisoras;
    }
    
    /** 
     * @param emisoras
     */
    public void setEmisoras(Double emisoras) {
        //int TempEmisoras
        /*if (emisoras>=0.00){
            if (TempEmisoras==1){
                emisoras+=0.5;

            }else if (TempEmisoras==2){
                emisoras-=0.5;
                if (emisoras<0.00){
                    emisoras=0.00;
                    System.out.println("no hay más emisoras");
                }
            }
        }*/
        this.emisoras = emisoras;
    }
    
    /** 
     * @return ArrayList<Double>
     */
    public ArrayList<Double> getEmisorasLista() {
        return EmisorasLista;
    }
    
    /** 
     * @param emisorasLista
     */
    public void setEmisorasLista(ArrayList<Double> emisorasLista) {
        EmisorasLista = emisorasLista;
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
    
    
    /** 
     * @return Boolean
     */
    public Boolean getEstadoTelefono() {
        return estadoTelefono;
    }
    
    /** 
     * @return Boolean
     */
    public Boolean setEstadoTelefono() {
        if (estadoTelefono==false){
            estadoTelefono= true;
        }else if (estadoTelefono== true){
    
            estadoTelefono= false;
        }
        return estadoTelefono;
        //this.estadoTelefono = estadoTelefono;
    }
    
    /** 
     * @return ArrayList<Contactos>
     */
    public ArrayList<Contactos> getContactos() {
        return Contactos;
    }
    
    /** 
     * @param contactos
     */
    public void setContactos(ArrayList<Contactos> contactos) {
        Contactos = contactos;
    }
    
    /** 
     * @return String
     */
    public String getAudio() {
        return Audio;
    }
    public void setAudio() {
        if (Audio=="speacker"){
            Audio="audifonos";
        }else if (Audio=="audifonos"){
            Audio="speacker";
        }
        //Audio = audio;
    }





}
