package Iphone.aparelhoTelefonico;

public class Telefonar implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Ligando para alguém...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando uma mensagem de voz...");

    }
}
