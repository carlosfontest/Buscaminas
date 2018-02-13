package clases;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;


public class FrameJuego extends javax.swing.JFrame {
    
    // Matriz de tipo Casilla, la cual tendrá todas las casillas que estarán en el GridLayout
    static Casilla casillas[][];
    static boolean casillasMinadas[][];

    public FrameJuego() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("../images/mine.png")).getImage());
        
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Fácil")){
            this.setLocation(520, 200);
        }   
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Media")){
            this.setLocation(490, 160);
        }  
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Difícil")){
            this.setLocation(440, 60);
        }  
        if(FrameDificultad.comboBoxDificultad.getSelectedItem().toString().equals("Personalizada")){
            this.setLocationRelativeTo(null);
        }  
        this.setResizable(false);
        
        this.setSize(( FrameDificultad.filas * 25) + 20, ( FrameDificultad.columnas * 25) + 115);
        
        // Llamamos al método crear tablero
        crearTablero();
        
    }   
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Life_Cycle_30px.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setLayout(new java.awt.GridLayout(FrameDificultad.filas, FrameDificultad.filas));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CopyrightPeque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Cuando se pulsa el botón de arriba es porque se quiere empezar una partida nueva, asi que
        // limpiamos la interfaz, el gridLayout y lo volvemos a crear.
        getToolkit().beep();
        CasillaVacia.reiniciarDestapadas();
        
        // Limpia los valores de la matriz de booleanos a todos falsos
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                casillasMinadas[i][j] = false;
            }
        }
        
        jPanel4.removeAll();  // Remueve todas las casillas del buscaminas
        jPanel4.updateUI();   // Actualiza la interfáz gráfica
        crearTablero();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Método que va a crear a tablero, inicializará la matriz de casillas y las añadirá en el Grid Layout, este
    // método se llama al pisar el botón de reiniciar la partida y al iniciar el constructor
    private void crearTablero(){
        // Creación de la matriz de Casillas
        this.casillas = new Casilla[FrameDificultad.filas][FrameDificultad.columnas];

        // Declaración de la matriz y llamado al método que devolverá la matriz con las minas
        this.casillasMinadas = new boolean[FrameDificultad.filas][FrameDificultad.columnas];
        
        
        //------------------------------------------------------------------------
        // Este código es para cuando se termina la partida y se llama a un nuevo FrameJuego, se genere 
        // correctamente el tablero
        // Limpia los valores de la matriz de booleanos a todos falsos
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                casillasMinadas[i][j] = false;
            }
        }
        
        jPanel4.removeAll();  // Remueve todas las casillas del buscaminas
        jPanel4.updateUI();   // Actualiza la interfáz gráfica
        //------------------------------------------------------------------------
        
        
        this.casillasMinadas = determinarCasillasMinadas(FrameDificultad.minas);
        
        
        /*---------------------------------------------------------
        // Esto sirve para ver la matriz de minas en la consola
        
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.filas; j++) {
                System.out.print("\t" + casillasMinadas[i][j]);
            }
            System.out.println("");
        }
        
        ---------------------------------------------------------*/
        
        // Ahora vamos a crear la casillas dependiendo de las posiciones de las minas en la matriz
        // booleana
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                
                if(casillasMinadas[i][j] == true){
                    casillas[i][j] = new CasillaMinada(i, j, this);
                    jPanel4.add(casillas[i][j]);
                }else{
                    casillas[i][j] = new CasillaVacia(i, j, this);
                    jPanel4.add(casillas[i][j]);
                }
            }
        }
        
    }

    
    // Este método me va a devolver una matriz donde estarán las minas
    private boolean[][] determinarCasillasMinadas(int minas){
        
        int cont = 0;                  // Contador que ayudará a con las posiciones de los números generados
        boolean auxMatriz[][] = new boolean[FrameDificultad.filas][FrameDificultad.columnas];
        boolean bandera = false;
        int numeroRandom;
        // Llenando de casillas vacias
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {
                auxMatriz[i][j] = false;
            }
        }            
         
        while(cont < minas){
            
            for (int i = 0; i < FrameDificultad.filas; i++) {
                /* Verifica que la bandera en el segundo for fue activada, si fue así, quiere decir que ya
                   se generaron las minas necesarias, entonces se sale también de este for, para finalmente 
                   salir del bucle while
                */
                if(bandera == true){
                        break;}             
                for (int j = 0; j < FrameDificultad.filas; j++) {
                    /* Se generará un numero random entre el 1 y el 100, cuando sea 33 se generará una mina
                       en esa posición.
                    */
                    Random random = new Random();
                    numeroRandom = random.nextInt(100)+1;
                   
                    // Verifica si ya fueron generadas las minas necesarias, si se generaron se cambia la
                    // bandera a true y se hace un break, el cual sale del segundo for.
                    if(cont == minas){
                        bandera = true;
                        break;
                    }else if( auxMatriz[i][j] == false ){ // Verifica que en la posicion [i][j] la amtriz sea vacía
                        if(numeroRandom == 33){
                            auxMatriz[i][j] = true;  // Se genera una mina
                            cont++;  // Aumento en el contador de minas
                        }                       
                    }
                }
            } 
        }
              
        return auxMatriz;
         
        /* Lo que se hace en las lineas de código anteriores es basicamente recrear el buscaminas, con las casillas
         minadas o no, pero con una matriz de booleanos, en donde si es true, es minada y si es false está vacia.
         Ahora se va a comparar la matriz de Casillas con la matriz de booleanos y se creará una casilla minada 
         cuando en la de booleanos sea True */
    }
    
     public void perder(){
        this.dispose();
    }
     
     
     public void destaparMinadas(int x, int y){
         for (int i = 0; i < FrameDificultad.filas; i++) {
             for (int j = 0; j < FrameDificultad.columnas; j++) {
                 
                 
                  if(i == x && j == y){
                      casillas[i][j].setIcon(new ImageIcon(getClass().getResource("../images/minadoActual.png")));
                      casillas[i][j].setBackground(new Color(240, 240, 240));
                  }
                  else if(casillas[i][j] instanceof CasillaMinada){
                      casillas[i][j].setIcon(new ImageIcon(getClass().getResource("../images/minado.png")));
                      casillas[i][j].setBackground(new Color(240, 240, 240));
                  }  
             }
         }  
     }
     
     public void flagearMinadas(){
         
        for (int i = 0; i < FrameDificultad.filas; i++) {
            for (int j = 0; j < FrameDificultad.columnas; j++) {

                if(casillas[i][j] instanceof CasillaMinada){
                    casillas[i][j].setIcon(new ImageIcon(getClass().getResource("../images/flag.png")));
                }  
            }
        }  
         
         
         
     }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}