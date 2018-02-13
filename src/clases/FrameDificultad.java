package clases;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrameDificultad extends javax.swing.JFrame {
    static int filas, columnas, minas;

    public FrameDificultad() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../images/mine.png")).getImage());
        this.setTitle("Buscaminas  " + "  ||    Bienvenido " + FrameIngreso.nombre);
        this.setResizable(false);
        this.setSize(530, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Como siempre va a empezar seleccionado el nivel Fácil, seteamos desde el principio que no se puedan modificar
        textFieldFilas.setEditable(false);
        textFieldColumnas.setEditable(false);
        textFieldMinas.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxDificultad = new javax.swing.JComboBox<>();
        textFieldFilas = new javax.swing.JTextField();
        textFieldColumnas = new javax.swing.JTextField();
        textFieldMinas = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();
        textFieldCasillas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(460, 215));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SeleccioneDificultad.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        comboBoxDificultad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboBoxDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Media", "Difícil", "Personalizada" }));
        comboBoxDificultad.setBorder(null);
        comboBoxDificultad.setFocusable(false);
        comboBoxDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDificultadActionPerformed(evt);
            }
        });

        textFieldFilas.setBackground(new java.awt.Color(64, 64, 64));
        textFieldFilas.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        textFieldFilas.setForeground(new java.awt.Color(255, 255, 255));
        textFieldFilas.setText("10");
        textFieldFilas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        textFieldFilas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                textFieldFilasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textFieldFilasMouseMoved(evt);
            }
        });
        textFieldFilas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textFieldFilasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textFieldFilasMouseReleased(evt);
            }
        });
        textFieldFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFilasActionPerformed(evt);
            }
        });
        textFieldFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldFilasKeyTyped(evt);
            }
        });

        textFieldColumnas.setBackground(new java.awt.Color(64, 64, 64));
        textFieldColumnas.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        textFieldColumnas.setForeground(new java.awt.Color(255, 255, 255));
        textFieldColumnas.setText("10");
        textFieldColumnas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COLUMNAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        textFieldColumnas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textFieldColumnasMouseReleased(evt);
            }
        });
        textFieldColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldColumnasActionPerformed(evt);
            }
        });
        textFieldColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldColumnasKeyTyped(evt);
            }
        });

        textFieldMinas.setBackground(new java.awt.Color(64, 64, 64));
        textFieldMinas.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        textFieldMinas.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMinas.setText("10");
        textFieldMinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MINAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        textFieldMinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldMinasMouseClicked(evt);
            }
        });
        textFieldMinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldMinasKeyTyped(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(102, 102, 102));
        botonContinuar.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Cargar");
        botonContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonContinuar.setFocusPainted(false);
        botonContinuar.setPreferredSize(new java.awt.Dimension(58, 19));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        textFieldCasillas.setEditable(false);
        textFieldCasillas.setBackground(new java.awt.Color(64, 64, 64));
        textFieldCasillas.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        textFieldCasillas.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCasillas.setText("100");
        textFieldCasillas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CASILLAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        textFieldCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCasillasActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Copyright.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(comboBoxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldFilas, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(textFieldMinas))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldColumnas)
                    .addComponent(textFieldCasillas))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCasillas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCasillasActionPerformed

    }//GEN-LAST:event_textFieldCasillasActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // Cuando se pisa el boton Continuar pasará esto

        // Se crea un objeto de FrameCarga
        FrameCarga carga = new FrameCarga();

        // Se crea un nuevo hilo para que el FrameCarga funcione correctamente
        //------------------------------------------------------------------------------------------------------------------
        Runnable miRunnable = new Runnable(){
            public void run(){

                try
                {

                    // Validaciones para que los valores de filas, columnas y minas sean verídicos
                    if( textFieldFilas.getText().trim().equals("") || textFieldColumnas.getText().trim().equals("") || textFieldMinas.getText().trim().equals("") ){
                        JOptionPane.showMessageDialog(null, "No puede haber ningún espacio vacío");
                    }else if( textFieldFilas.getText().trim().equals("0") || textFieldColumnas.getText().trim().equals("0") || textFieldMinas.getText().trim().equals("0") ){
                        JOptionPane.showMessageDialog(null, "Ningún valor puede ser cero");
                    }else{
                        filas = Integer.parseInt(textFieldFilas.getText());
                        columnas = Integer.parseInt(textFieldColumnas.getText());
                        minas = Integer.parseInt(textFieldMinas.getText());

                        if(filas != columnas){
                            JOptionPane.showMessageDialog(null, "El número de filas tiene que ser igual al de columnas");
                        }else if(minas >= (filas*columnas) ){
                            JOptionPane.showMessageDialog(null, "El número minas tiene que ser menor al número de casillas");
                        }else {
                            // Si no hay ningun error carga el juego
                            dispose();
                            carga.setVisible(true);
                            for (int i = 0; i <= 100; i++) {
                                // Tiempo que tardará la carga
                                Thread.sleep(10);
                                carga.loadingText.setText(Integer.toString(i) + "%");
                                carga.loadingBar.setValue(i);

                                if(i==100){
                                    Thread.sleep(1300);
                                }
                            }
                            carga.dispose();
                            
                            FrameJuego frameJuego = new FrameJuego();
                            frameJuego.setVisible(true);
                            frameJuego.setTitle("Buscaminas");
                                                        
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();}
            }
        };
        Thread hilo = new Thread (miRunnable);
        hilo.start();
        //------------------------------------------------------------------------------------------------------------------

    }//GEN-LAST:event_botonContinuarActionPerformed

    private void textFieldMinasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldMinasKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar) == false){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textFieldMinasKeyTyped

    private void textFieldMinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldMinasMouseClicked
        if(textFieldFilas.getText().equals("") == false && textFieldColumnas.getText().equals("") == false){
            int filass = Integer.parseInt(textFieldFilas.getText());
            int columnass = Integer.parseInt(textFieldColumnas.getText());
            String casillas = String.valueOf(filass*columnass);
            textFieldCasillas.setText(casillas);
        }
    }//GEN-LAST:event_textFieldMinasMouseClicked

    private void textFieldColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldColumnasKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar) == false){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textFieldColumnasKeyTyped

    private void textFieldColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldColumnasActionPerformed

    }//GEN-LAST:event_textFieldColumnasActionPerformed

    private void textFieldColumnasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldColumnasMouseReleased
        if(textFieldFilas.getText().equals("") == false && textFieldColumnas.getText().equals("") == false){
            int filass = Integer.parseInt(textFieldFilas.getText());
            int columnass = Integer.parseInt(textFieldColumnas.getText());
            String casillas = String.valueOf(filass*columnass);
            textFieldCasillas.setText(casillas);
        }
    }//GEN-LAST:event_textFieldColumnasMouseReleased

    private void textFieldFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldFilasKeyTyped
        // Este método y los 3 de abajo validan que en los textField de filas, columnas y minas no se ingresen letras
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar) == false){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textFieldFilasKeyTyped

    private void textFieldFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFilasActionPerformed

    }//GEN-LAST:event_textFieldFilasActionPerformed

    private void textFieldFilasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldFilasMouseReleased
        if(textFieldFilas.getText().equals("") == false && textFieldColumnas.getText().equals("") == false){
            int filass = Integer.parseInt(textFieldFilas.getText());
            int columnass = Integer.parseInt(textFieldColumnas.getText());
            String casillas = String.valueOf(filass*columnass);
            textFieldCasillas.setText(casillas);
        }
    }//GEN-LAST:event_textFieldFilasMouseReleased

    private void textFieldFilasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldFilasMouseExited

    }//GEN-LAST:event_textFieldFilasMouseExited

    private void textFieldFilasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldFilasMouseMoved

    }//GEN-LAST:event_textFieldFilasMouseMoved

    private void textFieldFilasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldFilasMouseDragged

    }//GEN-LAST:event_textFieldFilasMouseDragged

    private void comboBoxDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDificultadActionPerformed
        String dificultad = comboBoxDificultad.getSelectedItem().toString();

        // Switch que editará todos los textFields dependiendo de que dificultas elija el jugador
        switch(dificultad){
            case "Fácil":
            textFieldFilas.setEditable(false);
            textFieldColumnas.setEditable(false);
            textFieldMinas.setEditable(false);
            textFieldFilas.setText("10");
            textFieldColumnas.setText("10");
            textFieldMinas.setText("10");
            textFieldCasillas.setText("100");
            break;

            case "Media":
            textFieldFilas.setEditable(false);
            textFieldColumnas.setEditable(false);
            textFieldMinas.setEditable(false);
            textFieldFilas.setText("15");
            textFieldColumnas.setText("15");
            textFieldMinas.setText("40");
            textFieldCasillas.setText("225");
            break;

            case "Difícil":
            textFieldFilas.setEditable(false);
            textFieldColumnas.setEditable(false);
            textFieldMinas.setEditable(false);
            textFieldFilas.setText("22");
            textFieldColumnas.setText("22");
            textFieldMinas.setText("100");
            textFieldCasillas.setText("484");
            break;

            case "Personalizada":
            textFieldFilas.setEditable(true);
            textFieldColumnas.setEditable(true);
            textFieldMinas.setEditable(true);
            textFieldFilas.setText("");
            textFieldColumnas.setText("");
            textFieldMinas.setText("");
            textFieldCasillas.setText("");
            break;
        }

    }//GEN-LAST:event_comboBoxDificultadActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    public static javax.swing.JComboBox<String> comboBoxDificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldCasillas;
    private javax.swing.JTextField textFieldColumnas;
    private javax.swing.JTextField textFieldFilas;
    private javax.swing.JTextField textFieldMinas;
    // End of variables declaration//GEN-END:variables
}
