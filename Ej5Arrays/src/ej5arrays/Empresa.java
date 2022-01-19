package ej5arrays;
//Importamos nuestros metodos ya creados
import metodosclases.Fecha;
import metodosclases.Textos;d
/**
 *
 * @author Alvar
 */
public class Empresa {
    Cliente [] clientes;
    Descuento [] descuentos;

    public Empresa(int nClientes) {
        clientes = new Cliente[nClientes];
        
        //Aqui lo que haremos sera crear la tabla de descuentos
        descuentos = new Descuento[] {
            new Descuento(30,0.1f),
            new Descuento(90,0.07f),
            new Descuento(120,0.05f),
            new Descuento(180,0.02f),
            new Descuento(Integer.MAX_VALUE,0f)
        };
    }
    public void pedirClientes(){
        //Declaramos las variables de los clientes
        String cif, nombre;
        int dven;
        Fecha fecha;
        float importe;
        
        //Pedimos los datos de los clientes
        for(int ncliente = 0; ncliente<clientes.length; ncliente++){
            cif=metodosclases.Textos.pedirString("Dime tu CIF");
            nombre=metodosclases.Textos.pedirString("Dime tu nombre");
            dven=metodosclases.Numero.pedirNumero("Dime los dias de vencimiento", 0);
            fecha=metodosclases.Textos.pedirFecha("Dime la fecha");
            importe=metodosclases.Numero.pedirNumeroReal("Dime el importe de la factura", 0);
            clientes[ncliente]=new Cliente(cif, nombre, fecha, dven, importe);
        }
    }
    
    //Creamos el informe
    public void informe(){
        Fecha fhoy = new Fecha();
        System.out.println("INFORME DE FACTURAS");
        System.out.println("Fecha: " + fhoy.fechaCompletaLetra());
    }
    
}
