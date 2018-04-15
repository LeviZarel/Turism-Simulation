/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.DatosVariables;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

/**
 *
 * @author Ariel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Vista for me
     */
    private DatosVariables datos;
    private VentanaAjustes ajustes;
    private VentanaConfiguraciones configuraciones;
    //private int velocidad=20;
    
    public Main() {
        datos= new DatosVariables();
        initComponents();
        ajustes=new VentanaAjustes(datos);
        configuraciones=new VentanaConfiguraciones(datos);
    }
    public DatosVariables getDatosVariables(){return datos;}
    public int getVelocidad(){return slider.getValue();}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelEstado = new javax.swing.JPanel();
        slider = new javax.swing.JSlider();
        lblMenos = new javax.swing.JLabel();
        lblMas = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        panelDibujo = new PanelDibujo(this);
        toolBar = new javax.swing.JToolBar();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        separador0 = new javax.swing.JToolBar.Separator();
        btnAjustes = new javax.swing.JButton();
        btnConfiguraciones = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        tgBtnPlay = new javax.swing.JToggleButton();
        btnRestar = new javax.swing.JButton();
        separador1 = new javax.swing.JToolBar.Separator();
        btnGraf1 = new javax.swing.JButton();
        btnGraf2 = new javax.swing.JButton();
        btnGraf3 = new javax.swing.JButton();
        separador2 = new javax.swing.JToolBar.Separator();
        btnInfo = new javax.swing.JButton();
        btnQuienes = new javax.swing.JButton();
        panelExtra = new javax.swing.JPanel();
        setIconImage(new ImageIcon("src/Images/fondo/icono/iconN.png").getImage());
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemPrint = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuDatos = new javax.swing.JMenu();
        itemAjustes = new javax.swing.JMenuItem();
        itemConfiguraciones = new javax.swing.JMenuItem();
        itemHora = new javax.swing.JMenuItem();
        itemRestablecer = new javax.swing.JMenuItem();
        menuSimu = new javax.swing.JMenu();
        itemIniciar = new javax.swing.JMenuItem();
        itemPausar = new javax.swing.JMenuItem();
        itemReanudar = new javax.swing.JMenuItem();
        itemDetener = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        itemGeneral = new javax.swing.JMenuItem();
        itemGrafBarras = new javax.swing.JMenuItem();
        itemGrafTorta = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        itemUsar = new javax.swing.JMenuItem();
        itemAcerca = new javax.swing.JMenuItem();
        itemManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de Turismo SNOW TRAVEL v1.0");

        panelEstado.setBackground(new java.awt.Color(204, 255, 153));

        slider.setMajorTickSpacing(5);
        slider.setMinimum(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setToolTipText("");
        slider.setValue(20);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelDibujo.setVelocidad(slider.getValue());
            }
        });

        lblMenos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblMenos.setText("-");

        lblMas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblMas.setText("+");

        lblVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVelocidad.setText("Velocidad de Animacion");

        consola.setColumns(20);
        consola.setRows(5);
        jScrollPane1.setViewportView(consola);

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEstadoLayout.createSequentialGroup()
                        .addComponent(lblMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenos)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelEstadoLayout.createSequentialGroup()
                        .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVelocidad)))
                .addContainerGap())
        );
        
        panelDibujo.setMinimumSize(new java.awt.Dimension(1000, 555));

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        toolBar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        toolBar.setRollover(true);
        toolBar.setToolTipText("");

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/abrir.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        //toolBar.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        //toolBar.add(btnGuardar);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/imprimir.png"))); // NOI18N
        btnPrint.setToolTipText("Imprimir");
        btnPrint.setFocusable(false);
        btnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        toolBar.add(btnPrint);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/salir.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        toolBar.add(btnSalir);
        toolBar.add(separador0);

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/ajustes.png"))); // NOI18N
        btnAjustes.setToolTipText("Ajustes");
        btnAjustes.setFocusable(false);
        btnAjustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAjustes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        toolBar.add(btnAjustes);

        btnConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/configurar.png"))); // NOI18N
        btnConfiguraciones.setToolTipText("Configuraciones");
        btnConfiguraciones.setFocusable(false);
        btnConfiguraciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguraciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionesActionPerformed(evt);
            }
        });
        toolBar.add(btnConfiguraciones);
        toolBar.add(jSeparator1);

        tgBtnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/play.png"))); // NOI18N
        tgBtnPlay.setToolTipText("Play");
        tgBtnPlay.setFocusable(false);
        tgBtnPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgBtnPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgBtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgBtnPlayActionPerformed(evt);
            }
        });
        toolBar.add(tgBtnPlay);

        btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/detener.png"))); // NOI18N
        btnRestar.setToolTipText("Detener");
        btnRestar.setFocusable(false);
        btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDetenerActionPerformed(evt);
            }
        });
        toolBar.add(btnRestar);
        toolBar.add(separador1);

        btnGraf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/grafico.png"))); // NOI18N
        btnGraf1.setToolTipText("Grafico Lineas");
        btnGraf1.setFocusable(false);
        btnGraf1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGraf1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGraf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf1ActionPerformed(evt);
            }
        });
        toolBar.add(btnGraf1);

        btnGraf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/barras.png"))); // NOI18N
        btnGraf2.setToolTipText("Grafico Barras");
        btnGraf2.setFocusable(false);
        btnGraf2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGraf2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGraf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf2ActionPerformed(evt);
            }
        });
        toolBar.add(btnGraf2);

        btnGraf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/torta.png"))); // NOI18N
        btnGraf3.setToolTipText("Grafico Torta");
        btnGraf3.setFocusable(false);
        btnGraf3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGraf3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGraf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf3ActionPerformed(evt);
            }
        });
        toolBar.add(btnGraf3);
        toolBar.add(separador2);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/quienes.png"))); // NOI18N
        btnInfo.setToolTipText("Como Usar");
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        toolBar.add(btnInfo);

        btnQuienes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/docente.png"))); // NOI18N
        btnQuienes.setToolTipText("Acerca de..");
        btnQuienes.setFocusable(false);
        btnQuienes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuienes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuienes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuienesActionPerformed(evt);
            }
        });
        toolBar.add(btnQuienes);

        panelExtra.setBackground(new java.awt.Color(204, 255, 255));
        panelExtra.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout panelExtraLayout = new javax.swing.GroupLayout(panelExtra);
        panelExtra.setLayout(panelExtraLayout);
        panelExtraLayout.setHorizontalGroup(
            panelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelExtraLayout.setVerticalGroup(
            panelExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuFile.setText("Archivo");

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/abrir20.png"))); // NOI18N
        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        //menuFile.add(itemAbrir);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/guardar20.png"))); // NOI18N
        itemGuardar.setText("Guardar");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        //menuFile.add(itemGuardar);

        itemPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        itemPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/imprimir20.png"))); // NOI18N
        itemPrint.setText("Imprimir Modelo");
        itemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        menuFile.add(itemPrint);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/salir20.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuFile.add(itemSalir);

        menuBar.add(menuFile);

        menuEdit.setText("Edición");

        menuDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/editar20.png"))); // NOI18N
        menuDatos.setText("Datos");

        itemAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/ajustes20.png"))); // NOI18N
        itemAjustes.setText("Ajustar datos");
        itemAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        menuDatos.add(itemAjustes);

        itemConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/configurar20.png"))); // NOI18N
        itemConfiguraciones.setText("Configurar datos");
        itemConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionesActionPerformed(evt);
            }
        });
        menuDatos.add(itemConfiguraciones);

        menuEdit.add(menuDatos);

        itemHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/reloj20.png"))); // NOI18N
        itemHora.setText("Cambiar hora");
        itemHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHoraActionPerformed(evt);
            }
        });
        //menuEdit.add(itemHora);

        itemRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/reset20.png"))); // NOI18N
        itemRestablecer.setText("Restablecer todo");
        itemRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRestablecerActionPerformed(evt);
            }
        });
        //menuEdit.add(itemRestablecer);

        menuBar.add(menuEdit);

        menuSimu.setText("Simulación");

        itemIniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/play20.png"))); // NOI18N
        itemIniciar.setText("Iniciar");
        itemIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgBtnPlay.setSelected(true);
                tgBtnPlayActionPerformed(evt);
            }
        });
        menuSimu.add(itemIniciar);

        itemPausar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/pause20.png"))); // NOI18N
        itemPausar.setText("Pausar");
        itemPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgBtnPlay.setSelected(false);
                tgBtnPlayActionPerformed(evt);
            }
        });
        menuSimu.add(itemPausar);

        itemReanudar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itemReanudar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/reanudar20.png"))); // NOI18N
        itemReanudar.setText("Reanudar");
        itemReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReanudarActionPerformed(evt);
            }
        });
        menuSimu.add(itemReanudar);

        itemDetener.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itemDetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/detener20.png"))); // NOI18N
        itemDetener.setText("Detener");
        itemDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDetenerActionPerformed(evt);
            }
        });
        menuSimu.add(itemDetener);

        menuBar.add(menuSimu);

        menuReport.setText("Reportes");

        itemGeneral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        itemGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/grafico20.png"))); // NOI18N
        itemGeneral.setText("General");
        itemGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf1ActionPerformed(evt);
            }
        });
        menuReport.add(itemGeneral);

        itemGrafBarras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        itemGrafBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/barras20.png"))); // NOI18N
        itemGrafBarras.setText("Gráfico de Barras");
        itemGrafBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf2ActionPerformed(evt);
            }
        });
        menuReport.add(itemGrafBarras);

        itemGrafTorta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        itemGrafTorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/torta20.png"))); // NOI18N
        itemGrafTorta.setText("Gráfico de Torta");
        itemGrafTorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraf3ActionPerformed(evt);
            }
        });
        menuReport.add(itemGrafTorta);

        menuBar.add(menuReport);

        menuHelp.setText("Ayuda");

        itemUsar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
        itemUsar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/quienes20.png"))); // NOI18N
        itemUsar.setText("Como usar");
        itemUsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        menuHelp.add(itemUsar);

        itemAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.ALT_MASK));
        itemAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/docente20.png"))); // NOI18N
        itemAcerca.setText("Acerca de..");
        itemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuienesActionPerformed(evt);
            }
        });
        menuHelp.add(itemAcerca);

        itemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK));
        itemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toolBar/20px/manual20.png"))); // NOI18N
        itemManual.setText("Manual de usuario");
        itemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManualActionPerformed(evt);
            }
        });
        menuHelp.add(itemManual);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void itemHoraActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        /*String favoritePizza = (String) JOptionPane.showInputDialog(this, 
        "What is your favorite pizza?",
        "Favorite Pizza",
        JOptionPane.QUESTION_MESSAGE, 
        null,);*/
        
    }                                        

    private void itemRestablecerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void tgBtnPlayActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(tgBtnPlay.isSelected()){
            panelDibujo.iniciar();
            tgBtnPlay.setIcon(new ImageIcon(getClass().getResource("/Images/toolBar/pause.png")));
            tgBtnPlay.setToolTipText("Pause");
        }else{
            panelDibujo.parar();
            tgBtnPlay.setIcon(new ImageIcon(getClass().getResource("/Images/toolBar/play.png")));
            tgBtnPlay.setToolTipText("Play");
        }
    }                                         

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        salir();
    }                                        

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        configuraciones.setLocation(this.getX()+55,this.getY()+268);
        configuraciones.setVisible(true);
    }                                                  

    /*private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        panelDibujo.restart();
    }*/                                         

    private void btnGraf1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        General ge=new General(panelDibujo);
        ge.setLocationRelativeTo(null);
        ge.setVisible(true);
    }                                        

    private void btnGraf2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        VentanaReporte v=new VentanaReporte(panelDibujo);
        v.setVisible(true);
    }                                        

    private void btnGraf3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        VentanaReporte v2=new VentanaReporte(panelDibujo);
        v2.setVisible(true);
    }                                        

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "1. Dirijase al boton de ajustes y elija los valores con los que"
                + "\nse realizara la simulacion.\n2. Presione el boton play y espere a que genere resultados.\n"
                + "3. El sistema ya cuenta con valores por defecto. por si desea ovbiar el paso 1.", "Informacion uso.", JOptionPane.INFORMATION_MESSAGE);
    }                                       

    private void btnQuienesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        MyIconPersonalizado icon = new MyIconPersonalizado(85,185,"/Images/fondo/logos.png");
        JOptionPane.showMessageDialog(null, "FACULTAD DE CIENCIAS Y TECNOLOGIA\nUNIVERSIDAD MAYOR DE SAN SIMON"
        + "\nCochabamba - Bolivia"
        + "\n\nIntegrantes:     Bustamante Mejia Marcial"
        + "\n                          Galvez Ponce Ariel"
        + "\n                          Poca Huanca Diego"
        + "\n                          Soria Salazar Marilu\n"
        + "\nCarrera:           Ingenieria de Sistemas\n"
        + "\nMateria:           Taller de Simulacion\n"
        + "\nDocente:          Lic. Henry Villarroel Tapia Henrry Frank\n"
        + "\nGestión:           II - 2015\n", "Acerca de nosotros", JOptionPane.DEFAULT_OPTION, icon);
    }                                          

    int cont=0;
    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        ajustes.setLocation(this.getX()+55,this.getY()+225);
        ajustes.setVisible(true);
    }                                          

    private void itemReanudarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        panelDibujo.iniciar();
    }                                            

    private void itemDetenerActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        itemIniciar.setEnabled(false);
        itemPausar.setEnabled(false);
        itemReanudar.setEnabled(false);
        tgBtnPlay.setEnabled(false);
        panelDibujo.detener();
    }                                           

    private void itemManualActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            File dir= new File("src/Manual.pdf");
            Desktop.getDesktop().open(dir);
        } catch (IOException ex) {}
    }                                          

    public void salir(){
        int rpta = JOptionPane.showConfirmDialog(null, "¿Desea salir de la Aplicación?", "Dialogo de confirmación", 0);
        if (rpta == 0) 
            System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {//RavenGraphiteGlassSkin este es negro
            org.jvnet.substance.SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin");//MistAquaSkin GreenMagicSkin NebulaSkin
            Main m=new Main();m.setLocationRelativeTo(null);m.setVisible(true);
        }catch (Exception e) {}
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnConfiguraciones;
    private javax.swing.JButton btnGraf1;
    private javax.swing.JButton btnGraf2;
    private javax.swing.JButton btnGraf3;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnQuienes;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextArea consola;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAcerca;
    private javax.swing.JMenuItem itemAjustes;
    private javax.swing.JMenuItem itemConfiguraciones;
    private javax.swing.JMenuItem itemDetener;
    private javax.swing.JMenuItem itemGeneral;
    private javax.swing.JMenuItem itemGrafBarras;
    private javax.swing.JMenuItem itemGrafTorta;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemHora;
    private javax.swing.JMenuItem itemIniciar;
    private javax.swing.JMenuItem itemManual;
    private javax.swing.JMenuItem itemPausar;
    private javax.swing.JMenuItem itemPrint;
    private javax.swing.JMenuItem itemReanudar;
    private javax.swing.JMenuItem itemRestablecer;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemUsar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JLabel lblMas;
    private javax.swing.JLabel lblMenos;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuDatos;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSimu;
    private PanelDibujo panelDibujo;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelExtra;
    private javax.swing.JToolBar.Separator separador0;
    private javax.swing.JToolBar.Separator separador1;
    private javax.swing.JToolBar.Separator separador2;
    private javax.swing.JSlider slider;
    private javax.swing.JToggleButton tgBtnPlay;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration                   
}
