package Trabalho;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Matrizes extends javax.swing.JFrame {

    JFrame Window;
    String caracteres = "0987654321";

    public Matrizes() {
        initComponents();
    }

    public Matrizes(JFrame mainWindow) {
        setIconeJanela();
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        txtResultado.setBackground(Color.WHITE);
        txtResultado.setEditable(false);
        txtResultadoEscalar.setBackground(Color.WHITE);
        txtResultadoEscalar.setEditable(false);
        txtResultadoMult.setBackground(Color.WHITE);
        txtResultadoMult.setEditable(false);
        setLocationRelativeTo(null);
        this.Window = mainWindow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabCalculo = new javax.swing.JTabbedPane();
        tabSoma = new javax.swing.JPanel();
        lblLinhasSoma = new javax.swing.JLabel();
        edtLinhasSoma = new javax.swing.JTextField();
        lblColunasSoma = new javax.swing.JLabel();
        edtColunasSoma = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lblResultadoSoma = new javax.swing.JLabel();
        btnLimparSoma = new javax.swing.JButton();
        tabMultiplicacao = new javax.swing.JPanel();
        lblLinhasAMult = new javax.swing.JLabel();
        edtLinhasAMult = new javax.swing.JTextField();
        edtColunasAMult = new javax.swing.JTextField();
        lblColunasAMult = new javax.swing.JLabel();
        btnMultiplicar = new javax.swing.JButton();
        lblResultadoSoma2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultadoMult = new javax.swing.JTextArea();
        lblLinhasBMult = new javax.swing.JLabel();
        lblColunasBMult = new javax.swing.JLabel();
        edtLinhasBMult = new javax.swing.JTextField();
        edtColunasBMult = new javax.swing.JTextField();
        btnLimparMult = new javax.swing.JButton();
        tabMultPorEscalar = new javax.swing.JPanel();
        lblLinhasEscalar = new javax.swing.JLabel();
        edtLinhasEscalar = new javax.swing.JTextField();
        edtColunasEscalar = new javax.swing.JTextField();
        lblColunasEscalar = new javax.swing.JLabel();
        btnEscalar = new javax.swing.JButton();
        lblResultadoEscalar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultadoEscalar = new javax.swing.JTextArea();
        lblEscalar = new javax.swing.JLabel();
        edtEscalar = new javax.swing.JTextField();
        btnLimparEscalar = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Matrizes");

        TabCalculo.setForeground(new java.awt.Color(51, 0, 153));
        TabCalculo.setFocusable(false);
        TabCalculo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TabCalculo.setPreferredSize(new java.awt.Dimension(450, 240));

        tabSoma.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblLinhasSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinhasSoma.setForeground(new java.awt.Color(51, 0, 153));
        lblLinhasSoma.setText("Número de linhas:");

        edtLinhasSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhasSomaKeyTyped(evt);
            }
        });

        lblColunasSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblColunasSoma.setForeground(new java.awt.Color(51, 0, 153));
        lblColunasSoma.setText("Número de colunas:");

        edtColunasSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtColunasSomaKeyTyped(evt);
            }
        });

        btnSomar.setForeground(new java.awt.Color(51, 0, 153));
        btnSomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/abaco.png"))); // NOI18N
        btnSomar.setText("Calcular");
        btnSomar.setPreferredSize(new java.awt.Dimension(83, 25));
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(51, 0, 153));
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        lblResultadoSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResultadoSoma.setForeground(new java.awt.Color(51, 0, 153));
        lblResultadoSoma.setText("Resultado");

        btnLimparSoma.setForeground(new java.awt.Color(51, 0, 153));
        btnLimparSoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borracha.png"))); // NOI18N
        btnLimparSoma.setText("Limpar");
        btnLimparSoma.setPreferredSize(new java.awt.Dimension(83, 25));
        btnLimparSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSomaLayout = new javax.swing.GroupLayout(tabSoma);
        tabSoma.setLayout(tabSomaLayout);
        tabSomaLayout.setHorizontalGroup(
            tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSomaLayout.createSequentialGroup()
                .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSomaLayout.createSequentialGroup()
                        .addGap(197, 211, Short.MAX_VALUE)
                        .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSomaLayout.createSequentialGroup()
                                .addComponent(lblLinhasSoma)
                                .addGap(18, 18, 18)
                                .addComponent(edtLinhasSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabSomaLayout.createSequentialGroup()
                                .addComponent(lblColunasSoma)
                                .addGap(18, 18, 18)
                                .addComponent(edtColunasSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tabSomaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabSomaLayout.createSequentialGroup()
                                .addComponent(lblResultadoSoma)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabSomaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimparSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        tabSomaLayout.setVerticalGroup(
            tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSomaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinhasSoma)
                    .addComponent(edtLinhasSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColunasSoma)
                    .addComponent(edtColunasSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabSomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblResultadoSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TabCalculo.addTab("Soma", tabSoma);

        lblLinhasAMult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinhasAMult.setForeground(new java.awt.Color(51, 0, 153));
        lblLinhasAMult.setText("Número de linhas A:");

        edtLinhasAMult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhasAMultKeyTyped(evt);
            }
        });

        edtColunasAMult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtColunasAMultKeyTyped(evt);
            }
        });

        lblColunasAMult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblColunasAMult.setForeground(new java.awt.Color(51, 0, 153));
        lblColunasAMult.setText("Número de colunas A:");

        btnMultiplicar.setForeground(new java.awt.Color(51, 0, 153));
        btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/abaco.png"))); // NOI18N
        btnMultiplicar.setText("Calcular");
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(83, 25));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        lblResultadoSoma2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResultadoSoma2.setForeground(new java.awt.Color(51, 0, 153));
        lblResultadoSoma2.setText("Resultado");

        txtResultadoMult.setColumns(20);
        txtResultadoMult.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtResultadoMult.setForeground(new java.awt.Color(51, 0, 153));
        txtResultadoMult.setRows(5);
        jScrollPane3.setViewportView(txtResultadoMult);

        lblLinhasBMult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinhasBMult.setForeground(new java.awt.Color(51, 0, 153));
        lblLinhasBMult.setText("Número de linhas B:");

        lblColunasBMult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblColunasBMult.setForeground(new java.awt.Color(51, 0, 153));
        lblColunasBMult.setText("Número de colunas B:");

        edtLinhasBMult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhasBMultKeyTyped(evt);
            }
        });

        edtColunasBMult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtColunasBMultKeyTyped(evt);
            }
        });

        btnLimparMult.setForeground(new java.awt.Color(51, 0, 153));
        btnLimparMult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borracha.png"))); // NOI18N
        btnLimparMult.setText("Limpar");
        btnLimparMult.setPreferredSize(new java.awt.Dimension(83, 25));
        btnLimparMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparMultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMultiplicacaoLayout = new javax.swing.GroupLayout(tabMultiplicacao);
        tabMultiplicacao.setLayout(tabMultiplicacaoLayout);
        tabMultiplicacaoLayout.setHorizontalGroup(
            tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblLinhasAMult)
                                .addGap(5, 5, 5)
                                .addComponent(edtLinhasAMult, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblColunasAMult)
                                .addGap(5, 5, 5)
                                .addComponent(edtColunasAMult, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblLinhasBMult)
                                .addGap(5, 5, 5)
                                .addComponent(edtLinhasBMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addComponent(lblColunasBMult)
                                .addGap(5, 5, 5)
                                .addComponent(edtColunasBMult, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimparMult, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultadoSoma2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabMultiplicacaoLayout.setVerticalGroup(
            tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtLinhasAMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblLinhasAMult)))
                        .addGap(28, 28, 28)
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtColunasAMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblColunasAMult))))
                    .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtLinhasBMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblLinhasBMult)))
                        .addGap(28, 28, 28)
                        .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtColunasBMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabMultiplicacaoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblColunasBMult)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabMultiplicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparMult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblResultadoSoma2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TabCalculo.addTab("Multiplicação", tabMultiplicacao);

        lblLinhasEscalar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinhasEscalar.setForeground(new java.awt.Color(51, 0, 153));
        lblLinhasEscalar.setText("Número de linhas:");

        edtLinhasEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtLinhasEscalarKeyTyped(evt);
            }
        });

        edtColunasEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtColunasEscalarKeyTyped(evt);
            }
        });

        lblColunasEscalar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblColunasEscalar.setForeground(new java.awt.Color(51, 0, 153));
        lblColunasEscalar.setText("Número de colunas:");

        btnEscalar.setForeground(new java.awt.Color(51, 0, 153));
        btnEscalar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/abaco.png"))); // NOI18N
        btnEscalar.setText("Calcular");
        btnEscalar.setPreferredSize(new java.awt.Dimension(83, 25));
        btnEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalarActionPerformed(evt);
            }
        });

        lblResultadoEscalar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResultadoEscalar.setForeground(new java.awt.Color(51, 0, 153));
        lblResultadoEscalar.setText("Resultado");

        txtResultadoEscalar.setColumns(20);
        txtResultadoEscalar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtResultadoEscalar.setForeground(new java.awt.Color(51, 0, 153));
        txtResultadoEscalar.setRows(5);
        jScrollPane2.setViewportView(txtResultadoEscalar);

        lblEscalar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEscalar.setForeground(new java.awt.Color(51, 0, 153));
        lblEscalar.setText("Escalar:");

        edtEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEscalarKeyTyped(evt);
            }
        });

        btnLimparEscalar.setForeground(new java.awt.Color(51, 0, 153));
        btnLimparEscalar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/borracha.png"))); // NOI18N
        btnLimparEscalar.setText("Limpar");
        btnLimparEscalar.setPreferredSize(new java.awt.Dimension(83, 25));
        btnLimparEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEscalarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabMultPorEscalarLayout = new javax.swing.GroupLayout(tabMultPorEscalar);
        tabMultPorEscalar.setLayout(tabMultPorEscalarLayout);
        tabMultPorEscalarLayout.setHorizontalGroup(
            tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultPorEscalarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabMultPorEscalarLayout.createSequentialGroup()
                        .addComponent(lblResultadoEscalar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMultPorEscalarLayout.createSequentialGroup()
                        .addComponent(lblEscalar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMultPorEscalarLayout.createSequentialGroup()
                                .addComponent(lblLinhasEscalar)
                                .addGap(18, 18, 18)
                                .addComponent(edtLinhasEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabMultPorEscalarLayout.createSequentialGroup()
                                .addComponent(lblColunasEscalar)
                                .addGap(18, 18, 18)
                                .addComponent(edtColunasEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMultPorEscalarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimparEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabMultPorEscalarLayout.setVerticalGroup(
            tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultPorEscalarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinhasEscalar)
                    .addComponent(edtLinhasEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscalar)
                    .addComponent(edtEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColunasEscalar)
                    .addComponent(edtColunasEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabMultPorEscalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblResultadoEscalar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabCalculo.addTab("Multiplicação por Escalar", tabMultPorEscalar);

        btnMenuPrincipal.setForeground(new java.awt.Color(51, 0, 153));
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/homepage.png"))); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setIconeJanela() {
        URL url = this.getClass().getResource("/Img/IconeJanela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    private String getStringMatriz(int linhas, int colunas, int[][] matriz) {
        String Msg = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                Msg = Msg + Integer.toString(matriz[i][j]) + "\t";
            }
            Msg = Msg + "\n";
        }
        return Msg;
    }
    
    private int[][] getMatriz (int linhas, int colunas){
        Random random = new Random();
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
        return matriz;
    }

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        Window.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        int linhas = Integer.parseInt(edtLinhasSoma.getText());
        int colunas = Integer.parseInt(edtColunasSoma.getText());
        int matriz1[][];
        int matriz2[][];
        int matrizFinal[][] = new int[linhas][colunas];
        String MsgFinal;
        //Matrizes que serão calculadas        
        matriz1 = getMatriz(linhas, colunas);
        matriz2 = getMatriz(linhas, colunas);
        //Primeira Matriz
        MsgFinal = "Primeira Matriz\n\n";
        MsgFinal = MsgFinal + getStringMatriz(linhas, colunas, matriz1);
        //Segunda Matriz    
        MsgFinal = MsgFinal + "\n\nSegunda Matriz\n\n";
        MsgFinal = MsgFinal + getStringMatriz(linhas, colunas, matriz2);
        //Somar ambas
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizFinal[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        //Mostrar o resultado
        MsgFinal = MsgFinal + "\n\nMatriz Final\n\n";
        MsgFinal = MsgFinal + getStringMatriz(linhas, colunas, matrizFinal);
        txtResultado.setText(MsgFinal);
    }//GEN-LAST:event_btnSomarActionPerformed

    private void edtLinhasSomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhasSomaKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhasSomaKeyTyped

    private void edtColunasSomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtColunasSomaKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtColunasSomaKeyTyped

    private void edtLinhasEscalarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhasEscalarKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhasEscalarKeyTyped

    private void edtColunasEscalarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtColunasEscalarKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtColunasEscalarKeyTyped

    private void btnEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalarActionPerformed
        int linhas = Integer.parseInt(edtLinhasEscalar.getText());
        int colunas = Integer.parseInt(edtColunasEscalar.getText());
        int escalar = Integer.parseInt(edtEscalar.getText());
        int matriz1[][];
        int matrizFinal[][] = new int[linhas][colunas];
        String MsgFinal;
        //Matriz de calculo
        matriz1 = getMatriz(linhas, colunas);
        //Escalar
        MsgFinal = "Escalar: " + escalar;
        //Primeira matriz
        MsgFinal = MsgFinal + "\n\nMatriz\n\n";
        MsgFinal = MsgFinal + getStringMatriz(linhas, colunas, matriz1);
        //Multiplicar pelo escalar
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizFinal[i][j] = matriz1[i][j] * escalar;
            }
        }
        //Mostrar o resultado
        MsgFinal = MsgFinal + "\nMatriz Final\n\n";
        MsgFinal = MsgFinal + getStringMatriz(linhas, colunas, matrizFinal);
        txtResultadoEscalar.setText(MsgFinal);
    }//GEN-LAST:event_btnEscalarActionPerformed

    private void edtLinhasAMultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhasAMultKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhasAMultKeyTyped

    private void edtColunasAMultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtColunasAMultKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtColunasAMultKeyTyped

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        int linhasMatriz1 = Integer.parseInt(edtLinhasAMult.getText());
        int colunasMatriz1 = Integer.parseInt(edtColunasAMult.getText());
        int linhasMatriz2 = Integer.parseInt(edtLinhasBMult.getText());
        int colunasMatriz2 = Integer.parseInt(edtColunasBMult.getText());
        String MsgFinal;

        if (colunasMatriz1 == linhasMatriz2) {
            int matriz1[][];
            int matriz2[][];
            int matrizFinal[][] = new int[linhasMatriz1][colunasMatriz2];
            //Matriz que serão calculadas
            matriz1 = getMatriz(linhasMatriz1, colunasMatriz1);
            matriz2 = getMatriz(linhasMatriz2, colunasMatriz2);           
            //Primeira matriz
            MsgFinal = "Primeira Matriz\n\n";
            MsgFinal = MsgFinal + getStringMatriz(linhasMatriz1, colunasMatriz1, matriz1);            
            //Segunda Matriz
            MsgFinal = MsgFinal + "\n\nSegunda Matriz\n\n";
            MsgFinal = MsgFinal + getStringMatriz(linhasMatriz2, colunasMatriz2, matriz2);
            //Multiplicar as matrizes
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matrizFinal[i][j] += (matriz1[i][k] * matriz2[k][j]);
                    }
                }
            }
            //Matriz Final
            MsgFinal = MsgFinal + "\nResultado\n\n";
            MsgFinal = MsgFinal + getStringMatriz(linhasMatriz1, colunasMatriz2, matrizFinal);
            txtResultadoMult.setText(MsgFinal);
        } else {
            JOptionPane.showMessageDialog(this, "O número de COLUNAS da PRIMEIRA MATRIZ deve ser igual ao número de LINHAS da SEGUNDA MATRIZ.");
        }        
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void edtLinhasBMultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLinhasBMultKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtLinhasBMultKeyTyped

    private void edtColunasBMultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtColunasBMultKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtColunasBMultKeyTyped

    private void edtEscalarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEscalarKeyTyped
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_edtEscalarKeyTyped

    private void btnLimparEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEscalarActionPerformed
        edtEscalar.setText("");
        edtLinhasEscalar.setText("");
        edtColunasEscalar.setText("");
        txtResultadoEscalar.setText("");
        edtEscalar.requestFocus();
    }//GEN-LAST:event_btnLimparEscalarActionPerformed

    private void btnLimparMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparMultActionPerformed
        edtLinhasAMult.setText("");
        edtColunasAMult.setText("");
        edtLinhasBMult.setText("");
        edtColunasBMult.setText("");
        txtResultadoMult.setText("");
        edtLinhasAMult.requestFocus();
    }//GEN-LAST:event_btnLimparMultActionPerformed

    private void btnLimparSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSomaActionPerformed
        edtLinhasSoma.setText("");
        edtColunasSoma.setText("");
        txtResultado.setText("");
        edtLinhasSoma.requestFocus();
    }//GEN-LAST:event_btnLimparSomaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrizes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabCalculo;
    private javax.swing.JButton btnEscalar;
    private javax.swing.JButton btnLimparEscalar;
    private javax.swing.JButton btnLimparMult;
    private javax.swing.JButton btnLimparSoma;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JTextField edtColunasAMult;
    private javax.swing.JTextField edtColunasBMult;
    private javax.swing.JTextField edtColunasEscalar;
    private javax.swing.JTextField edtColunasSoma;
    private javax.swing.JTextField edtEscalar;
    private javax.swing.JTextField edtLinhasAMult;
    private javax.swing.JTextField edtLinhasBMult;
    private javax.swing.JTextField edtLinhasEscalar;
    private javax.swing.JTextField edtLinhasSoma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblColunasAMult;
    private javax.swing.JLabel lblColunasBMult;
    private javax.swing.JLabel lblColunasEscalar;
    private javax.swing.JLabel lblColunasSoma;
    private javax.swing.JLabel lblEscalar;
    private javax.swing.JLabel lblLinhasAMult;
    private javax.swing.JLabel lblLinhasBMult;
    private javax.swing.JLabel lblLinhasEscalar;
    private javax.swing.JLabel lblLinhasSoma;
    private javax.swing.JLabel lblResultadoEscalar;
    private javax.swing.JLabel lblResultadoSoma;
    private javax.swing.JLabel lblResultadoSoma2;
    private javax.swing.JPanel tabMultPorEscalar;
    private javax.swing.JPanel tabMultiplicacao;
    private javax.swing.JPanel tabSoma;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtResultadoEscalar;
    private javax.swing.JTextArea txtResultadoMult;
    // End of variables declaration//GEN-END:variables
}
