package Iphone.MultiFuncoes;

import Iphone.aparelhoTelefonico.AparelhoTelefonico;
import Iphone.navegadorInternet.NavegadorInternet;
import Iphone.reprodutorMusical.ReprodutorMusica;

public class telefoneMultiFuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
    // APARELHO TELEFONICO
    @Override
    public void ligar() {
        System.out.println("Ligando para alguém via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo alguém via Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Iphone");
    }

    // NAVEGADOR DE INTERNET

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página via Iphone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página via Iphone");
    }

    // REPRODUTOR MUSICAL
    @Override
    public void tocar() {
        System.out.println("Tocando música via Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada via Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecinando música via Iphone.");
    }
}
