package Trabalho;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InclusaoObjeto extends javax.swing.JFrame {
    JFrame Window;
    PainelDesenho listaDeObjetosDesenhados;
    ArrayList<Integer> xLinhaPonto = new ArrayList<>();
    ArrayList<Integer> yLinhaPonto = new ArrayList<>();
    ArrayList<Integer> xPoligonoPonto = new ArrayList<>();
    ArrayList<Integer> yPoligonoPonto = new ArrayList<>();
    DefaultListModel listaArestasPolil;
    DefaultListModel listaArestasPolig;
    Color cor;
    String caracteres="0987654321,-";
    
    public InclusaoObjeto() {
        initComponents();
    }
    
    public InclusaoObjeto(JFrame mainWindow, PainelDesenho listaDeObjetosDesenhados) {      
        setIconeJanela();
        initComponents(); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.Window = mainWindow;
        this.listaDeObjetosDesenhados = listaDeObjetosDesenhados;
        this.listaArestasPolil = new DefaultListModel();
        this.listaArestasPolig = new DefaultListModel();
        this.cor = painelCor.getBackground();
    }
    
    public void setIconeJanela() {
        URL url = this.getClass().getResource("/Img/IconeJanela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        painelCor = new javax.swing.JPanel();
        edtNome = new javax.swing.JTextField();
        TabObjetos = new javax.swing.JTabbedPane();
        tabPonto = new javax.swing.JPanel();
        pnlCoordPontos = new javax.swing.JPanel();
        lblXPonto = new javax.swing.JLabel();
        edtPontoX = new javax.swing.JTextField();
        lblYPonto = new javax.swing.JLabel();
        edtPontoY = new javax.swing.JTextField();
        lblZPonto = new javax.swing.JLabel();
        edtPontoZ = new javax.swing.JTextField();
        tabLinha = new javax.swing.JPanel();
        pnlCoordInicial = new javax.swing.JPanel();
        edLinhaX1 = new javax.swing.JTextField();
        edLinhaY1 = new javax.swing.JTextField();
        edtLinhaZ1 = new javax.swing.JTextField();
        lblX1Linha = new javax.swing.JLabel();
        lblY1Linha = new javax.swing.JLabel();
        lblZ1Linha = new javax.swing.JLabel();
        pnlCoordFinal = new javax.swing.JPanel();
        edtLinhaZ2 = new javax.swing.JTextField();
        edLinhaX2 = new javax.swing.JTextField();
        edLinhaY2 = new javax.swing.JTextField();
        lblX2Linha = new javax.swing.JLabel();
        lblY2Linha = new javax.swing.JLabel();
        lblZ2Linha = new javax.swing.JLabel();
        tabPolilinha = new javax.swing.JPanel();
        pnlCoordPolilinha = new javax.swing.JPanel();
        edtPolilinhaX = new javax.swing.JTextField();
        edtPolilinhaY = new javax.swing.JTextField();
        edtPolilinhaLinhaZ1 = new javax.swing.JTextField();
        lblX1Linha1 = new javax.swing.JLabel();
        lblY1Linha1 = new javax.swing.JLabel();
        lblZ1Linha1 = new javax.swing.JLabel();
        btnAdicionarArestaPolilinha = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArestasPolilinha = new javax.swing.JList<>();
        tabPoligono = new javax.swing.JPanel();
        pnlCoordPolilinha1 = new javax.swing.JPanel();
        edPoligonoX = new javax.swing.JTextField();
        edPoligonoY = new javax.swing.JTextField();
        edtPolilinhaZ1 = new javax.swing.JTextField();
        lblX1Linha2 = new javax.swing.JLabel();
        lblY1Linha2 = new javax.swing.JLabel();
        lblZ1Linha2 = new javax.swing.JLabel();
        btnAdicionarArestaPoligono = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listArestasPoligono = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Objeto");

        lblNome.setText("Nome:");

        painelCor.setBackground(new java.awt.Color(0, 0, 0));
        painelCor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelCorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCorLayout = new javax.swing.GroupLayout(painelCor);
        painelCor.setLayout(painelCorLayout);
        painelCorLayout.setHorizontalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        painelCorLayout.setVerticalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        TabObjetos.setPreferredSize(new java.awt.Dimension(450, 240));

        pnlCoordPontos.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas do Ponto"));
        pnlCoordPontos.setMaximumSize(new java.awt.Dimension(32800, 32800));
        pnlCoordPontos.setPreferredSize(new java.awt.Dimension(410, 75));

        lblXPonto.setForeground(new java.awt.Color(51, 0, 153));
        lblXPonto.setText("x:");

        edtPontoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPontoXActionPerformed(evt);
            }
        });
        edtPontoX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPontoXKeyTyped(evt);
            }
        });

        lblYPonto.setForeground(new java.awt.Color(51, 0, 153));
        lblYPonto.setText("y:");

        edtPontoY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPontoYKeyTyped(evt);
            }
        });

        lblZPonto.setForeground(new java.awt.Color(51, 0, 153));
        lblZPonto.setText("z:");

        edtPontoZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPontoZKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCoordPontosLayout = new javax.swing.GroupLayout(pnlCoordPontos);
        pnlCoordPontos.setLayout(pnlCoordPontosLayout);
        pnlCoordPontosLayout.setHorizontalGroup(
            pnlCoordPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordPontosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblXPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPontoX, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblYPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPontoY, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblZPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtPontoZ, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlCoordPontosLayout.setVerticalGroup(
            pnlCoordPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordPontosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordPontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(edtPontoY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZPonto)
                    .addComponent(edtPontoZ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYPonto)
                    .addComponent(edtPontoX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXPonto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabPontoLayout = new javax.swing.GroupLayout(tabPonto);
        tabPonto.setLayout(tabPontoLayout);
        tabPontoLayout.setHorizontalGroup(
            tabPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPontoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCoordPontos, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabPontoLayout.setVerticalGroup(
            tabPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPontoLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(pnlCoordPontos, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(165, 165, 165))
        );

        TabObjetos.addTab("Ponto", tabPonto);

        pnlCoordInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas do Ponto Inicial"));
        pnlCoordInicial.setPreferredSize(new java.awt.Dimension(410, 75));

        edLinhaX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edLinhaX1KeyTyped(evt);
            }
        });

        edLinhaY1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edLinhaY1KeyTyped(evt);
            }
        });

        edtLinhaZ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhaZ1KeyTyped(evt);
            }
        });

        lblX1Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblX1Linha.setText("x1:");

        lblY1Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblY1Linha.setText("y1:");

        lblZ1Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblZ1Linha.setText("z1:");

        javax.swing.GroupLayout pnlCoordInicialLayout = new javax.swing.GroupLayout(pnlCoordInicial);
        pnlCoordInicial.setLayout(pnlCoordInicialLayout);
        pnlCoordInicialLayout.setHorizontalGroup(
            pnlCoordInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordInicialLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblX1Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edLinhaX1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblY1Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edLinhaY1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblZ1Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtLinhaZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlCoordInicialLayout.setVerticalGroup(
            pnlCoordInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edLinhaX1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edLinhaY1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtLinhaZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX1Linha)
                    .addComponent(lblY1Linha)
                    .addComponent(lblZ1Linha))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlCoordFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas do Ponto Final"));
        pnlCoordFinal.setPreferredSize(new java.awt.Dimension(410, 75));

        edtLinhaZ2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhaZ2KeyTyped(evt);
            }
        });

        edLinhaX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edLinhaX2KeyTyped(evt);
            }
        });

        edLinhaY2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edLinhaY2KeyTyped(evt);
            }
        });

        lblX2Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblX2Linha.setText("x2:");

        lblY2Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblY2Linha.setText("y2:");

        lblZ2Linha.setForeground(new java.awt.Color(51, 0, 153));
        lblZ2Linha.setText("z2:");

        javax.swing.GroupLayout pnlCoordFinalLayout = new javax.swing.GroupLayout(pnlCoordFinal);
        pnlCoordFinal.setLayout(pnlCoordFinalLayout);
        pnlCoordFinalLayout.setHorizontalGroup(
            pnlCoordFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordFinalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblX2Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edLinhaX2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblY2Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edLinhaY2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblZ2Linha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtLinhaZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlCoordFinalLayout.setVerticalGroup(
            pnlCoordFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edLinhaX2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtLinhaZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edLinhaY2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX2Linha)
                    .addComponent(lblY2Linha)
                    .addComponent(lblZ2Linha))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabLinhaLayout = new javax.swing.GroupLayout(tabLinha);
        tabLinha.setLayout(tabLinhaLayout);
        tabLinhaLayout.setHorizontalGroup(
            tabLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCoordFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(pnlCoordInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabLinhaLayout.setVerticalGroup(
            tabLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLinhaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(pnlCoordInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlCoordFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );

        TabObjetos.addTab("Reta", tabLinha);

        pnlCoordPolilinha.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas Polilinha"));
        pnlCoordPolilinha.setPreferredSize(new java.awt.Dimension(220, 190));

        edtPolilinhaX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPolilinhaXKeyTyped(evt);
            }
        });

        edtPolilinhaY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPolilinhaYKeyTyped(evt);
            }
        });

        edtPolilinhaLinhaZ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPolilinhaLinhaZ1KeyTyped(evt);
            }
        });

        lblX1Linha1.setForeground(new java.awt.Color(51, 0, 153));
        lblX1Linha1.setText("Coordenada x1:");
        lblX1Linha1.setPreferredSize(new java.awt.Dimension(92, 22));

        lblY1Linha1.setForeground(new java.awt.Color(51, 0, 153));
        lblY1Linha1.setText("Coordenada y1:");
        lblY1Linha1.setPreferredSize(new java.awt.Dimension(92, 22));

        lblZ1Linha1.setForeground(new java.awt.Color(51, 0, 153));
        lblZ1Linha1.setText("Coordenada z1:");
        lblZ1Linha1.setPreferredSize(new java.awt.Dimension(92, 22));

        btnAdicionarArestaPolilinha.setForeground(new java.awt.Color(51, 0, 153));
        btnAdicionarArestaPolilinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inserir.png"))); // NOI18N
        btnAdicionarArestaPolilinha.setText("Adicionar");
        btnAdicionarArestaPolilinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarArestaPolilinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCoordPolilinhaLayout = new javax.swing.GroupLayout(pnlCoordPolilinha);
        pnlCoordPolilinha.setLayout(pnlCoordPolilinhaLayout);
        pnlCoordPolilinhaLayout.setHorizontalGroup(
            pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordPolilinhaLayout.createSequentialGroup()
                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCoordPolilinhaLayout.createSequentialGroup()
                        .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCoordPolilinhaLayout.createSequentialGroup()
                                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblZ1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblX1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtPolilinhaX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtPolilinhaLinhaZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCoordPolilinhaLayout.createSequentialGroup()
                                .addComponent(lblY1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edtPolilinhaY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoordPolilinhaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarArestaPolilinha)))
                .addContainerGap())
        );
        pnlCoordPolilinhaLayout.setVerticalGroup(
            pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoordPolilinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPolilinhaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPolilinhaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblY1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCoordPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPolilinhaLinhaZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZ1Linha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarArestaPolilinha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 190));

        jScrollPane1.setViewportView(listArestasPolilinha);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tabPolilinhaLayout = new javax.swing.GroupLayout(tabPolilinha);
        tabPolilinha.setLayout(tabPolilinhaLayout);
        tabPolilinhaLayout.setHorizontalGroup(
            tabPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPolilinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCoordPolilinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tabPolilinhaLayout.setVerticalGroup(
            tabPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPolilinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCoordPolilinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabObjetos.addTab("Polilinha", tabPolilinha);

        pnlCoordPolilinha1.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas Polígono"));
        pnlCoordPolilinha1.setForeground(new java.awt.Color(51, 0, 153));
        pnlCoordPolilinha1.setPreferredSize(new java.awt.Dimension(220, 190));

        edPoligonoX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edPoligonoXKeyTyped(evt);
            }
        });

        edPoligonoY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edPoligonoYKeyTyped(evt);
            }
        });

        edtPolilinhaZ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtPolilinhaZ1KeyTyped(evt);
            }
        });

        lblX1Linha2.setForeground(new java.awt.Color(51, 0, 153));
        lblX1Linha2.setText("Coordenada x1:");
        lblX1Linha2.setPreferredSize(new java.awt.Dimension(92, 22));

        lblY1Linha2.setForeground(new java.awt.Color(51, 0, 153));
        lblY1Linha2.setText("Coordenada y1:");
        lblY1Linha2.setPreferredSize(new java.awt.Dimension(92, 22));

        lblZ1Linha2.setForeground(new java.awt.Color(51, 0, 153));
        lblZ1Linha2.setText("Coordenada z1:");
        lblZ1Linha2.setPreferredSize(new java.awt.Dimension(92, 22));

        btnAdicionarArestaPoligono.setForeground(new java.awt.Color(51, 0, 153));
        btnAdicionarArestaPoligono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inserir.png"))); // NOI18N
        btnAdicionarArestaPoligono.setText("Adicionar");
        btnAdicionarArestaPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarArestaPoligonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCoordPolilinha1Layout = new javax.swing.GroupLayout(pnlCoordPolilinha1);
        pnlCoordPolilinha1.setLayout(pnlCoordPolilinha1Layout);
        pnlCoordPolilinha1Layout.setHorizontalGroup(
            pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoordPolilinha1Layout.createSequentialGroup()
                .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCoordPolilinha1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarArestaPoligono))
                    .addGroup(pnlCoordPolilinha1Layout.createSequentialGroup()
                        .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblX1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblY1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblZ1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtPolilinhaZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoordPolilinha1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(edPoligonoX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edPoligonoY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlCoordPolilinha1Layout.setVerticalGroup(
            pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoordPolilinha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edPoligonoX)
                    .addGroup(pnlCoordPolilinha1Layout.createSequentialGroup()
                        .addComponent(lblX1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblY1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edPoligonoY))
                .addGap(18, 18, 18)
                .addGroup(pnlCoordPolilinha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZ1Linha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPolilinhaZ1))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarArestaPoligono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 160));

        jScrollPane2.setViewportView(listArestasPoligono);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tabPoligonoLayout = new javax.swing.GroupLayout(tabPoligono);
        tabPoligono.setLayout(tabPoligonoLayout);
        tabPoligonoLayout.setHorizontalGroup(
            tabPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPoligonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCoordPolilinha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tabPoligonoLayout.setVerticalGroup(
            tabPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPoligonoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCoordPolilinha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TabObjetos.addTab("Polígono", tabPoligono);

        btnCancelar.setForeground(new java.awt.Color(51, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/homepage.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TabObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(painelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mudaCorPainelCores(Color corParam) {
        this.cor = corParam;
        painelCor.setBackground(cor);
    }
        
    private boolean ObjetoJaCriado(){
        //Ponto
        for (Ponto ponto : listaDeObjetosDesenhados.getListaPontos()) {
            if(edtNome.getText().equals(ponto.getNome())){    
                JOptionPane.showMessageDialog(rootPane, "Já existe um ponto desenhado com este nome, verifique.");
                return true;
            }
        }    
        //Linha
        for (Linha linha : listaDeObjetosDesenhados.getListaLinhas()) {
            if(edtNome.getText().equals(linha.getNome())){    
                JOptionPane.showMessageDialog(rootPane, "Já existe uma linha desenhada com este nome, verifique.");
                return true;
            }
        }
        //Polilinha
        for (Polilinha polilinha : listaDeObjetosDesenhados.getListaPolilinhas()) {
            if(edtNome.getText().equals(polilinha.getNome())){    
                JOptionPane.showMessageDialog(rootPane, "Já existe um objeto com este nome, verifique.");
                return true;
            }
        }
        //Poligono
        for (Poligono poligono : listaDeObjetosDesenhados.getListaPoligonos()) {
            if(edtNome.getText().equals(poligono.getNome())){    
                JOptionPane.showMessageDialog(rootPane, "Já existe um objeto com este nome, verifique.");
                return true;
            }
        }        
        return false;
    }
    
    private void btnAdicionarArestaPolilinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarArestaPolilinhaActionPerformed
        if(!edtPolilinhaX.getText().equals("") || !edtPolilinhaY.getText().equals("")){    
            xLinhaPonto.add(Integer.parseInt(edtPolilinhaX.getText()));
            yLinhaPonto.add(Integer.parseInt(edtPolilinhaY.getText()));
            listaArestasPolil.addElement("Coord. x: " + edtPolilinhaX.getText() + " | Coord. y: " + edtPolilinhaY.getText());
            listArestasPolilinha.setModel(listaArestasPolil);
            edtPolilinhaX.setText("");
            edtPolilinhaY.setText("");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Favor preencher todos os campos.");
        }
    }//GEN-LAST:event_btnAdicionarArestaPolilinhaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Window.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(!edtNome.getText().equals("") && !ObjetoJaCriado()){
            // Ponto
            if(TabObjetos.getSelectedIndex() == 0){             
                if(!edtPontoX.getText().equals("") || !edtPontoY.getText().equals("")){    
                    Ponto ponto = new Ponto(Integer.parseInt(edtPontoX.getText()), Integer.parseInt(edtPontoY.getText()), 3, edtNome.getText(), cor);
                    listaDeObjetosDesenhados.adicionarPonto(ponto);
                    listaDeObjetosDesenhados.adicionarObjetoNaLista("Ponto: " + edtNome.getText());
                    Window.repaint();
                    Window.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Favor preencher todos os campos.");
                }
            }
            // Linha
            if(TabObjetos.getSelectedIndex() == 1){
                if(!edLinhaX1.getText().equals("") || !edLinhaY1.getText().equals("") ||
                   !edLinhaX2.getText().equals("") || !edLinhaY2.getText().equals("")){
                    Linha linha = new Linha(Integer.parseInt(edLinhaX1.getText()), Integer.parseInt(edLinhaY1.getText()),
                                                     Integer.parseInt(edLinhaX2.getText()), Integer.parseInt(edLinhaY2.getText()),edtNome.getText(), cor);
                    listaDeObjetosDesenhados.adicionarLinha(linha);
                    listaDeObjetosDesenhados.adicionarObjetoNaLista("Linha: " + edtNome.getText());
                    Window.repaint();
                    Window.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Favor preencher todos os campos.");
                }
            }
            // Polilinha
            if(TabObjetos.getSelectedIndex() == 2){
                if(xLinhaPonto.size() >= 3 && yLinhaPonto.size() >= 3){
                    double[] xArrayLinhas = new double[xLinhaPonto.size()];
                    double[] yArrayLinhas = new double[yLinhaPonto.size()];

                    for(int i = 0; i < xLinhaPonto.size(); i++){
                        xArrayLinhas[i] = xLinhaPonto.get(i);
                    }
                    for(int i = 0; i < yLinhaPonto.size(); i++){
                        yArrayLinhas[i] = yLinhaPonto.get(i);
                    }
                    Polilinha polilinha = new Polilinha(xArrayLinhas, yArrayLinhas, edtNome.getText(), cor);
                    listaDeObjetosDesenhados.adicionarPolilinha(polilinha);
                    xLinhaPonto = new ArrayList<>();
                    yLinhaPonto = new ArrayList<>();
                    listaDeObjetosDesenhados.adicionarObjetoNaLista("Polilinha: " + edtNome.getText());
                    Window.repaint();
                    Window.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Favor incluir ao menos tres pontos.");
                }                
            }
            // Polígono
            if(TabObjetos.getSelectedIndex() == 3){
                if(xPoligonoPonto.size() >= 3){
                    double[] xArrayPoligonos = new double[xPoligonoPonto.size()];
                    double[] yArrayPoligonos = new double[yPoligonoPonto.size()];

                    for(int i = 0; i < xPoligonoPonto.size(); i++){
                        xArrayPoligonos[i] = xPoligonoPonto.get(i);
                    }
                    for(int i = 0; i < yPoligonoPonto.size(); i++){
                        yArrayPoligonos[i] = yPoligonoPonto.get(i);
                    }
                    Poligono poligonos = new Poligono(xArrayPoligonos, yArrayPoligonos,xArrayPoligonos.length, edtNome.getText(), cor);
                    listaDeObjetosDesenhados.adicionarPoligono(poligonos);
                    xPoligonoPonto = new ArrayList<>();
                    yPoligonoPonto = new ArrayList<>();
                    listaDeObjetosDesenhados.adicionarObjetoNaLista("Polígono: " + edtNome.getText());
                    Window.repaint();
                    Window.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Favor incluir ao menos 3 pontos.");
                }                
            }
            }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Informe o nome do objeto.");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAdicionarArestaPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarArestaPoligonoActionPerformed
            
            if(!edPoligonoX.getText().equals("") || !edPoligonoY.getText().equals("")){
                xPoligonoPonto.add(Integer.parseInt(edPoligonoX.getText()));
                yPoligonoPonto.add(Integer.parseInt(edPoligonoY.getText()));
                listaArestasPolig.addElement("Coord. x: " + edPoligonoX.getText() + " | Coord. y: " + edPoligonoY.getText());
                listArestasPoligono.setModel(listaArestasPolig);
                edPoligonoX.setText("");
                edPoligonoY.setText("");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "É necessário preencher todos os campos.");
            }
    }//GEN-LAST:event_btnAdicionarArestaPoligonoActionPerformed

    private void edPoligonoXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPoligonoXKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edPoligonoXKeyTyped

    private void edPoligonoYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPoligonoYKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edPoligonoYKeyTyped

    private void edtPolilinhaXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPolilinhaXKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPolilinhaXKeyTyped

    private void edtPolilinhaYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPolilinhaYKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPolilinhaYKeyTyped

    private void edLinhaX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edLinhaX1KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edLinhaX1KeyTyped

    private void edLinhaY1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edLinhaY1KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edLinhaY1KeyTyped

    private void edLinhaY2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edLinhaY2KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edLinhaY2KeyTyped

    private void edLinhaX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edLinhaX2KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edLinhaX2KeyTyped

    private void edtPontoXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPontoXKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPontoXKeyTyped

    private void edtPontoYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPontoYKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPontoYKeyTyped

    private void edtPontoZKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPontoZKeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPontoZKeyTyped

    private void edtLinhaZ2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhaZ2KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhaZ2KeyTyped

    private void edtLinhaZ1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhaZ1KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhaZ1KeyTyped

    private void edtPolilinhaZ1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPolilinhaZ1KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPolilinhaZ1KeyTyped

    private void edtPolilinhaLinhaZ1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPolilinhaLinhaZ1KeyTyped
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_edtPolilinhaLinhaZ1KeyTyped

    private void painelCorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelCorMouseClicked
        TelaEscolheCor c = new TelaEscolheCor(this);
        c.setVisible(true);
    }//GEN-LAST:event_painelCorMouseClicked

    private void edtPontoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPontoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPontoXActionPerformed

   
    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InclusaoObjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabObjetos;
    private javax.swing.JButton btnAdicionarArestaPoligono;
    private javax.swing.JButton btnAdicionarArestaPolilinha;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField edLinhaX1;
    private javax.swing.JTextField edLinhaX2;
    private javax.swing.JTextField edLinhaY1;
    private javax.swing.JTextField edLinhaY2;
    private javax.swing.JTextField edPoligonoX;
    private javax.swing.JTextField edPoligonoY;
    private javax.swing.JTextField edtLinhaZ1;
    private javax.swing.JTextField edtLinhaZ2;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPolilinhaLinhaZ1;
    private javax.swing.JTextField edtPolilinhaX;
    private javax.swing.JTextField edtPolilinhaY;
    private javax.swing.JTextField edtPolilinhaZ1;
    private javax.swing.JTextField edtPontoX;
    private javax.swing.JTextField edtPontoY;
    private javax.swing.JTextField edtPontoZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblX1Linha;
    private javax.swing.JLabel lblX1Linha1;
    private javax.swing.JLabel lblX1Linha2;
    private javax.swing.JLabel lblX2Linha;
    private javax.swing.JLabel lblXPonto;
    private javax.swing.JLabel lblY1Linha;
    private javax.swing.JLabel lblY1Linha1;
    private javax.swing.JLabel lblY1Linha2;
    private javax.swing.JLabel lblY2Linha;
    private javax.swing.JLabel lblYPonto;
    private javax.swing.JLabel lblZ1Linha;
    private javax.swing.JLabel lblZ1Linha1;
    private javax.swing.JLabel lblZ1Linha2;
    private javax.swing.JLabel lblZ2Linha;
    private javax.swing.JLabel lblZPonto;
    private javax.swing.JList<String> listArestasPoligono;
    private javax.swing.JList<String> listArestasPolilinha;
    private javax.swing.JPanel painelCor;
    private javax.swing.JPanel pnlCoordFinal;
    private javax.swing.JPanel pnlCoordInicial;
    private javax.swing.JPanel pnlCoordPolilinha;
    private javax.swing.JPanel pnlCoordPolilinha1;
    private javax.swing.JPanel pnlCoordPontos;
    private javax.swing.JPanel tabLinha;
    private javax.swing.JPanel tabPoligono;
    private javax.swing.JPanel tabPolilinha;
    private javax.swing.JPanel tabPonto;
    // End of variables declaration//GEN-END:variables
}