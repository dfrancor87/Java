/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaPorra;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Clase main que define objetos para poder generar consultas y altas.
 *
 * @author Danny Franco
 */
public class PruebaPorra {

    public static void main(String[] args) throws SQLException {

        String nomDB = "porraBD.sqlite";
        String jdbc = "jdbc:sqlite";
        String urlJdbc = jdbc + ":" + nomDB;
        BaseDatosSingleton bd = new BaseDatosSingleton(urlJdbc);

        /**
         * el resultado del partido lo controlamos desde la variable
         * resultadoPartido
         */
        String resultadoPartido = "4-0";

        Usuario objUsuario = new Usuario(bd);
        Apuesta objApuesta = new Apuesta(bd);

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-----PORRA------");
            System.out.println("Eige una opcion: ");
            System.out.println("1 Registrar usuario");
            System.out.println("2 Apostar");
            System.out.println("3 Listado de apuestas");
            System.out.println("4 Usuarios Registrados");
            System.out.println("5 Comprobar premios");
            System.out.println("6 Saber id de usuario");
            System.out.println("0 salir");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("***Registrar usuario***");
                    String dni;
                    String nombre;
                    System.out.println("Ingresa el dni:");
                    dni = entrada.next().toUpperCase();
                    System.out.println("Ingresa nombre:");
                    nombre = entrada.next().toUpperCase();

                    objUsuario.registrarUsuario(dni, nombre);
                    break;

                case 2:
                    System.out.println("***Apostar***");

                    System.out.println("Introduce dni:");
                    String dniRegistrado = entrada.next().toUpperCase();
                    /**
                     * Si el usuario esta registrado continuamos
                     */
                    if (objApuesta.comprobarUsuarioRegistrado(dniRegistrado)) {

                        System.out.println("Introduce tu id(numerico) de usuario: ");
                        int id = entrada.nextInt();

                        System.out.println("introduce cuanto vas apostar ex. (10,50 o 20,00):");
                        double apuesta = entrada.nextDouble();
                        System.out.println("Introduce el resultado ex.(1-0):");
                        String resultado = entrada.next();

                        objApuesta.altaApuesta(id, apuesta, resultado);
                    } else {
                        System.out.println("Usuario no registrado, comprueba tu id con la opcion 6");
                    }
                    break;

                case 3:
                    System.out.println("***Listado de apuestas***");
                    objApuesta.selectApuestas();
                    break;

                case 4:
                    System.out.println("***Usuarios Registrados***");
                    objUsuario.usuariosRegistrados();
                    break;

                case 5:
                    System.out.println("***Comprobar premio***");
                    System.out.println("Ingresa tu id de usuario, si no lo recuerdas ve a la opcion 6: ");
                    int id_usuario = entrada.nextInt();
                    /**
                     * *
                     * comprobar el usuario ha acertado
                     */
                    if (objApuesta.ganador(id_usuario, resultadoPartido)) {

                        int numeroDeApuestas = objApuesta.totalDeApuestas();
                        System.out.println("Numero de apuestas " + numeroDeApuestas);

                        int numeroDeAcertantes = objApuesta.numeroDeAcertantes(resultadoPartido);
                        System.out.println("Total de ganadores " + numeroDeAcertantes);

                        double cantidadApostada = objApuesta.cantidadApostada(id_usuario, resultadoPartido);
                        System.out.println("Usted ha apostado " + cantidadApostada);

                        double premioTotal = numeroDeApuestas * cantidadApostada;
                        double premioParaElGanador = premioTotal / numeroDeAcertantes;

                        System.out.println("Dinero total " + premioTotal);
                        System.out.println("Dinero para el ganador " + premioParaElGanador);
                    } else {
                        System.out.println("No has ganado trabaja!!!");
                    }

                    break;
                case 6:
                    System.out.println("***Saber id usuario Registrado***");

                    System.out.println("Ingresa tu dni:");
                    dni = entrada.next().toUpperCase();

                    int id = objUsuario.obtenerId(dni);
                    System.out.println("El dni: " + dni + "\n tu id de usuario es: " + id);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }

}
