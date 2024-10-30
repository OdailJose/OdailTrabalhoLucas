
package Singleton;


public class Main { 
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Sistema iniciado.");
        logger.log("Dispositivo conectado.");
    }
}