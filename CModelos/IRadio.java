/*
 * Autores:
 *          Angela García #22869
 *          Augusto Sanic #20717
            Sergio Palacios #22808
 * fecha de entrega:20/11/2022
 * catedratico: Ludwing Cano
 */
package CModelos;

public interface IRadio {
    public Boolean Estado();
    //Modo radio
    //FM Y AM
    public void CambiarModulacionDeOnda();
    public void CambiarEmisora(int opcion);
    public void GuardarEmisora();
    public void CargaEmisora(int indice);
    //Modo reproduccion
    public void SeleccionarLista(int opcion);
    public void CambiarCancion(int opcion);
    public void EscucharCancion();
    //Modo telefono
    public Boolean EstadoTelefono();
    public void MostrarContactos();
    public void LlamarAContacto(int opcion);
    public void FinalizarLlamada();
    //speaker o audiculares
    public void CambiarModo();

    //Modo productividad
    public void PlanificarViajes(String fecha, String Pais, String Ciudad, int noBoletos);
}
