package colecciones;

import java.util.*;

/**
 *
 * @author Danny Franco
 */
public class PruebaCliente {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "00002", 25000);
        Cliente cl3 = new Cliente("Penelope Cruz", "00003", 30000);
        Cliente cl4 = new Cliente("Julio Iglesias", "00004", 50000);
        Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);
        /**
         * * Datos a tomar en cuenta al elegir una coleccion no repetir
         * clientes Agregar, borrar solo lectura USAR UNA COLECCION DE TIPO SET
         */
        Set<Cliente> clientesBanco = new HashSet<Cliente>();
        // agregar a nuesta coleecion de datos 
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        //recorrer la coleccion con un buche for each
        // va a recorrer todos los objetos  de tipo cliente que hay en la coleccion clientesBanco
        for (Cliente cliente : clientesBanco) {
            //System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());            
            if (cliente.getNombre().equals("Julio Iglesias")) {
                //para eliminar un objeto del foreach
                clientesBanco.remove(cliente);
            }
        }

        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());

        }
    }

    //mostrar la coleccion con un itertador
    //referenciar la Inferface iterator <tipo de la clase> it nombre de variable
    //= nuestra coleccion. tipo iterator()
//        Iterator<Cliente> it = clientesBanco.iterator();
//        //mientras en la colecccion hayan objetos
//        while(it.hasNext()){
//            //it.next para que vaya al siguiente xq empezamos por el vacio
//            String nombre_cliente=it.next().getNombre();
//            System.out.println("nombre: "+ nombre_cliente);
//        }
}
