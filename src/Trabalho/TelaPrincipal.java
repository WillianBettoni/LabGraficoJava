package Trabalho;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaPrincipal extends javax.swing.JFrame {

    PainelDesenho listaObjetosDesenhados;
    ViewPort vport;
    boolean viewPortVisivel;

    public TelaPrincipal() {
        initComponents();
    }

    public TelaPrincipal(PainelDesenho listaObjetosDesenhados) throws UnsupportedLookAndFeelException {
        vport = listaObjetosDesenhados.viewPort;
        setLookAndFeel();
        setIconeJanela();
        this.listaObjetosDesenhados = listaObjetosDesenhados;
        initComponents();
        setLocationRelativeTo(null);
        Point p = new Point(Math.round(pnlViewPort.getViewport().getX() + ((pnlDesenhar.getWidth() - pnlViewPort.getWidth()) / 2)), Math.round(pnlViewPort.getViewport().getY() + ((pnlDesenhar.getHeight() - pnlViewPort.getHeight()) / 2)));
        pnlViewPort.getViewport().setViewPosition(p);
        PlanoCartesiano();
        listaObjetos.removeAll();
        listaObjetos.setModel(listaObjetosDesenhados.getlistaObjetos());
        viewPortVisivel = true;
    }

    public void setIconeJanela() {
        URL url = this.getClass().getResource("/Img/IconeJanela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    public void PlanoCartesiano() {
        Linha linha = new Linha(-560, 0, 560, 0, "Linha: Vértice X", Color.BLUE);
        listaObjetosDesenhados.adicionarLinha(linha);
        listaObjetosDesenhados.adicionarObjetoNaLista("Linha: Vértice X");
        Linha linha2 = new Linha(0, 520, 0, -520, "Linha: Vértice Y", Color.BLUE);
        listaObjetosDesenhados.adicionarLinha(linha2);
        listaObjetosDesenhados.adicionarObjetoNaLista("Linha: Vértice Y");
        pnlDesenhar.repaint();
    }

    public double grauParaRadianos(double graus) {
        return (Math.PI / 180) * graus;
    }

    public void transformar(Transformar transformar) {
        String nome1;
        String nome2;

        if ((listaObjetos.getSelectedValue() != null) && (transformar != null)) {
            //Ponto    
            for (int i = 0; i < listaObjetosDesenhados.getListaPontos().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPontos().get(i).getNome().replaceAll("Ponto: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Ponto: ", "");
                if (nome1.equals(nome2)) {
                    Ponto ponto = listaObjetosDesenhados.getListaPontos().get(i);
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            ponto.setX(ponto.getX() + transformar.getX());
                            ponto.setY(ponto.getY() + transformar.getY());
                            break;
                        case 1:
                            double X = ponto.getX();
                            double Y = ponto.getY();
                            ponto.setX((X * Math.cos(grauParaRadianos(transformar.getAngulo()))) - (Y * Math.sin(grauParaRadianos(transformar.getAngulo()))));
                            ponto.setY((X * Math.sin(grauParaRadianos(transformar.getAngulo()))) + (Y * Math.cos(grauParaRadianos(transformar.getAngulo()))));
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            ponto.setX(ponto.getX() * transformar.getX());
                            ponto.setY(ponto.getY() * transformar.getY());
                            break;
                    }
                    break;
                }
            }

            //Linha
            for (int i = 0; i < listaObjetosDesenhados.getListaLinhas().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaLinhas().get(i).getNome().replaceAll("Linha: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Linha: ", "");
                if (nome1.equals(nome2)) {
                    Linha linha = listaObjetosDesenhados.getListaLinhas().get(i);
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            linha.setX1(linha.getX1() + transformar.getX());
                            linha.setX2(linha.getX2() + transformar.getX());
                            linha.setY1(linha.getY1() + transformar.getY());
                            linha.setY2(linha.getY2() + transformar.getY());
                            break;
                        case 1:
                            double X1 = linha.getX1();
                            double X2 = linha.getX2();
                            double Y1 = linha.getY1();
                            double Y2 = linha.getY2();
                            linha.setX1((X1 * Math.cos(grauParaRadianos(transformar.getAngulo()))) - (Y1 * Math.sin(grauParaRadianos(transformar.getAngulo()))));
                            linha.setX2((X2 * Math.cos(grauParaRadianos(transformar.getAngulo()))) - (Y2 * Math.sin(grauParaRadianos(transformar.getAngulo()))));
                            linha.setY1((X1 * Math.sin(grauParaRadianos(transformar.getAngulo()))) + (Y1 * Math.cos(grauParaRadianos(transformar.getAngulo()))));
                            linha.setY2((X2 * Math.sin(grauParaRadianos(transformar.getAngulo()))) + (Y2 * Math.cos(grauParaRadianos(transformar.getAngulo()))));
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            linha.setX1(linha.getX1() * transformar.getX());
                            linha.setX2(linha.getX2() * transformar.getX());
                            linha.setY1(linha.getY1() * transformar.getY());
                            linha.setY2(linha.getY2() * transformar.getY());
                            break;
                    }
                    break;
                }

            }

            //Polilinha
            for (int i = 0; i < listaObjetosDesenhados.getListaPolilinhas().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPolilinhas().get(i).getNome().replaceAll("Polilinha: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Polilinha: ", "");
                if (nome1.equals(nome2)) {
                    Polilinha polilinha = listaObjetosDesenhados.getListaPolilinhas().get(i);
                    double x[] = new double[polilinha.getX().length];
                    double y[] = new double[polilinha.getY().length];
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                x[j] = polilinha.getX()[j] + transformar.getX();
                            }
                            for (int j = 0; j < polilinha.getY().length; j++) {
                                y[j] = polilinha.getY()[j] + transformar.getY();
                            }
                            break;
                        case 1:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                x[j] = (polilinha.getX()[j] * Math.cos(grauParaRadianos(transformar.getAngulo()))) - (polilinha.getY()[j] * Math.sin(grauParaRadianos(transformar.getAngulo())));
                            }
                            for (int j = 0; j < polilinha.getY().length; j++) {
                                y[j] = (polilinha.getX()[j] * Math.sin(grauParaRadianos(transformar.getAngulo()))) + (polilinha.getY()[j] * Math.cos(grauParaRadianos(transformar.getAngulo())));
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                x[j] = polilinha.getX()[j] * transformar.getX();
                            }
                            for (int j = 0; j < polilinha.getY().length; j++) {
                                y[j] = polilinha.getY()[j] * transformar.getY();
                            }
                            break;
                    }
                    polilinha.setX(x);
                    polilinha.setY(y);
                    break;
                }
            }

            //Poligono
            for (int i = 0; i < listaObjetosDesenhados.getListaPoligonos().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPoligonos().get(i).getNome().replaceAll("Polígono: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Polígono: ", "");
                if (nome1.equals(nome2)) {
                    Poligono poligono = listaObjetosDesenhados.getListaPoligonos().get(i);
                    double x[] = new double[poligono.getX().length];
                    double y[] = new double[poligono.getY().length];
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                x[j] = poligono.getX()[j] + transformar.getX();
                            }
                            for (int j = 0; j < poligono.getY().length; j++) {
                                y[j] = poligono.getY()[j] + transformar.getY();
                            }
                            break;
                        case 1:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                x[j] = (poligono.getX()[j] * Math.cos(grauParaRadianos(transformar.getAngulo()))) - (poligono.getY()[j] * Math.sin(grauParaRadianos(transformar.getAngulo())));
                            }
                            for (int j = 0; j < poligono.getY().length; j++) {
                                y[j] = (poligono.getX()[j] * Math.sin(grauParaRadianos(transformar.getAngulo()))) + (poligono.getY()[j] * Math.cos(grauParaRadianos(transformar.getAngulo())));
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                x[j] = poligono.getX()[j] * transformar.getX();
                            }
                            for (int j = 0; j < poligono.getY().length; j++) {
                                y[j] = poligono.getY()[j] * transformar.getY();
                            }
                            break;
                    }
                    poligono.setX(x);
                    poligono.setY(y);
                    break;
                }
            }
            pnlDesenhar.repaint();
        }
    }
    
    public void transformarMatrizes(Transformar transformar) {
        String nome1;
        String nome2;
        MatrizesTransformacao matrizTransformar = new MatrizesTransformacao();

        if ((listaObjetos.getSelectedValue() != null) && (transformar != null)) {
            //Ponto    
            for (int i = 0; i < listaObjetosDesenhados.getListaPontos().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPontos().get(i).getNome().replaceAll("Ponto: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Ponto: ", "");
                if (nome1.equals(nome2)) {
                    Ponto ponto = listaObjetosDesenhados.getListaPontos().get(i);
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            double translacao[][] = matrizTransformar.translacao(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(translacao[0][0]);
                            ponto.setY(translacao[0][1]);
                            break;
                        case 1:
                            double rotacao[][] = matrizTransformar.rotacao(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(rotacao[0][0]);
                            ponto.setY(rotacao[0][1]);
                            break;
                        case 2:
                            double rotacaoPontoDeEixo[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(rotacaoPontoDeEixo[0][0]);
                            ponto.setY(rotacaoPontoDeEixo[0][1]);
                            break;
                        case 3:
                            double escalonamentoOrigem[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, ponto.getX(), ponto.getY(), ponto.getX(), ponto.getY());
                            ponto.setX(escalonamentoOrigem[0][0]);
                            ponto.setY(escalonamentoOrigem[0][1]);
                            break;
                        case 4:
                            double escalonamento[][] = matrizTransformar.escalonamento(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(escalonamento[0][0]);
                            ponto.setY(escalonamento[0][1]);
                            break;
                        case 5:
                            double escalonamentoCentroObjeto[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, ponto.getX(), ponto.getY(), ponto.getX(), ponto.getY());
                            ponto.setX(escalonamentoCentroObjeto[0][0]);
                            ponto.setY(escalonamentoCentroObjeto[0][1]);
                            break;
                        case 6:
                            double rotacaoCentroObjeto[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(rotacaoCentroObjeto[0][0]);
                            ponto.setY(rotacaoCentroObjeto[0][1]);
                            break;
                        case 7:
                            double reflexao[][] = matrizTransformar.reflexao(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(reflexao[0][0]);
                            ponto.setY(reflexao[0][1]);
                            break;
                        case 8:
                            double cisalhamento[][] = matrizTransformar.cisalhamento(transformar, ponto.getX(), ponto.getY());
                            ponto.setX(cisalhamento[0][0]);
                            ponto.setY(cisalhamento[0][1]);
                            break;
                    }
                    break;
                }
            }

            //Linha
            for (int i = 0; i < listaObjetosDesenhados.getListaLinhas().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaLinhas().get(i).getNome().replaceAll("Linha: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Linha: ", "");
                if (nome1.equals(nome2)) {
                    Linha linha = listaObjetosDesenhados.getListaLinhas().get(i);
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            double translacao1[][] = matrizTransformar.translacao(transformar, linha.getX1(), linha.getY1());
                            double translacao2[][] = matrizTransformar.translacao(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(translacao1[0][0]);
                            linha.setY1(translacao1[0][1]);
                            linha.setX2(translacao2[0][0]);
                            linha.setY2(translacao2[0][1]);
                            break;
                        case 1:
                            double rotacao1[][] = matrizTransformar.rotacao(transformar, linha.getX1(), linha.getY1());
                            double rotacao2[][] = matrizTransformar.rotacao(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(rotacao1[0][0]);
                            linha.setY1(rotacao1[0][1]);
                            linha.setX2(rotacao2[0][0]);
                            linha.setY2(rotacao2[0][1]);
                            break;
                        case 2:
                            double rotacaoPontoDeEixo1[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, linha.getX1(), linha.getY1());
                            double rotacaoPontoDeEixo2[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(rotacaoPontoDeEixo1[0][0]);
                            linha.setY1(rotacaoPontoDeEixo1[0][1]);
                            linha.setX2(rotacaoPontoDeEixo2[0][0]);
                            linha.setY2(rotacaoPontoDeEixo2[0][1]);
                            break;
                        case 3:
                            double escalonamentoOrigem1[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, linha.getX1(), linha.getY1(), linha.getX1(), linha.getY1());
                            double escalonamentoOrigem2[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, linha.getX2(), linha.getY2(), linha.getX1(), linha.getY1());
                            linha.setX1(escalonamentoOrigem1[0][0]);
                            linha.setY1(escalonamentoOrigem1[0][1]);
                            linha.setX2(escalonamentoOrigem2[0][0]);
                            linha.setY2(escalonamentoOrigem2[0][1]);
                            break;
                        case 4:
                            double escalonamento1[][] = matrizTransformar.escalonamento(transformar, linha.getX1(), linha.getY1());
                            double escalonamento2[][] = matrizTransformar.escalonamento(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(escalonamento1[0][0]);
                            linha.setY1(escalonamento1[0][1]);
                            linha.setX2(escalonamento2[0][0]);
                            linha.setY2(escalonamento2[0][1]);
                            break;
                        case 5:
                            double mediaX = (linha.getX1() + linha.getX2())/2;
                            double mediaY = (linha.getY1() + linha.getY2())/2;
                            double escalonamentoCentroObjeto1[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, linha.getX1(), linha.getY1(), mediaX, mediaY);
                            double escalonamentoCentroObjeto2[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, linha.getX2(), linha.getY2(), mediaX, mediaY);
                            linha.setX1(escalonamentoCentroObjeto1[0][0]);
                            linha.setY1(escalonamentoCentroObjeto1[0][1]);
                            linha.setX2(escalonamentoCentroObjeto2[0][0]);
                            linha.setY2(escalonamentoCentroObjeto2[0][1]);
                            break;
                        case 6:
                            double mediaXRotacao = (linha.getX1() + linha.getX2())/2;
                            double mediaYRotacao = (linha.getY1() + linha.getY2())/2;
                            transformar.setX(mediaXRotacao);
                            transformar.setY(mediaYRotacao);
                            double rotacaoCentroObjeto1[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, linha.getX1(), linha.getY1());
                            double rotacaoCentroObjeto2[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(rotacaoCentroObjeto1[0][0]);
                            linha.setY1(rotacaoCentroObjeto1[0][1]);
                            linha.setX2(rotacaoCentroObjeto2[0][0]);
                            linha.setY2(rotacaoCentroObjeto2[0][1]);
                            break;
                        case 7:
                            double reflexao1[][] = matrizTransformar.reflexao(transformar, linha.getX1(), linha.getY1());
                            double reflexao2[][] = matrizTransformar.reflexao(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(reflexao1[0][0]);
                            linha.setY1(reflexao1[0][1]);
                            linha.setX2(reflexao2[0][0]);
                            linha.setY2(reflexao2[0][1]);
                            break;
                        case 8:
                            double cisalhamento1[][] = matrizTransformar.cisalhamento(transformar, linha.getX1(), linha.getY1());
                            double cisalhamento2[][] = matrizTransformar.cisalhamento(transformar, linha.getX2(), linha.getY2());
                            linha.setX1(cisalhamento1[0][0]);
                            linha.setY1(cisalhamento1[0][1]);
                            linha.setX2(cisalhamento2[0][0]);
                            linha.setY2(cisalhamento2[0][1]);
                            break;            
                    }
                    break;
                }

            }

            //Polilinha
            for (int i = 0; i < listaObjetosDesenhados.getListaPolilinhas().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPolilinhas().get(i).getNome().replaceAll("Polilinha: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Polilinha: ", "");
                if (nome1.equals(nome2)) {
                    Polilinha polilinha = listaObjetosDesenhados.getListaPolilinhas().get(i);
                    double x[] = new double[polilinha.getX().length];
                    double y[] = new double[polilinha.getY().length];
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double translacao[][] = matrizTransformar.translacao(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = translacao[0][0];
                                y[j] = translacao[0][1];
                            }
                            break;
                        case 1:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double rotacao[][] = matrizTransformar.rotacao(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = rotacao[0][0];
                                y[j] = rotacao[0][1];
                            }
                            break;
                        case 2:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double rotacaoPontoDeEixo[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = rotacaoPontoDeEixo[0][0];
                                y[j] = rotacaoPontoDeEixo[0][1];
                            }
                            break;
                        case 3:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double escalonamentoOrigem[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, polilinha.getX()[j], polilinha.getY()[j], polilinha.getX()[0], polilinha.getY()[0]);
                                x[j] = escalonamentoOrigem[0][0];
                                y[j] = escalonamentoOrigem[0][1];
                            }
                            break;
                        case 4:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double escalonamento[][] = matrizTransformar.escalonamento(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = escalonamento[0][0];
                                y[j] = escalonamento[0][1];
                            }
                            break;
                        case 5:
                            double mediaX = 0; 
                            double mediaY = 0;
                            
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                mediaX += polilinha.getX()[j];
                                mediaY += polilinha.getY()[j];
                            }
                            mediaX = mediaX/polilinha.getX().length;
                            mediaY = mediaY/polilinha.getY().length;
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double escalonamentoOrigem[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, polilinha.getX()[j], polilinha.getY()[j], mediaX, mediaY);
                                x[j] = escalonamentoOrigem[0][0];
                                y[j] = escalonamentoOrigem[0][1];
                            }
                            break;
                        case 6:
                            double mediaXRotacao = 0; 
                            double mediaYRotacao = 0;
                            
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                mediaXRotacao += polilinha.getX()[j];
                                mediaYRotacao += polilinha.getY()[j];
                            }
                            transformar.setX(mediaXRotacao/polilinha.getX().length);
                            transformar.setY(mediaYRotacao/polilinha.getY().length);
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double rotacaoPontoDeEixo[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = rotacaoPontoDeEixo[0][0];
                                y[j] = rotacaoPontoDeEixo[0][1];
                            }
                            break;
                        case 7:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double reflexao[][] = matrizTransformar.reflexao(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = reflexao[0][0];
                                y[j] = reflexao[0][1];
                            }
                            break;
                        case 8:
                            for (int j = 0; j < polilinha.getX().length; j++) {
                                double cisalhamento[][] = matrizTransformar.cisalhamento(transformar, polilinha.getX()[j], polilinha.getY()[j]);
                                x[j] = cisalhamento[0][0];
                                y[j] = cisalhamento[0][1];
                            }
                            break;
                    }
                    polilinha.setX(x);
                    polilinha.setY(y);
                    break;
                }
            }

            //Poligono
            for (int i = 0; i < listaObjetosDesenhados.getListaPoligonos().size(); i++) {
                nome1 = listaObjetosDesenhados.getListaPoligonos().get(i).getNome().replaceAll("Polígono: ", "");
                nome2 = listaObjetos.getSelectedValue().replaceAll("Polígono: ", "");
                if (nome1.equals(nome2)) {
                    Poligono poligono = listaObjetosDesenhados.getListaPoligonos().get(i);
                    double x[] = new double[poligono.getX().length];
                    double y[] = new double[poligono.getY().length];
                    switch (transformar.getTipoTransformacao()) {
                        case 0:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double translacao[][] = matrizTransformar.translacao(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = translacao[0][0];
                                y[j] = translacao[0][1];
                            }
                            break;
                        case 1:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double rotacao[][] = matrizTransformar.rotacao(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = rotacao[0][0];
                                y[j] = rotacao[0][1];
                            }
                            break;
                        case 2:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double rotacaoPontoDeEixo[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = rotacaoPontoDeEixo[0][0];
                                y[j] = rotacaoPontoDeEixo[0][1];
                            }
                            break;
                        case 3:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double escalonamentoOrigem[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, poligono.getX()[j], poligono.getY()[j], poligono.getX()[0], poligono.getY()[0]);
                                x[j] = escalonamentoOrigem[0][0];
                                y[j] = escalonamentoOrigem[0][1];
                            }
                            break;
                        case 4:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double escalonamento[][] = matrizTransformar.escalonamento(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = escalonamento[0][0];
                                y[j] = escalonamento[0][1];
                            }
                            break;
                        case 5:
                            double mediaX = 0; 
                            double mediaY = 0;
                            
                            for (int j = 0; j < poligono.getX().length; j++) {
                                mediaX += poligono.getX()[j];
                                mediaY += poligono.getY()[j];
                            }
                            mediaX = mediaX/poligono.getX().length;
                            mediaY = mediaY/poligono.getY().length;
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double escalonamentoOrigem[][] = matrizTransformar.escalonamentoPontoDeEixo(transformar, poligono.getX()[j], poligono.getY()[j], mediaX, mediaY);
                                x[j] = escalonamentoOrigem[0][0];
                                y[j] = escalonamentoOrigem[0][1];
                            }
                            break;
                        case 6:
                            double mediaXRotacao = 0; 
                            double mediaYRotacao = 0;
                            
                            for (int j = 0; j < poligono.getX().length; j++) {
                                mediaXRotacao += poligono.getX()[j];
                                mediaYRotacao += poligono.getY()[j];
                            }
                            transformar.setX(mediaXRotacao/poligono.getX().length);
                            transformar.setY(mediaYRotacao/poligono.getY().length);
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double rotacaoPontoDeEixo[][] = matrizTransformar.rotacaoPontoDeEixo(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = rotacaoPontoDeEixo[0][0];
                                y[j] = rotacaoPontoDeEixo[0][1];
                            }
                            break;
                        case 7:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double reflexao[][] = matrizTransformar.reflexao(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = reflexao[0][0];
                                y[j] = reflexao[0][1];
                            }
                            break;
                        case 8:
                            for (int j = 0; j < poligono.getX().length; j++) {
                                double cisalhamento[][] = matrizTransformar.cisalhamento(transformar, poligono.getX()[j], poligono.getY()[j]);
                                x[j] = cisalhamento[0][0];
                                y[j] = cisalhamento[0][1];
                            }
                            break;
                    }
                    poligono.setX(x);
                    poligono.setY(y);
                    break;
                }
            }
            pnlDesenhar.repaint();
        }
    }

    public void setLookAndFeel() throws UnsupportedLookAndFeelException {
        try {
            PlasticLookAndFeel.setPlasticTheme(new ExperienceRoyale());
            try {
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            } catch (InstantiationException ex) {
                //   Logger.getLogger(jfprincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                //  Logger.getLogger(class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                //  Logger.getLogger(jfprincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);
        setBackground(SystemColor.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPropriedades = new javax.swing.JPanel();
        lblObjetos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaObjetos = new javax.swing.JList<>();
        btnAdicionarObjeto = new javax.swing.JButton();
        btnDeletarObjeto = new javax.swing.JButton();
        pnlWindow = new javax.swing.JPanel();
        pnlZoom = new javax.swing.JPanel();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        lblPassoZoom = new javax.swing.JLabel();
        spnPassoZoom = new javax.swing.JSpinner();
        pnlTranslacao = new javax.swing.JPanel();
        btnUP = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        spnPasso = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        pnlRotacao = new javax.swing.JPanel();
        lblGraus = new javax.swing.JLabel();
        edtGraus = new javax.swing.JTextField();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        pnlMatrizes = new javax.swing.JPanel();
        btnMatrizes = new javax.swing.JButton();
        pnlTransformacoes = new javax.swing.JPanel();
        btnTransformacoes = new javax.swing.JButton();
        pnlViewPort = new javax.swing.JScrollPane();
        pnlDesenhar = listaObjetosDesenhados;
        lblViewPort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gráfica 2D - Willian, Rodrigo");

        pnlPropriedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedades"));

        lblObjetos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblObjetos.setForeground(new java.awt.Color(51, 0, 153));
        lblObjetos.setText("Objetos");

        listaObjetos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listaObjetos.setForeground(new java.awt.Color(51, 0, 153));
        jScrollPane1.setViewportView(listaObjetos);

        btnAdicionarObjeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionarObjeto.setForeground(new java.awt.Color(51, 0, 153));
        btnAdicionarObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/adicionar.png"))); // NOI18N
        btnAdicionarObjeto.setText("Adicionar");
        btnAdicionarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarObjetoActionPerformed(evt);
            }
        });

        btnDeletarObjeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeletarObjeto.setForeground(new java.awt.Color(51, 0, 153));
        btnDeletarObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/remover.png"))); // NOI18N
        btnDeletarObjeto.setText("Remover");
        btnDeletarObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarObjetoActionPerformed(evt);
            }
        });

        pnlWindow.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Window", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        pnlZoom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zoom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoomMais.png"))); // NOI18N
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoomMenos.png"))); // NOI18N
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        lblPassoZoom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassoZoom.setForeground(new java.awt.Color(51, 0, 153));
        lblPassoZoom.setText("Passo");

        spnPassoZoom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spnPassoZoom.setModel(new javax.swing.SpinnerNumberModel(40, 40, 90, 5));
        spnPassoZoom.setToolTipText("");

        javax.swing.GroupLayout pnlZoomLayout = new javax.swing.GroupLayout(pnlZoom);
        pnlZoom.setLayout(pnlZoomLayout);
        pnlZoomLayout.setHorizontalGroup(
            pnlZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlZoomLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPassoZoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnPassoZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlZoomLayout.setVerticalGroup(
            pnlZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlZoomLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnPassoZoom)
                    .addComponent(lblPassoZoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZoomOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZoomIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlTranslacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Translação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/setaCima.png"))); // NOI18N
        btnUP.setPreferredSize(new java.awt.Dimension(73, 49));
        btnUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPActionPerformed(evt);
            }
        });

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/setaEsquerda.png"))); // NOI18N
        btnLeft.setPreferredSize(new java.awt.Dimension(69, 25));
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/setaBaixo.png"))); // NOI18N
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/setaDireita.png"))); // NOI18N
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        spnPasso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spnPasso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        spnPasso.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("Passo");

        javax.swing.GroupLayout pnlTranslacaoLayout = new javax.swing.GroupLayout(pnlTranslacao);
        pnlTranslacao.setLayout(pnlTranslacaoLayout);
        pnlTranslacaoLayout.setHorizontalGroup(
            pnlTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTranslacaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pnlTranslacaoLayout.setVerticalGroup(
            pnlTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTranslacaoLayout.createSequentialGroup()
                .addComponent(btnUP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTranslacaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTranslacaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(spnPasso)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlRotacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rotação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblGraus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGraus.setForeground(new java.awt.Color(51, 0, 153));
        lblGraus.setText("Graus:");

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/coordX.png"))); // NOI18N
        btnX.setPreferredSize(new java.awt.Dimension(57, 25));

        btnY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/coordY.png"))); // NOI18N
        btnY.setPreferredSize(new java.awt.Dimension(57, 25));

        btnZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/coordZ.png"))); // NOI18N
        btnZ.setPreferredSize(new java.awt.Dimension(57, 25));

        javax.swing.GroupLayout pnlRotacaoLayout = new javax.swing.GroupLayout(pnlRotacao);
        pnlRotacao.setLayout(pnlRotacaoLayout);
        pnlRotacaoLayout.setHorizontalGroup(
            pnlRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGraus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRotacaoLayout.createSequentialGroup()
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtGraus))
                .addContainerGap())
        );
        pnlRotacaoLayout.setVerticalGroup(
            pnlRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGraus)
                    .addComponent(edtGraus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZ, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlMatrizes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrizes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnMatrizes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMatrizes.setForeground(new java.awt.Color(51, 0, 153));
        btnMatrizes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.png"))); // NOI18N
        btnMatrizes.setText("Calcular");
        btnMatrizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMatrizesLayout = new javax.swing.GroupLayout(pnlMatrizes);
        pnlMatrizes.setLayout(pnlMatrizesLayout);
        pnlMatrizesLayout.setHorizontalGroup(
            pnlMatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMatrizes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMatrizesLayout.setVerticalGroup(
            pnlMatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMatrizes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTransformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transformações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnTransformacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTransformacoes.setForeground(new java.awt.Color(51, 0, 153));
        btnTransformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/transformar.png"))); // NOI18N
        btnTransformacoes.setText("Aplicar");
        btnTransformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTransformacoesLayout = new javax.swing.GroupLayout(pnlTransformacoes);
        pnlTransformacoes.setLayout(pnlTransformacoesLayout);
        pnlTransformacoesLayout.setHorizontalGroup(
            pnlTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTransformacoesLayout.setVerticalGroup(
            pnlTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlWindowLayout = new javax.swing.GroupLayout(pnlWindow);
        pnlWindow.setLayout(pnlWindowLayout);
        pnlWindowLayout.setHorizontalGroup(
            pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlZoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWindowLayout.createSequentialGroup()
                            .addComponent(pnlTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnlWindowLayout.createSequentialGroup()
                            .addComponent(pnlMatrizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlWindowLayout.setVerticalGroup(
            pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWindowLayout.createSequentialGroup()
                .addComponent(pnlTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMatrizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTransformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPropriedadesLayout = new javax.swing.GroupLayout(pnlPropriedades);
        pnlPropriedades.setLayout(pnlPropriedadesLayout);
        pnlPropriedadesLayout.setHorizontalGroup(
            pnlPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPropriedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblObjetos)
                    .addGroup(pnlPropriedadesLayout.createSequentialGroup()
                        .addComponent(btnDeletarObjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarObjeto))
                    .addComponent(jScrollPane1)
                    .addComponent(pnlWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPropriedadesLayout.setVerticalGroup(
            pnlPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPropriedadesLayout.createSequentialGroup()
                .addComponent(lblObjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletarObjeto)
                    .addComponent(btnAdicionarObjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pnlViewPort.setBorder(null);
        pnlViewPort.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pnlViewPort.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        pnlViewPort.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlViewPort.setMaximumSize(new java.awt.Dimension(520, 520));
        pnlViewPort.setMinimumSize(new java.awt.Dimension(520, 520));
        pnlViewPort.setPreferredSize(new java.awt.Dimension(520, 520));

        pnlDesenhar.setBackground(new java.awt.Color(255, 255, 255));
        pnlDesenhar.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pnlDesenhar.setMinimumSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout pnlDesenharLayout = new javax.swing.GroupLayout(pnlDesenhar);
        pnlDesenhar.setLayout(pnlDesenharLayout);
        pnlDesenharLayout.setHorizontalGroup(
            pnlDesenharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        pnlDesenharLayout.setVerticalGroup(
            pnlDesenharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        pnlViewPort.setViewportView(pnlDesenhar);

        lblViewPort.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblViewPort.setForeground(new java.awt.Color(51, 0, 153));
        lblViewPort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/painelVisualizacao.png"))); // NOI18N
        lblViewPort.setText("VIEWPORT (clique para deixar invisível)");
        lblViewPort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPortMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarObjetoActionPerformed
        InclusaoObjeto inclusao = new InclusaoObjeto(this, listaObjetosDesenhados);
        inclusao.setVisible(true);
    }//GEN-LAST:event_btnAdicionarObjetoActionPerformed

    private void btnDeletarObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarObjetoActionPerformed
        if (listaObjetos.getSelectedValue() != null) {
            for (int i = 0; i < listaObjetosDesenhados.getListaPontos().size(); i++) {
                String nome1 = listaObjetosDesenhados.getListaPontos().get(i).getNome().replaceAll("Ponto: ", "");
                String nome2 = listaObjetos.getSelectedValue().replaceAll("Ponto: ", "");
                if (nome1.equals(nome2)) {
                    listaObjetosDesenhados.getListaPontos().remove(i);
                }
            }
            for (int i = 0; i < listaObjetosDesenhados.getListaLinhas().size(); i++) {
                String nome1 = listaObjetosDesenhados.getListaLinhas().get(i).getNome().replaceAll("Linha: ", "");
                String nome2 = listaObjetos.getSelectedValue().replaceAll("Linha: ", "");
                if (nome1.equals(nome2)) {
                    listaObjetosDesenhados.getListaLinhas().remove(i);
                }
            }
            for (int i = 0; i < listaObjetosDesenhados.getListaPolilinhas().size(); i++) {
                String nome1 = listaObjetosDesenhados.getListaPolilinhas().get(i).getNome().replaceAll("Polilinha: ", "");
                String nome2 = listaObjetos.getSelectedValue().replaceAll("Polilinha: ", "");
                if (nome1.equals(nome2)) {
                    listaObjetosDesenhados.getListaPolilinhas().remove(i);
                }
            }
            for (int i = 0; i < listaObjetosDesenhados.getListaPoligonos().size(); i++) {
                String nome1 = listaObjetosDesenhados.getListaPoligonos().get(i).getNome().replaceAll("Polígono: ", "");
                String nome2 = listaObjetos.getSelectedValue().replaceAll("Polígono: ", "");
                if (nome1.equals(nome2)) {
                    listaObjetosDesenhados.getListaPoligonos().remove(i);
                }
            }

            for (int i = 0; i < listaObjetosDesenhados.getlistaObjetos().size(); i++) {
                if (listaObjetosDesenhados.getlistaObjetos().getElementAt(i).equals(listaObjetos.getSelectedValue())) {
                    listaObjetosDesenhados.getlistaObjetos().remove(i);
                }
            }
            this.repaint();
            listaObjetos.removeAll();
            listaObjetos.setModel(listaObjetosDesenhados.getlistaObjetos());
        }
    }//GEN-LAST:event_btnDeletarObjetoActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        pnlViewPort.getVerticalScrollBar().setValue(pnlViewPort.getVerticalScrollBar().getValue() + (int) spnPasso.getModel().getValue());
        pnlDesenhar.repaint();
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        pnlViewPort.getHorizontalScrollBar().setValue(pnlViewPort.getHorizontalScrollBar().getValue() + (int) spnPasso.getModel().getValue());
        pnlDesenhar.repaint();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPActionPerformed
        pnlViewPort.getVerticalScrollBar().setValue(pnlViewPort.getVerticalScrollBar().getValue() - (int) spnPasso.getModel().getValue());
        pnlDesenhar.repaint();
    }//GEN-LAST:event_btnUPActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        pnlViewPort.getHorizontalScrollBar().setValue(pnlViewPort.getHorizontalScrollBar().getValue() - (int) spnPasso.getModel().getValue());
        pnlDesenhar.repaint();
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        if (vport.getWindow().getCoordXMin() < vport.getWindow().getCoordXMax()) {
            vport.getWindow().setCoordXMin(vport.getWindow().getCoordXMin() + (int) spnPassoZoom.getModel().getValue());
            vport.getWindow().setCoordXMax(vport.getWindow().getCoordXMax() - (int) spnPassoZoom.getModel().getValue());
            vport.getWindow().setCoordYMin(vport.getWindow().getCoordYMin() + (int) spnPassoZoom.getModel().getValue());
            vport.getWindow().setCoordYMax(vport.getWindow().getCoordYMax() - (int) spnPassoZoom.getModel().getValue());
        }
        this.repaint();
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        vport.getWindow().setCoordXMin(vport.getWindow().getCoordXMin() - (int) spnPassoZoom.getModel().getValue());
        vport.getWindow().setCoordXMax(vport.getWindow().getCoordXMax() + (int) spnPassoZoom.getModel().getValue());
        vport.getWindow().setCoordYMin(vport.getWindow().getCoordYMin() - (int) spnPassoZoom.getModel().getValue());
        vport.getWindow().setCoordYMax(vport.getWindow().getCoordYMax() + (int) spnPassoZoom.getModel().getValue());
        this.repaint();
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void lblViewPortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPortMouseClicked
        if (viewPortVisivel) {
            pnlDesenhar.setVisible(false);
            ImageIcon valid = new ImageIcon(getClass().getResource("/Img/painelInvisivel.png"));
            this.lblViewPort.setIcon(valid);
            this.lblViewPort.setText("VIEWPORT (clique para deixar visível)");
            viewPortVisivel = false;
        } else {
            ImageIcon icone = new ImageIcon("/Img/painelVisualizacao.png");
            pnlDesenhar.setVisible(true);
            ImageIcon valid = new ImageIcon(getClass().getResource("/Img/painelVisualizacao.png"));
            this.lblViewPort.setIcon(valid);
            this.lblViewPort.setText("VIEWPORT (clique para deixar ínvisível)");
            viewPortVisivel = true;
        }
    }//GEN-LAST:event_lblViewPortMouseClicked

    private void btnMatrizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizesActionPerformed
        Matrizes matrizes = new Matrizes(this);
        matrizes.setVisible(true);
    }//GEN-LAST:event_btnMatrizesActionPerformed

    private void btnTransformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformacoesActionPerformed
        if ((listaObjetos.getSelectedValue() == null) || (listaObjetos.getSelectedValue().equals("Linha: Vértice X")) || (listaObjetos.getSelectedValue().equals("Linha: Vértice Y"))) {
            JOptionPane.showMessageDialog(null, "Selecione um objeto para aplicar as transformações! \nO mesmo deve ser diferente dos vértices principais X e Y!");
        } else {
            Transformacoes transformacoes = new Transformacoes(this);
            transformacoes.setVisible(true);
        }
    }//GEN-LAST:event_btnTransformacoesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarObjeto;
    private javax.swing.JButton btnDeletarObjeto;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnMatrizes;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnTransformacoes;
    private javax.swing.JButton btnUP;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JTextField edtGraus;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGraus;
    private javax.swing.JLabel lblObjetos;
    private javax.swing.JLabel lblPassoZoom;
    private javax.swing.JLabel lblViewPort;
    private javax.swing.JList<String> listaObjetos;
    private javax.swing.JPanel pnlDesenhar;
    private javax.swing.JPanel pnlMatrizes;
    private javax.swing.JPanel pnlPropriedades;
    private javax.swing.JPanel pnlRotacao;
    private javax.swing.JPanel pnlTransformacoes;
    private javax.swing.JPanel pnlTranslacao;
    private javax.swing.JScrollPane pnlViewPort;
    private javax.swing.JPanel pnlWindow;
    private javax.swing.JPanel pnlZoom;
    private javax.swing.JSpinner spnPasso;
    private javax.swing.JSpinner spnPassoZoom;
    // End of variables declaration//GEN-END:variables
}
