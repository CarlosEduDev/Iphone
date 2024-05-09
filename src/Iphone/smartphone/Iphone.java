package Iphone.smartphone;

import Iphone.MultiFuncoes.telefoneMultiFuncional;

public class Iphone {
    public static void main(String[] args) {
    telefoneMultiFuncional iphone = new telefoneMultiFuncional();

        // Aparelho telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Navegador de internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
