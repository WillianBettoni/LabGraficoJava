package Trabalho;

import javax.swing.UnsupportedLookAndFeelException;

public class Trabalho {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Window window = new Window();
        ViewPort wp = new ViewPort(window);
        PainelDesenho listaDeObjetosDesenhados = new PainelDesenho(wp);
        TelaPrincipal principal = new TelaPrincipal(listaDeObjetosDesenhados);
        principal.setVisible(true);
    }    
}