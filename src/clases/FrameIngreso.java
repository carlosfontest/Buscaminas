package clases;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrameIngreso extends javax.swing.JFrame {
    static public String nombre;

    public FrameIngreso() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../images/mine.png")).getImage());
        this.setSize(402, 169);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Buscaminas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        textFieldUser = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldUser.setBackground(new java.awt.Color(64, 64, 64));
        textFieldUser.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        textFieldUser.setText("Usuario...");
        textFieldUser.setBorder(null);
        textFieldUser.setHighlighter(null);
        textFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldUserFocusGained(evt);
            }
        });
        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, 30));

        botonContinuar.setBackground(new java.awt.Color(102, 102, 102));
        botonContinuar.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonContinuar.setFocusPainted(false);
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        botonContinuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonContinuarKeyPressed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 90, 29));

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IngreseUser.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 10));

        jButton1.setBackground(new java.awt.Color(64, 64, 64));
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Copyright.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 403, 226);
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // Verificación de que textField contenga un username
        if(textFieldUser.getText().equals("") == false && textFieldUser.getText().equals("Usuario...") == false){
            nombre = textFieldUser.getText(); 
            
            // Creación del objeto Jugador
            Jugador jugadorActual = new Jugador(nombre);
            
            // Se oculta el FrameIngreso y se crea un objeto de tipo FrameJuego y se hace visible           
            this.dispose();
            FrameDificultad frameDificultad = new FrameDificultad();
            frameDificultad.setVisible(true);
            JOptionPane.showMessageDialog(null, "- Mínimo recomendado: 5x5\n- Máximo recomendado: 25x25");            
        }else{
            // Mensaje de Error en caso de que no haya username
            JOptionPane.showMessageDialog(null, "   Debe ingresar su usuario");
        }
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
    }//GEN-LAST:event_textFieldUserActionPerformed

    private void textFieldUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUserFocusGained
        textFieldUser.setText("");
    }//GEN-LAST:event_textFieldUserFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonContinuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonContinuarKeyPressed
    }//GEN-LAST:event_botonContinuarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
}
