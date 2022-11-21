/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CVista;

import CControlador.Controlador;


public class MostrarMenu {
    Vista vista;
    Controlador controlador;
    int opcion=0;
    int opcionRadio=0;
    int opcionReproduccion=0;
    int opcionTelefono=0;


    public MostrarMenu(){
        vista = new Vista();
        controlador= new Controlador();
        
    }
    public void MostrarPrograma(){
        vista.Mensaje(); 
        
        

        while (opcion!=8){
            opcion= vista.SeleccioneMenu("\nBienvenido al simulador de radio \n Ingrese una opción:\n1. Encender el radio \n2. Cambiar el volumen \n3. Modo radio \n4. Modo reproducción \n5. Modo teléfono \n6. Modo Productividad\n7. apagar el radio\n8. salir");
/////////////1. Encender el radio//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opcion==1){
                System.out.println("\nEncendiendo el radio... "  );
                controlador.Estado();
            }
/////////////n2. Cambiar el volumen//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try{
                if (opcion==2){
                    opcion= vista.SeleccioneMenu("\nQue desea?\n1. subir volumen \n2. bajar volumen");
                    controlador.CambiarVolumen(opcion);
                }
    ///////////Modo radio ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==3){
                    opcionRadio= vista.SeleccioneMenu("\n Modo Radio\n Ingrese una opción:\n1. Cambiar de FM A AM \n2. Cambiar emisoras  \n3. Guardar emisoras \n4. Cargar emisora");
                    if (opcionRadio==1){
                        controlador.CambiarModulacionDeOnda();
                    }else if (opcionRadio==2){
                        opcion= vista.SeleccioneMenu("\nQue desea?\n1. 1 emisora más \n2. 1 emisora menos");
                        controlador.CambiarEmisora(opcion);
                    }else if (opcionRadio==3){
                        controlador.GuardarEmisora();
                        System.out.println("se guardo la emisora");
                    }else if (opcionRadio==4){
                        controlador.MostrarEmisoras();
                        opcion= vista.SeleccioneMenu("\nQue emisora desea cargar? (ingrese el numero ): ");
                        controlador.CargaEmisora(opcion);
                    }

                }
    /////////////. Modo reproducción //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==4){
                    opcionReproduccion= vista.SeleccioneMenu("\n Modo Reproduccion\n Ingrese una opción:\n1. Seleccionar lista de reproduccion \n2. Cambiar cancion  \n3. Escuchar cancion");
                    if (opcionReproduccion==1){
                        opcion= vista.SeleccioneMenu("\nQue lista desea reproducir?\n1. lista 1 \n2. lista 2");
                        controlador.SeleccionarLista(opcion);
                    }else if (opcionReproduccion==2){
                        opcion= vista.SeleccioneMenu("\nA que cancion desea ir?\n1. 1 antes \n2. 1 despues");
                        controlador.CambiarCancion(opcion);
                    }else if (opcionReproduccion==3){
                        controlador.EscucharCancion();
                    }
                    
                }
    //////////////. Modo teléfono /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==5){
                    opcionTelefono= vista.SeleccioneMenu("\n Modo Telefono\n Ingrese una opción:\n1. Cambiar estado de conexión \n2. Mostrar contactos  \n3. Llamar contacto \n4. Finalizar llamada\n5. Cambiar a speaker o audiculares");
                    if (opcionTelefono==1){
                        controlador.EstadoTelefono();
                    }else if (opcionTelefono==2){
                        controlador.MostrarContactos();
                    }else if (opcionTelefono==3){
                        opcion= vista.SeleccioneMenu("\nIngrese el numero de contacto al que desea llamar:");
                        controlador.LlamarAContacto(opcion);
                    }
                    else if (opcionTelefono==4){
                        controlador.CambiarModo();
                    }
                }
    //////////////6. Modo Productividad/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==6){
                    //planificar viajes
                    String fecha= vista.SeleccioneMenuString("ingrese la fecha: ");
                    String Pais= vista.SeleccioneMenuString("ingrese el pais: ");
                    String Ciudad= vista.SeleccioneMenuString("ingrese la ciudad: ");
                    opcion= vista.SeleccioneMenu("Ingrese el numero de boletos:");
                    controlador.PlanificarViajes(fecha, Pais, Ciudad, opcion);
                }
    /////////////apagar el radio//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==7){
                    System.out.println("\nApagando el radio... "  );
                    controlador.Estado();
                    System.out.println("\nRadio apagado "  );

                }
            /////salir//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }catch (Exception e){
                vista.validacion2();
            }
        }

  
    }

    
}
