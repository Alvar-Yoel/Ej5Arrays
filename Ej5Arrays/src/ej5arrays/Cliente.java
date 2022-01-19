package ej5arrays;
import metodosclases.Fecha;

/**
 *
 * @author Alvar
 */
public class Cliente {
    //Pedimos los datos que necesitamos de cada cliente
    private String cif;
    private String nombre;
    private Fecha fechaFra;
    private int diasVen;
    private float importe;
    
    //Creamos el constructor con todos los datos del cliente
    public Cliente(String cif, String nombre, Fecha fechaFra, int diasVen, float importe) {
        this.cif = cif;
        this.nombre = nombre;
        this.fechaFra = fechaFra;
        this.diasVen = diasVen;
        this.importe = importe;
    }
    
    //Creamos los getter de la clase
    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaFra() {
        return fechaFra;
    }

    public int getDiasVen() {
        return diasVen;
    }

    public float getImporte() {
        return importe;
    }   
}
