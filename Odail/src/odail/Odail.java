
package odail;


public class Odail {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        HomeAutomationFacade homeFacade = new HomeAutomationFacade();
        homeFacade.iniciarDia();
        homeFacade.finalizarDia();
    }

    
}
