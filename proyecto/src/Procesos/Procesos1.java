package Procesos;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class Procesos1{
    public static void main(String[] args) {
        // Nombre de host que deseamos resolver
        String hostName = "www.twitter.com";

        try {
            // Resuelve el nombre de host a una dirección IP
            InetAddress inetAddress = InetAddress.getByName(hostName);

            // Muestra la información de la dirección IP
            System.out.println("Nombre de host: " + inetAddress.getHostName());
            System.out.println("Dirección IP: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            // Manejo de excepción en caso de que no se pueda resolver el nombre de host
            System.err.println("No se puede resolver el nombre de host: " + hostName);
        }
    }
}
