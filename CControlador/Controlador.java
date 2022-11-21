/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CControlador;
import java.util.ArrayList;


import CModelos.Canciones;
import CModelos.IRadio;
import CModelos.Radio;
import CModelos.Reproducir;
import CVista.Vista;
import CModelos.Contactos;
import CModelos.Viajes;

public class Controlador implements IRadio{
    Vista vista;

////////////////////////////////canciones predeterminadas    
    Canciones cancion1= new Canciones("OG Black", "3:10", "Alvaro Días", "Regueton");
    Canciones cancion2= new Canciones("Willow", "3:40", "Taylor Swift", "Pop");
    Canciones cancion3= new Canciones("Normal", "2:51", "Feid", "Regueton");
    Canciones cancion4= new Canciones("Feliz cumpleaños Ferxxo", "2:37", "Feid", "Regueton");
    Canciones cancion5= new Canciones("Flashing Lights", "3:58", "Kanye West", "Hip hop/ rap");
    Canciones cancion6= new Canciones("una locura", "3:50", "Ozuna", "Regueton");

    ArrayList<Reproducir> ListaDeReproduccion = new ArrayList<>();
    
    Contactos contacto1= new Contactos("Angela Garcia", 54939428);
    Contactos contacto2= new Contactos("Sergio Palacios", 40124587);
    Contactos contacto3= new Contactos("Augusto Sanic", 47869524);
    Contactos contacto4= new Contactos("Ludwing Cano", 47869524);
    Contactos contacto5= new Contactos("Karol G", 50658545);

    Radio radio = new Radio( false, 0, "FM", 0.00, null, null, 0, 1, false, false, "speacker");
    //Radio radio = new Radio( false, 0, "FM", 0.00, null, null, 0, 1, false, null, false, "speacker");
    //Radio radio = new Radio( false, 0, "FM", 0.00, null, null, 0, 0, null, null, null, null,0);

    
    ArrayList<Double> ListaEmisorasGuardadas = new ArrayList<Double>();
    
    public Controlador(){
        ListaDeReproduccion.add(new Reproducir("Lista 1" ));
        ListaDeReproduccion.add(new Reproducir("Lista 2" ));

        ListaDeReproduccion.get(0).getCanciones().add(cancion1);
        ListaDeReproduccion.get(0).getCanciones().add(cancion2);
        ListaDeReproduccion.get(0).getCanciones().add(cancion3);
        ListaDeReproduccion.get(1).getCanciones().add(cancion4);
        ListaDeReproduccion.get(1).getCanciones().add(cancion5);
        ListaDeReproduccion.get(1).getCanciones().add(cancion6);
        //System.out.println(". "+ ListaDeReproduccion.get(0).getCanciones().get(0).getNombre());
        radio.getContactos().add(contacto1);
        radio.getContactos().add(contacto2);
        radio.getContactos().add(contacto3);
        radio.getContactos().add(contacto4);
        radio.getContactos().add(contacto5);




    }

    
    /** 
     * @return Boolean
     */
    @Override
    public Boolean Estado(){
        Boolean estado= radio.setEstado();
        return estado;
        //System.out.println("estado del radio: "+ radio.getEstado() );
    }

    
    /** 
     * @param volumen
     */
    public void CambiarVolumen( int volumen){
        radio.setVolumen(volumen);
        System.out.println("volumen del radio: "+ radio.getVolumen() );
    }
    
    @Override
    public void CambiarModulacionDeOnda(){
        radio.setModulacionDeOnda("FM");
        System.out.println("Modulacion de onda: "+ radio.getModulacionDeOnda() );
    }

    
    /** 
     * @param opcion
     */
    @Override
    public void CambiarEmisora(int opcion){
        //radio.setEmisoras(opcion);
        Double emisoras= radio.getEmisoras();
        if (opcion==1){
            emisoras+=0.5;
        }else if (opcion==2){
            emisoras-=0.5;
            if (emisoras<0.00){
                emisoras=0.00;

                System.out.println("no hay más emisoras");
            }
        }
        radio.setEmisoras(emisoras);

        
        

        System.out.println("No. de emisora: "+ radio.getEmisoras() );
    }

    @Override
    public void GuardarEmisora(){
        if (ListaEmisorasGuardadas.size()<51){
            
            ListaEmisorasGuardadas.add(radio.getEmisoras());
        }else{
            vista.validacion();
        }
        
    }

    public void MostrarEmisoras(){
        int contador=0;
        for (int i = 0; i < ListaEmisorasGuardadas.size(); i++){
           contador++;
           System.out.println(contador + ".  "+ ListaEmisorasGuardadas.get(i));
        }

    }

    
    /** 
     * @param indice
     */
    @Override
    public void CargaEmisora(int indice){
        Double emisora= ListaEmisorasGuardadas.get(indice-1);
        radio.setEmisoras(emisora);
        System.out.println("Ahora se encuentra en la emisora: "+emisora);

    }
    
