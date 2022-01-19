package ej5arrays;
//Importamos la clase para poder preguntar a los clientes un numero
import metodosclases.Numero;
/**
 *
 * @author Alvar
 */
public class Ej5Arrays {

    /**
     * @param args Iniciamos el main
     */
    public static void main(String[] args) {
        //Definimos la clase Empresa
        Empresa miEmpresa;
        
        //Pedimos el numero de clientes de la empresa
        int nclientes;
        nclientes=metodosclases.Numero.pedirNumero("Introduce el numero de clientes: ",1);
        
        miEmpresa=new Empresa(nclientes);
        miEmpresa.pedirClientes();
    }
    
    
}
