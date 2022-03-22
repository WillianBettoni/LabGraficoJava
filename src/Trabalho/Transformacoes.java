package Trabalho;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Transformacoes extends javax.swing.JFrame {

    TelaPrincipal Window;
    String caracteresEscalonamento = "0987654321.";
    String caracteresTranslacao = "0987654321-";
    String caracteresAngulo = "0987654321-";

    public Transformacoes() {
        initComponents();
    }

    public Transformacoes(TelaPrincipal mainWindow) {
        setIconeJanela();
        initComponents();       
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.Window = mainWindow;
        rgRotacionarSobOrigem.setSelected(true);
        rgEscalonarSimples.setSelected(true);
        edtXRotacao.setEnabled(false);
        edtYRotacao.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpRotacionar = new javax.swing.ButtonGroup();
        gpEscalar = new javax.swing.ButtonGroup();
        TabTransformacoes = new javax.swing.JTabbedPane();
        tabTranslacao = new javax.swing.JPanel();
        pnlCoordTranslatar = new javax.swing.JPanel();
        lblXTranslatar = new javax.swing.JLabel();
        edtTranslatarX = new javax.swing.JTextField();
        lblYTranslatar = new javax.swing.JLabel();
        edtTranslatarY = new javax.swing.JTextField();
        tabRotacao = new javax.swing.JPanel();
        pnlRotacionar = new javax.swing.JPanel();
        rgRotacionarSobOrigem = new javax.swing.JRadioButton();
        rgRotacionarSobrePontoDeEixo = new javax.swing.JRadioButton();
        rgRotacionarSobreCentroObj = new javax.swing.JRadioButton();
        pnlAnguloRotacao = new javax.swing.JPanel();
        edtAnguloRotacao = new javax.swing.JTextField();
        pnlPontosRotacao = new javax.swing.JPanel();
        edtXRotacao = new javax.swing.JTextField();
        edtYRotacao = new javax.swing.JTextField();
        lblPontoEixoX = new javax.swing.JLabel();
        lblPontoEixoY = new javax.swing.JLabel();
        tabEscalonamento = new javax.swing.JPanel();
        pnlCoordTranslatar1 = new javax.swing.JPanel();
        lblXTranslatar1 = new javax.swing.JLabel();
        edtEscalarX = new javax.swing.JTextField();
        lblYTranslatar1 = new javax.swing.JLabel();
        edtEscalarY = new javax.swing.JTextField();
        pnlEscalonar = new javax.swing.JPanel();
        rgEscalonarSimples = new javax.swing.JRadioButton();
        rgEscalonarRelacaoOrigem = new javax.swing.JRadioButton();
        rgEscalonarSobreCentroObj = new javax.swing.JRadioButton();
        tabReflexao = new javax.swing.JPanel();
        pnlRefletir = new javax.swing.JPanel();
        cbRefletirEixoY = new javax.swing.JCheckBox();
        cbRefletirEixoX = new javax.swing.JCheckBox();
        tabCisalhamento = new javax.swing.JPanel();
        pnlDistorcao = new javax.swing.JPanel();
        lblXDistorcao = new javax.swing.JLabel();
        edtDistorcaoX = new javax.swing.JTextField();
        lblYDistorcao = new javax.swing.JLabel();
        edtDistorcaoY = new javax.swing.JTextField();
        btnMenuPrincipal = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transformações");

        TabTransformacoes.setForeground(new java.awt.Color(51, 0, 153));
        TabTransformacoes.setFocusable(false);
        TabTransformacoes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TabTransformacoes.setPreferredSize(new java.awt.Dimension(450, 240));

        tabTranslacao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        pnlCoordTranslatar.setBorder(javax.swing.BorderFactory.createTitledBorder("Vetores de Translação"));
        pnlCoordTranslatar.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlCoordTranslatar.setPreferredSize(new java.awt.Dimension(410, 75));

        lblXTranslatar.setForeground(new java.awt.Color(51, 0, 153));
        lblXTranslatar.setText("Dx:");

        edtTranslatarX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTranslatarXKeyTyped(evt);
            }
        });

        lblYTranslatar.setForeground(new java.awt.Color(51, 0, 153));
        lblYTranslatar.setText("Dy:");

        edtTranslatarY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtTranslatarYKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCoordTranslatarLayout = new javax.swing.GroupLayout(pnlCoordTranslatar);
        pnlCoordTranslatar.setLayout(pnlCoordTranslatarLayout);
        pnlCoordTranslatarLayout.setHorizontalGroup(
            pnlCoordTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordTranslatarLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblXTranslatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTranslatarX, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblYTranslatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTranslatarY, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnlCoordTranslatarLayout.setVerticalGroup(
            pnlCoordTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordTranslatarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(edtTranslatarY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYTranslatar)
                    .addComponent(edtTranslatarX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXTranslatar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabTranslacaoLayout = new javax.swing.GroupLayout(tabTranslacao);
        tabTranslacao.setLayout(tabTranslacaoLayout);
        tabTranslacaoLayout.setHorizontalGroup(
            tabTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTranslacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCoordTranslatar, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabTranslacaoLayout.setVerticalGroup(
            tabTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTranslacaoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pnlCoordTranslatar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );

        TabTransformacoes.addTab("Translação", tabTranslacao);

        pnlRotacionar.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotacionar"));
        pnlRotacionar.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlRotacionar.setPreferredSize(new java.awt.Dimension(410, 75));

        gpRotacionar.add(rgRotacionarSobOrigem);
        rgRotacionarSobOrigem.setForeground(new java.awt.Color(51, 0, 153));
        rgRotacionarSobOrigem.setText("Rotacionar sobre a origem");
        rgRotacionarSobOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgRotacionarSobOrigemMouseClicked(evt);
            }
        });

        gpRotacionar.add(rgRotacionarSobrePontoDeEixo);
        rgRotacionarSobrePontoDeEixo.setForeground(new java.awt.Color(51, 0, 153));
        rgRotacionarSobrePontoDeEixo.setText("Rotacionar sobre um ponto de eixo");
        rgRotacionarSobrePontoDeEixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgRotacionarSobrePontoDeEixoMouseClicked(evt);
            }
        });

        gpRotacionar.add(rgRotacionarSobreCentroObj);
        rgRotacionarSobreCentroObj.setForeground(new java.awt.Color(51, 0, 153));
        rgRotacionarSobreCentroObj.setText("Rotacionar sobre o centro do objeto");
        rgRotacionarSobreCentroObj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgRotacionarSobreCentroObjMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRotacionarLayout = new javax.swing.GroupLayout(pnlRotacionar);
        pnlRotacionar.setLayout(pnlRotacionarLayout);
        pnlRotacionarLayout.setHorizontalGroup(
            pnlRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotacionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rgRotacionarSobOrigem)
                    .addComponent(rgRotacionarSobrePontoDeEixo)
                    .addComponent(rgRotacionarSobreCentroObj))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        pnlRotacionarLayout.setVerticalGroup(
            pnlRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRotacionarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(rgRotacionarSobOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgRotacionarSobrePontoDeEixo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgRotacionarSobreCentroObj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAnguloRotacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Ângulo de Rotação"));
        pnlAnguloRotacao.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlAnguloRotacao.setPreferredSize(new java.awt.Dimension(410, 75));

        edtAnguloRotacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtAnguloRotacaoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlAnguloRotacaoLayout = new javax.swing.GroupLayout(pnlAnguloRotacao);
        pnlAnguloRotacao.setLayout(pnlAnguloRotacaoLayout);
        pnlAnguloRotacaoLayout.setHorizontalGroup(
            pnlAnguloRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnguloRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtAnguloRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAnguloRotacaoLayout.setVerticalGroup(
            pnlAnguloRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnguloRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtAnguloRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPontosRotacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));
        pnlPontosRotacao.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlPontosRotacao.setPreferredSize(new java.awt.Dimension(410, 75));

        edtXRotacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtXRotacaoKeyTyped(evt);
            }
        });

        edtYRotacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtYRotacaoKeyTyped(evt);
            }
        });

        lblPontoEixoX.setForeground(new java.awt.Color(51, 0, 153));
        lblPontoEixoX.setText("Rx:");

        lblPontoEixoY.setForeground(new java.awt.Color(51, 0, 153));
        lblPontoEixoY.setText("Ry:");

        javax.swing.GroupLayout pnlPontosRotacaoLayout = new javax.swing.GroupLayout(pnlPontosRotacao);
        pnlPontosRotacao.setLayout(pnlPontosRotacaoLayout);
        pnlPontosRotacaoLayout.setHorizontalGroup(
            pnlPontosRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPontosRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPontoEixoX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtXRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPontoEixoY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtYRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlPontosRotacaoLayout.setVerticalGroup(
            pnlPontosRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPontosRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPontosRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtXRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtYRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontoEixoX)
                    .addComponent(lblPontoEixoY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabRotacaoLayout = new javax.swing.GroupLayout(tabRotacao);
        tabRotacao.setLayout(tabRotacaoLayout);
        tabRotacaoLayout.setHorizontalGroup(
            tabRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRotacionar, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addGroup(tabRotacaoLayout.createSequentialGroup()
                        .addComponent(pnlAnguloRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPontosRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabRotacaoLayout.setVerticalGroup(
            tabRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRotacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAnguloRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(pnlPontosRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        TabTransformacoes.addTab("Rotação", tabRotacao);

        pnlCoordTranslatar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vetores de Escalonamento"));
        pnlCoordTranslatar1.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlCoordTranslatar1.setPreferredSize(new java.awt.Dimension(410, 75));

        lblXTranslatar1.setForeground(new java.awt.Color(51, 0, 153));
        lblXTranslatar1.setText("Sx:");

        edtEscalarX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEscalarXKeyTyped(evt);
            }
        });

        lblYTranslatar1.setForeground(new java.awt.Color(51, 0, 153));
        lblYTranslatar1.setText("Sy:");

        edtEscalarY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEscalarYKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCoordTranslatar1Layout = new javax.swing.GroupLayout(pnlCoordTranslatar1);
        pnlCoordTranslatar1.setLayout(pnlCoordTranslatar1Layout);
        pnlCoordTranslatar1Layout.setHorizontalGroup(
            pnlCoordTranslatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordTranslatar1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblXTranslatar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEscalarX, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblYTranslatar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEscalarY, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnlCoordTranslatar1Layout.setVerticalGroup(
            pnlCoordTranslatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordTranslatar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordTranslatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(edtEscalarY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYTranslatar1)
                    .addComponent(edtEscalarX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXTranslatar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEscalonar.setBorder(javax.swing.BorderFactory.createTitledBorder("Escalonar"));
        pnlEscalonar.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlEscalonar.setPreferredSize(new java.awt.Dimension(410, 75));

        gpEscalar.add(rgEscalonarSimples);
        rgEscalonarSimples.setForeground(new java.awt.Color(51, 0, 153));
        rgEscalonarSimples.setText("Escalonar simples");

        gpEscalar.add(rgEscalonarRelacaoOrigem);
        rgEscalonarRelacaoOrigem.setForeground(new java.awt.Color(51, 0, 153));
        rgEscalonarRelacaoOrigem.setText("Escalonar em relação à origem");

        gpEscalar.add(rgEscalonarSobreCentroObj);
        rgEscalonarSobreCentroObj.setForeground(new java.awt.Color(51, 0, 153));
        rgEscalonarSobreCentroObj.setText("Escalonar sobre o centro do objeto");

        javax.swing.GroupLayout pnlEscalonarLayout = new javax.swing.GroupLayout(pnlEscalonar);
        pnlEscalonar.setLayout(pnlEscalonarLayout);
        pnlEscalonarLayout.setHorizontalGroup(
            pnlEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscalonarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rgEscalonarSimples)
                    .addComponent(rgEscalonarRelacaoOrigem)
                    .addComponent(rgEscalonarSobreCentroObj))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlEscalonarLayout.setVerticalGroup(
            pnlEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscalonarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(rgEscalonarSimples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgEscalonarRelacaoOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgEscalonarSobreCentroObj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabEscalonamentoLayout = new javax.swing.GroupLayout(tabEscalonamento);
        tabEscalonamento.setLayout(tabEscalonamentoLayout);
        tabEscalonamentoLayout.setHorizontalGroup(
            tabEscalonamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEscalonamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEscalonamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCoordTranslatar1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(pnlEscalonar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabEscalonamentoLayout.setVerticalGroup(
            tabEscalonamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEscalonamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEscalonar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCoordTranslatar1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(185, 185, 185))
        );

        TabTransformacoes.addTab("Escalonamento", tabEscalonamento);

        pnlRefletir.setBorder(javax.swing.BorderFactory.createTitledBorder("Refletir em torno"));
        pnlRefletir.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlRefletir.setPreferredSize(new java.awt.Dimension(410, 75));

        cbRefletirEixoY.setForeground(new java.awt.Color(51, 0, 153));
        cbRefletirEixoY.setText("Eixo Y");

        cbRefletirEixoX.setForeground(new java.awt.Color(51, 0, 153));
        cbRefletirEixoX.setText("Eixo X");

        javax.swing.GroupLayout pnlRefletirLayout = new javax.swing.GroupLayout(pnlRefletir);
        pnlRefletir.setLayout(pnlRefletirLayout);
        pnlRefletirLayout.setHorizontalGroup(
            pnlRefletirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRefletirLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(cbRefletirEixoX)
                .addGap(82, 82, 82)
                .addComponent(cbRefletirEixoY)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        pnlRefletirLayout.setVerticalGroup(
            pnlRefletirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRefletirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRefletirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRefletirEixoY)
                    .addComponent(cbRefletirEixoX))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabReflexaoLayout = new javax.swing.GroupLayout(tabReflexao);
        tabReflexao.setLayout(tabReflexaoLayout);
        tabReflexaoLayout.setHorizontalGroup(
            tabReflexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReflexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRefletir, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabReflexaoLayout.setVerticalGroup(
            tabReflexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReflexaoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pnlRefletir, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );

        TabTransformacoes.addTab("Reflexão", tabReflexao);

        pnlDistorcao.setBorder(javax.swing.BorderFactory.createTitledBorder("Distorção"));
        pnlDistorcao.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlDistorcao.setPreferredSize(new java.awt.Dimension(410, 75));

        lblXDistorcao.setForeground(new java.awt.Color(51, 0, 153));
        lblXDistorcao.setText("Sh x:");

        edtDistorcaoX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtDistorcaoXKeyTyped(evt);
            }
        });

        lblYDistorcao.setForeground(new java.awt.Color(51, 0, 153));
        lblYDistorcao.setText("Sh y:");

        edtDistorcaoY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtDistorcaoYKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDistorcaoLayout = new javax.swing.GroupLayout(pnlDistorcao);
        pnlDistorcao.setLayout(pnlDistorcaoLayout);
        pnlDistorcaoLayout.setHorizontalGroup(
            pnlDistorcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistorcaoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblXDistorcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDistorcaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblYDistorcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDistorcaoY, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pnlDistorcaoLayout.setVerticalGroup(
            pnlDistorcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistorcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDistorcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(edtDistorcaoY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYDistorcao)
                    .addComponent(edtDistorcaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXDistorcao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabCisalhamentoLayout = new javax.swing.GroupLayout(tabCisalhamento);
        tabCisalhamento.setLayout(tabCisalhamentoLayout);
        tabCisalhamentoLayout.setHorizontalGroup(
            tabCisalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCisalhamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDistorcao, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabCisalhamentoLayout.setVerticalGroup(
            tabCisalhamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCisalhamentoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pnlDistorcao, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );

        TabTransformacoes.addTab("Cisalhamento", tabCisalhamento);

        btnMenuPrincipal.setForeground(new java.awt.Color(51, 0, 153));
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/homepage.png"))); // NOI18N
        btnMenuPrincipal.setText("Cancelar");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnConfirmar.setForeground(new java.awt.Color(51, 0, 153));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/confirmar.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setPreferredSize(new java.awt.Dimension(83, 25));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setIconeJanela() {
        URL url = this.getClass().getResource("/Img/IconeJanela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    
    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        Window.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void edtTranslatarYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTranslatarYKeyTyped
        if(!caracteresTranslacao.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtTranslatarYKeyTyped

    private void edtAnguloRotacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtAnguloRotacaoKeyTyped
        if(!caracteresAngulo.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtAnguloRotacaoKeyTyped

    private void edtEscalarXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEscalarXKeyTyped
        if(!caracteresEscalonamento.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtEscalarXKeyTyped

    private void edtEscalarYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEscalarYKeyTyped
        if(!caracteresEscalonamento.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtEscalarYKeyTyped

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Transformar transf = new Transformar();
        String AMsg = "Favor preencher todos os campos.";
        switch (TabTransformacoes.getSelectedIndex()) {
            case 0:
                if ((!edtTranslatarX.getText().equals(""))&&(!edtTranslatarY.getText().equals(""))) {
                    transf.setX(Double.parseDouble(edtTranslatarX.getText()));
                    transf.setY(Double.parseDouble(edtTranslatarY.getText()));
                    transf.setTipoTransformacao(0);
                } else {
                    transf = null;
                    if(edtTranslatarX.getText().equals("")){
                        edtTranslatarX.requestFocus();
                    } else {
                        edtTranslatarY.requestFocus();
                    }
                }
                break;
            case 1:
                if(!edtAnguloRotacao.getText().equals("")){
                    transf.setAngulo(Double.parseDouble(edtAnguloRotacao.getText()));
                    if(rgRotacionarSobOrigem.isSelected()){
                        transf.setTipoTransformacao(1);
                    } else {
                        if(rgRotacionarSobreCentroObj.isSelected()){
                            transf.setTipoTransformacao(6);
                        } else {    
                            if ((!edtXRotacao.getText().equals(""))&&(!edtYRotacao.getText().equals(""))) {
                                transf.setX(Double.parseDouble(edtXRotacao.getText()));
                                transf.setY(Double.parseDouble(edtYRotacao.getText()));
                                transf.setTipoTransformacao(2);
                            } else {
                                transf = null;
                                if(edtXRotacao.getText().equals("")) {
                                    edtXRotacao.requestFocus();
                                } else {
                                    edtYRotacao.requestFocus();
                                }
                            } 
                        }
                    }
                } else {
                    transf = null;
                    edtAnguloRotacao.requestFocus();
                }
                break;
            case 2:
                if ((!edtEscalarX.getText().equals(""))&&(!edtEscalarY.getText().equals(""))) {
                    transf.setX(Double.parseDouble(edtEscalarX.getText()));
                    transf.setY(Double.parseDouble(edtEscalarY.getText()));
                    if(rgEscalonarRelacaoOrigem.isSelected()){
                        transf.setTipoTransformacao(3);
                    } else {
                        if(rgEscalonarSimples.isSelected()){
                            transf.setTipoTransformacao(4);
                        } else {
                            transf.setTipoTransformacao(5);
                        }
                    }
                } else {
                    transf = null;
                    if(edtEscalarX.getText().equals("")){
                        edtEscalarX.requestFocus();
                    } else {
                        edtEscalarY.requestFocus();
                    }
                }
                break;
            case 3:
                if(cbRefletirEixoX.isSelected()||cbRefletirEixoY.isSelected()){
                    transf.setX(0);
                    transf.setY(0);
                    if(cbRefletirEixoX.isSelected()){
                        transf.setX(1);
                    }
                    if(cbRefletirEixoY.isSelected()){
                        transf.setY(1);
                    } 
                    transf.setTipoTransformacao(7);
                } else {
                    transf = null;
                    AMsg = "Favor assinalar uma das opções!";
                    cbRefletirEixoX.requestFocus();
                }
                break;
            case 4:
                if ((!edtDistorcaoX.getText().equals(""))&&(!edtDistorcaoY.getText().equals(""))) {
                    AMsg = "Somente valores entre 0 e 1 são permitidos";
                    if((Double.parseDouble(edtDistorcaoX.getText()) < 0)||(Double.parseDouble(edtDistorcaoX.getText()) > 1)){
                        transf=null;
                        edtDistorcaoX.requestFocus();
                        break;
                    }
                    if((Double.parseDouble(edtDistorcaoY.getText()) < 0)||(Double.parseDouble(edtDistorcaoY.getText()) > 1)){
                        transf=null;
                        edtDistorcaoY.requestFocus();
                        break;
                    }
                    AMsg = "";
                    transf.setX(Double.parseDouble(edtDistorcaoX.getText()));
                    transf.setY(Double.parseDouble(edtDistorcaoY.getText()));
                    transf.setTipoTransformacao(8);
                } else {
                    transf = null;
                    if(edtDistorcaoX.getText().equals("")){
                        edtDistorcaoX.requestFocus();
                    } else {
                        edtDistorcaoY.requestFocus();
                    }
                }
                break;
        }
        if(transf!=null){
            Window.transformarMatrizes(transf);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, AMsg);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void edtXRotacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtXRotacaoKeyTyped
        if(!caracteresAngulo.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtXRotacaoKeyTyped

    private void edtYRotacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtYRotacaoKeyTyped
        if(!caracteresAngulo.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtYRotacaoKeyTyped

    private void edtTranslatarXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTranslatarXKeyTyped
        if(!caracteresTranslacao.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtTranslatarXKeyTyped

    private void rgRotacionarSobOrigemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgRotacionarSobOrigemMouseClicked
        edtXRotacao.setEnabled(false);
        edtYRotacao.setEnabled(false);
    }//GEN-LAST:event_rgRotacionarSobOrigemMouseClicked

    private void rgRotacionarSobrePontoDeEixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgRotacionarSobrePontoDeEixoMouseClicked
        edtXRotacao.setEnabled(true);
        edtYRotacao.setEnabled(true);
        
    }//GEN-LAST:event_rgRotacionarSobrePontoDeEixoMouseClicked

    private void rgRotacionarSobreCentroObjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgRotacionarSobreCentroObjMouseClicked
        edtXRotacao.setEnabled(false);
        edtYRotacao.setEnabled(false);
    }//GEN-LAST:event_rgRotacionarSobreCentroObjMouseClicked

    private void edtDistorcaoXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDistorcaoXKeyTyped
        if(!caracteresEscalonamento.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtDistorcaoXKeyTyped

    private void edtDistorcaoYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDistorcaoYKeyTyped
        if(!caracteresEscalonamento.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtDistorcaoYKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transformacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabTransformacoes;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JCheckBox cbRefletirEixoX;
    private javax.swing.JCheckBox cbRefletirEixoY;
    private javax.swing.JTextField edtAnguloRotacao;
    private javax.swing.JTextField edtDistorcaoX;
    private javax.swing.JTextField edtDistorcaoY;
    private javax.swing.JTextField edtEscalarX;
    private javax.swing.JTextField edtEscalarY;
    private javax.swing.JTextField edtTranslatarX;
    private javax.swing.JTextField edtTranslatarY;
    private javax.swing.JTextField edtXRotacao;
    private javax.swing.JTextField edtYRotacao;
    private javax.swing.ButtonGroup gpEscalar;
    private javax.swing.ButtonGroup gpRotacionar;
    private javax.swing.JLabel lblPontoEixoX;
    private javax.swing.JLabel lblPontoEixoY;
    private javax.swing.JLabel lblXDistorcao;
    private javax.swing.JLabel lblXTranslatar;
    private javax.swing.JLabel lblXTranslatar1;
    private javax.swing.JLabel lblYDistorcao;
    private javax.swing.JLabel lblYTranslatar;
    private javax.swing.JLabel lblYTranslatar1;
    private javax.swing.JPanel pnlAnguloRotacao;
    private javax.swing.JPanel pnlCoordTranslatar;
    private javax.swing.JPanel pnlCoordTranslatar1;
    private javax.swing.JPanel pnlDistorcao;
    private javax.swing.JPanel pnlEscalonar;
    private javax.swing.JPanel pnlPontosRotacao;
    private javax.swing.JPanel pnlRefletir;
    private javax.swing.JPanel pnlRotacionar;
    private javax.swing.JRadioButton rgEscalonarRelacaoOrigem;
    private javax.swing.JRadioButton rgEscalonarSimples;
    private javax.swing.JRadioButton rgEscalonarSobreCentroObj;
    private javax.swing.JRadioButton rgRotacionarSobOrigem;
    private javax.swing.JRadioButton rgRotacionarSobreCentroObj;
    private javax.swing.JRadioButton rgRotacionarSobrePontoDeEixo;
    private javax.swing.JPanel tabCisalhamento;
    private javax.swing.JPanel tabEscalonamento;
    private javax.swing.JPanel tabReflexao;
    private javax.swing.JPanel tabRotacao;
    private javax.swing.JPanel tabTranslacao;
    // End of variables declaration//GEN-END:variables
}