    /** 
     * @param opcion
     */
    @Override
    public void SeleccionarLista(int opcion){
        //System.out.println(". "+ ListaDeReproduccion.get(0).getCanciones().get(0).getNombre());
        /*for (int i = 0; i < ListaDeReproduccion.size(); i++){
            System.out.println(ListaDeReproduccion.get(i).getNombre());

         }*/
         if (opcion==1){
            radio.setNoLista(opcion);
            //radio.setIcancionActual(1);
            System.out.println(ListaDeReproduccion.get(0).getNombre());
            System.out.println("Canciones de la lista ");
            //for (int i = 0; i < ListaDeReproduccion.size(); i++){
            for (int j = 0; j < ListaDeReproduccion.get(0).getCanciones().size(); j++){
                System.out.println( ListaDeReproduccion.get(0).getCanciones().get(j).getNombre());
            }
         }else if (opcion==2){
            radio.setNoLista(opcion);
            //radio.setIcancionActual(1);
            System.out.println(ListaDeReproduccion.get(2).getNombre());
            System.out.println("Canciones de la lista ");
            for (int j = 0; j < ListaDeReproduccion.get(1).getCanciones().size(); j++){
                System.out.println( ListaDeReproduccion.get(1).getCanciones().get(j).getNombre());
            }
        }else{
            vista.validacion();
        }


    }
    
    /** 
     * @param opcion
     */
    @Override
    public void CambiarCancion(int opcion){
        //int NoLista= radio.getNoLista();
        int CancionActual=radio.getIcancionActual();
        if (CancionActual<0 && CancionActual<4){
            if (opcion==1){
                radio.setIcancionActual(CancionActual+1);
                
             }else if (opcion==2){
                radio.setIcancionActual(CancionActual-1);
            }else{
                vista.validacion();
            }
        }else{
            vista.validacion();
        }
        
    }

    @Override
    public void EscucharCancion(){
        int NoLista= radio.getNoLista();
        int CancionActual=radio.getIcancionActual();
        System.out.println("Se esta reproduciendo: "+ListaDeReproduccion.get(NoLista).getCanciones().get(CancionActual).getNombre()+" con duracion de; "+ListaDeReproduccion.get(NoLista).getCanciones().get(CancionActual).getDuracion() +" de: "+ListaDeReproduccion.get(NoLista).getCanciones().get(CancionActual).getAutor()+" del genero: "+ListaDeReproduccion.get(NoLista).getCanciones().get(CancionActual).getGenero());

    }

    
    /** 
     * @return Boolean
     */
    @Override
    public Boolean EstadoTelefono(){
        Boolean estadoTelefono= radio.setEstadoTelefono();
        System.out.println("se cambio el estado: " + estadoTelefono);
        return estadoTelefono;
    }
    @Override
    public void MostrarContactos(){
        System.out.println("lista de contactos: ");
        int contador=-1;
        for (int i = 0; i < radio.getContactos().size(); i++){
            contador++;
            System.out.println(contador+". "+radio.getContactos().get(i).getNombre());
        }
    }
    
    /** 
     * @param opcion
     */
    @Override
    public void LlamarAContacto(int opcion){
        if (radio.getEstadoLlamada()==true){
            System.out.println("ya hay una llamada en curso, no puede llamar a alguien más");
        }else{
            System.out.println("llamando a: "+ radio.getContactos().get(opcion).getNombre()+"\n llamada en curso");
            radio.setEstadoLlamada();
        }
        

    }
    @Override
    public void FinalizarLlamada(){
        if (radio.getEstadoLlamada()==false){
            System.out.println("no hay ninguna llamada en curso");
        }else{
            System.out.println("se finalizo la llamada");
            radio.setEstadoLlamada();
        }
    }
    @Override
    public void CambiarModo(){
        radio.setAudio();
        System.out.println("Se encuentra en modo: "+radio.getAudio());
    }
    
    /** 
     * @param fecha
     * @param Pais
     * @param Ciudad
     * @param noBoletos
     */
    @Override
    public void PlanificarViajes(String fecha, String Pais, String Ciudad, int noBoletos){
        Viajes viaje= new Viajes(fecha,Pais, Ciudad, noBoletos);
        radio.getViajes().add(viaje);
        System.out.println("se agrego el viaje\n Viajes planificados: ");
        for (int i = 0; i < radio.getViajes().size(); i++){
            System.out.println(radio.getViajes().get(i).getPais()+" ciudad de : "+radio.getViajes().get(i).getCiudad()+ " la fecha de: "+radio.getViajes().get(i).getFecha()+" con: "+radio.getViajes().get(i).getBoletos()+" boletos ");
        }
    }
    

    
}
