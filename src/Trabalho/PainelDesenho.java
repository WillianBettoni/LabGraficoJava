package Trabalho;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel {

    ArrayList<Ponto> listaPontos;
    ArrayList<Polilinha> listaPolilinhas;
    ArrayList<Poligono> listaPoligonos;
    ArrayList<Linha> listaLinhas;
    DefaultListModel listaObjetos;
    Color corObjeto;
    ViewPort viewPort;

    public PainelDesenho(ViewPort wp) {
        listaPontos = new ArrayList<>();
        listaPolilinhas = new ArrayList<>();
        listaPoligonos = new ArrayList<>();
        listaLinhas = new ArrayList<>();
        listaObjetos = new DefaultListModel();
        corObjeto = Color.BLACK;
        viewPort = wp;
    }

    public Color getCorObjeto() {
        return corObjeto;
    }

    public void setCorObjeto(Color corObjeto) {
        this.corObjeto = corObjeto;
    }

    public void adicionarPonto(Ponto ponto) {
        listaPontos.add(ponto);
    }

    public void adicionarPolilinha(Polilinha polilinha) {
        listaPolilinhas.add(polilinha);
    }

    public void adicionarPoligono(Poligono poligono) {
        listaPoligonos.add(poligono);
    }

    public void adicionarLinha(Linha linha) {
        listaLinhas.add(linha);
    }

    public void adicionarObjetoNaLista(String nome) {
        listaObjetos.addElement(nome);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
    
        for (Ponto ponto : listaPontos) {
            g.setColor(ponto.getCor());
            g.fillOval(viewPort.transformadaX(ponto.getX()), viewPort.transformadaY(ponto.getY()), ponto.getDiametro(), ponto.getDiametro());
        }

        for (Linha linha : listaLinhas) {
            g.setColor(linha.getCor());
            g.drawLine(viewPort.transformadaX(linha.getX1()), viewPort.transformadaY(linha.getY1()), viewPort.transformadaX(linha.getX2()), viewPort.transformadaY(linha.getY2()));
        }

        for (Polilinha polilinha : listaPolilinhas) {
            int x[] = new int[polilinha.getX().length];
            int y[] = new int[polilinha.getY().length];    
            
            g.setColor(polilinha.getCor());
            for (int i = 0; i < polilinha.getX().length; i++) {
                x[i] = viewPort.transformadaX(polilinha.getX()[i]);
            }
            for (int i = 0; i < polilinha.getY().length; i++) {
                y[i] = viewPort.transformadaY(polilinha.getY()[i]);
            }
            g.drawPolyline(x, y, polilinha.getX().length);
        }

        for (Poligono poligono : listaPoligonos) {
            int x[] = new int[poligono.getX().length];
            int y[] = new int[poligono.getY().length];

            g.setColor(poligono.getCor());
            for (int i = 0; i < poligono.getX().length; i++) {
                x[i] = viewPort.transformadaX(poligono.getX()[i]);
            }
            for (int i = 0; i < poligono.getY().length; i++) {
                y[i] = viewPort.transformadaY(poligono.getY()[i]);
            }
            g.drawPolygon(x, y, poligono.getX().length);
        }
    }

    public ArrayList<Ponto> getListaPontos() {
        return listaPontos;
    }

    public ArrayList<Polilinha> getListaPolilinhas() {
        return listaPolilinhas;
    }

    public ArrayList<Poligono> getListaPoligonos() {
        return listaPoligonos;
    }

    public ArrayList<Linha> getListaLinhas() {
        return listaLinhas;
    }

    public DefaultListModel getlistaObjetos() {
        return listaObjetos;
    }
}
