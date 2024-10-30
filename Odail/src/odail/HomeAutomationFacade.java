/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odail;

/**
 *
 * @author Kaique
 */
public class HomeAutomationFacade {
    private Luz luz;
    private Termostato termostato;
    private CameraSeguranca cameraSeguranca;

    public HomeAutomationFacade() {
        this.luz = new Luz();
        this.termostato = new Termostato();
        this.cameraSeguranca = new CameraSeguranca();
    }

    public void iniciarDia() {
        luz.ligar();
        termostato.ajustarTemperatura(22);
        cameraSeguranca.desativar();
        System.out.println("Início do dia configurado");
    }

    public void finalizarDia() {
        luz.desligar();
        termostato.ajustarTemperatura(18);
        cameraSeguranca.ativar();
        System.out.println("Final do dia configurado");
    }
}
