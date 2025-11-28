package figuras;

public class Main extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
    private int figure;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lblAltura.setVisible(false);
        txtAltura.setVisible(false);
    }

    private void circuloActionPerformed(java.awt.event.ActionEvent evt) {
        Object circulo = null;
        if (evt.getSource().equals(circulo)) {
            figure = 0;
            lblAltura.setVisible(false);
            txtAltura.setVisible(false);
            lblRadio.setText("Radio");
        }
    }

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {
        Circulo circulo;
        circulo = new Circulo(Integer.parseInt(txtRadio.getText()));
        txtPerimetro.setText(Float.toString(circulo.Perimetro()));
        txtArea.setText(Float.toString(circulo.Area()));
        circulo.drawFigure(pnlCanvas.getGraphics());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCanvas = new javax.swing.JPanel();
        pnlParametros = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnDibujar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        pnlOperaciones = new javax.swing.JPanel();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFiguras = new javax.swing.JMenu();
        mniCirculo = new javax.swing.JMenuItem();
        mniCuadrado = new javax.swing.JMenuItem();
        mniTriangulo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCanvas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlCanvasLayout = new javax.swing.GroupLayout(pnlCanvas);
        pnlCanvas.setLayout(pnlCanvasLayout);
        pnlCanvasLayout.setHorizontalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        pnlCanvasLayout.setVerticalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        pnlParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros"));

        lblRadio.setText("Radio");

        lblAltura.setText("Altura");

        javax.swing.GroupLayout pnlParametrosLayout = new javax.swing.GroupLayout(pnlParametros);
        pnlParametros.setLayout(pnlParametrosLayout);
        pnlParametrosLayout.setHorizontalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlParametrosLayout.createSequentialGroup()
                        .addComponent(lblRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlParametrosLayout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlParametrosLayout.setVerticalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnDibujar.setText("Dibujar");

        btnBorrar.setText("Borrar");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnDibujar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(37, 37, 37))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDibujar)
                    .addComponent(btnBorrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        lblPerimetro.setText("Perimetro");

        lblArea.setText("Area");

        javax.swing.GroupLayout pnlOperacionesLayout = new javax.swing.GroupLayout(pnlOperaciones);
        pnlOperaciones.setLayout(pnlOperacionesLayout);
        pnlOperacionesLayout.setHorizontalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperacionesLayout.createSequentialGroup()
                        .addComponent(lblPerimetro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOperacionesLayout.createSequentialGroup()
                        .addComponent(lblArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOperacionesLayout.setVerticalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFiguras.setText("Figuras");

        mniCirculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCirculo.setText("Circulo");
        mnuFiguras.add(mniCirculo);

        mniCuadrado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCuadrado.setText("Cuadrado");
        mnuFiguras.add(mniCuadrado);

        mniTriangulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniTriangulo.setText("Triangulo");
        mnuFiguras.add(mniTriangulo);

        jMenuBar1.add(mnuFiguras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pnlOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnlParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(pnlCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDibujar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JMenuItem mniCirculo;
    private javax.swing.JMenuItem mniCuadrado;
    private javax.swing.JMenuItem mniTriangulo;
    private javax.swing.JMenu mnuFiguras;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCanvas;
    private javax.swing.JPanel pnlOperaciones;
    private javax.swing.JPanel pnlParametros;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
