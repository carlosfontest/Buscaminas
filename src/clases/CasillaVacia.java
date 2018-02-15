package clases;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class CasillaVacia extends Casilla {
    private int minasAlrededor;
    static private int destapadas;

    public CasillaVacia(int coorX, int coorY, FrameJuego ventana) {
        super(coorX, coorY, ventana);
        this.setFocusPainted(false);
    }
    

    /* Método que hace return de la cantidad de minas que hay alrededor de cada casilla, es llamado en el 
       FrameJuego*/
    public int calcularMinasAlrededor(){
        int minas = 0;
        int i = this.coorX;
        int j = this.coorY;

        
        // Si está en la primera fila
        if(i == 0){
            // Si esta en la primera columna
            if(j == 0){
                if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){                  minas++;}
                if(FrameJuego.casillas[i+1][j+1] instanceof CasillaMinada){                  minas++;}
                if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){                  minas++;}
                return minas;
            }
            // Si esta en la última columna
            else if(j == (FrameDificultad.columnas-1) ){
                if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){         minas++;}
                if(FrameJuego.casillas[i+1][j-1] instanceof CasillaMinada){         minas++;}
                if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){           minas++;}
                return minas;
            }
            // Si está entre la primera y la última columna  
            else{
                if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){                minas++;}
                if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){                minas++;}
                if(FrameJuego.casillas[i+1][j-1] instanceof CasillaMinada){              minas++;}
                if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){                minas++;}
                if(FrameJuego.casillas[i+1][j+1] instanceof CasillaMinada){              minas++;}
                return minas;
            }  
        }


        // Si está en la última fila
        else if( i == (FrameDificultad.filas-1) ){
                // Si esta en la primera columna
                if(j == 0){
                    if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){             minas++;}
                    if(FrameJuego.casillas[i-1][j+1] instanceof CasillaMinada){           minas++;}
                    if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){             minas++;}
                    return minas;
                }
                //Si esta en la última columna
                else if(j == (FrameDificultad.columnas-1) ){
                    if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){             minas++;}
                    if(FrameJuego.casillas[i-1][j-1] instanceof CasillaMinada){           minas++;}
                    if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){             minas++;}
                    return minas; 
                }
                // Si está entre la primera y la última columna
                else{
                    if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){             minas++;}
                    if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){             minas++;}
                    if(FrameJuego.casillas[i-1][j-1] instanceof CasillaMinada){           minas++;}
                    if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){             minas++;}
                    if(FrameJuego.casillas[i-1][j+1] instanceof CasillaMinada){           minas++;}
                    return minas;    
                }
            }

        
        // Si está en la primera columna excepto en las posiciones esquinísticas
        else if(j == 0   &&  i!=0    &&  i!=(FrameDificultad.filas-1)){
            if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i+1][j+1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i-1][j+1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){                     minas++;}
            return minas;  
        }


        // Si está en la última columna excepto en las posiciones esquinísticas
        else if(j == (FrameDificultad.columnas-1) &&  i!=0    &&  i!=(FrameDificultad.filas-1)){
            if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i+1][j-1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i-1][j-1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){                     minas++;}
            return minas;  
        }


        // Si está en cualquier posición del centro
        else{
            if(FrameJuego.casillas[i-1][j-1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i-1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i-1][j+1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i][j-1] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i][j+1] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i+1][j-1] instanceof CasillaMinada){                   minas++;}
            if(FrameJuego.casillas[i+1][j] instanceof CasillaMinada){                     minas++;}
            if(FrameJuego.casillas[i+1][j+1] instanceof CasillaMinada){                   minas++;}
            return minas;  
        }
    }

    public void setMinasAlrededor(int minasAlrededor) {
        this.minasAlrededor = minasAlrededor;
    }

    @Override
    public void destapar() {
        
        // Se verifica si ya esta destapada, si es así se sale del método
        if(this.estado != 0){
            return;
        }
        
        // Se cambia el color de fondo de la mina destapada y se cambia el estado a 1 (destapada)
        this.setBackground(new Color(240, 240, 240));
        this.estado = 1;
        
        // Escribir el número de minas alrededor
        switch (this.minasAlrededor) {
            case 1:
                this.setText("1");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0,0,225));
                break;
            case 2:
                this.setText("2");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0,128,0));
                break;
            case 3:
                this.setText("3");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(255,0,0));
                break;
            case 4:
                this.setText("4");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0,0,128));
                break;
            case 5:
                this.setText("5");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(128,0,0));
                break;
            case 6:
                this.setText("6");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0,128,128));
                break;
            case 7:
                this.setText("7");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(Color.black);
                break;
            case 8:
                this.setText("8");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(Color.lightGray);
                break;
                
            case 0:
                
                int i = this.coorX;
                int j = this.coorY;
                
                // ------------Se procede a llamar recursivamente al método destapar----------
                
                // Si está en la primera fila
                if(i == 0){
                    // Si esta en la primera columna
                    if(j == 0){
                        FrameJuego.casillas[i][j+1].destapar();
                        FrameJuego.casillas[i+1][j+1].destapar(); 
                        FrameJuego.casillas[i+1][j].destapar();
                    }
                    //Si esta en la última columna
                    else if(j == (FrameDificultad.columnas-1) ){
                        FrameJuego.casillas[i][j-1].destapar();         
                        FrameJuego.casillas[i+1][j-1].destapar();         
                        FrameJuego.casillas[i+1][j].destapar();           
                    }
                    // Si está entre la primera y la última columna  
                    else{
                        FrameJuego.casillas[i][j-1].destapar();                
                        FrameJuego.casillas[i][j+1].destapar();                
                        FrameJuego.casillas[i+1][j-1].destapar();              
                        FrameJuego.casillas[i+1][j].destapar();                
                        FrameJuego.casillas[i+1][j+1].destapar();              
                    }  
                }

                // Si está en la última fila
                else if( i == (FrameDificultad.filas-1) ){
                        // Si esta en la primera columna
                        if(j == 0){
                            FrameJuego.casillas[i-1][j].destapar();             
                            FrameJuego.casillas[i-1][j+1].destapar();           
                            FrameJuego.casillas[i][j+1].destapar();             
                        }
                        //Si esta en la última columna
                        else if(j == (FrameDificultad.columnas-1) ){
                            FrameJuego.casillas[i-1][j].destapar();             
                            FrameJuego.casillas[i-1][j-1].destapar();           
                            FrameJuego.casillas[i][j-1].destapar();             
                        }
                        // Si está entre la primera y la última columna
                        else{
                            FrameJuego.casillas[i][j-1].destapar();             
                            FrameJuego.casillas[i][j+1].destapar();             
                            FrameJuego.casillas[i-1][j-1].destapar();           
                            FrameJuego.casillas[i-1][j].destapar();             
                            FrameJuego.casillas[i-1][j+1].destapar();           
                        }
                    }


                // Si está en la primera columna excepto en las posiciones esquinísticas
                else if(j == 0   &&  i!=0    &&  i!=(FrameDificultad.filas-1)){
                    FrameJuego.casillas[i+1][j].destapar();                     
                    FrameJuego.casillas[i-1][j].destapar();                     
                    FrameJuego.casillas[i+1][j+1].destapar();                   
                    FrameJuego.casillas[i-1][j+1].destapar();                   
                    FrameJuego.casillas[i][j+1].destapar();                     
                }


                // Si está en la última columna excepto en las posiciones esquinísticas
                else if(j == (FrameDificultad.columnas-1) &&  i!=0    &&  i!=(FrameDificultad.filas-1)){
                    FrameJuego.casillas[i+1][j].destapar();                     
                    FrameJuego.casillas[i-1][j].destapar();                     
                    FrameJuego.casillas[i+1][j-1].destapar();                  
                    FrameJuego.casillas[i-1][j-1].destapar();                   
                    FrameJuego.casillas[i][j-1].destapar();                     
                }


                // Si está en cualquier posición del centro
                else{
                    FrameJuego.casillas[i-1][j-1].destapar();                   
                    FrameJuego.casillas[i-1][j].destapar();                     
                    FrameJuego.casillas[i-1][j+1].destapar();                   
                    FrameJuego.casillas[i][j-1].destapar();                     
                    FrameJuego.casillas[i][j+1].destapar();                     
                    FrameJuego.casillas[i+1][j-1].destapar();                   
                    FrameJuego.casillas[i+1][j].destapar();                     
                    FrameJuego.casillas[i+1][j+1].destapar();                   
                }
                break;
                
            default:
                break;
        }
        
        // Se suma 1 al contador de minas destapadas de la partida para saber cuando el jugador ganó
        destapadas++;
            
        /* Se verifica si el jugador ganó, si es así todas las minas pasan a tener la banderita, se reinicia el contador
          de destapadas y se llama al método ganar*/
        if(destapadas == ( ((FrameDificultad.filas) * (FrameDificultad.columnas)) - (FrameDificultad.minas) ) ){           
            this.ventana.flagearMinadas();
            
            destapadas = 0;
            this.ganar();
        }
        
    }
    
    // Lanza en pantalla un JOptionPane para saber que querrá hacer el jugador después de ganar
    private void ganar(){
        reiniciarDestapadas();
        int respuesta = JOptionPane.showConfirmDialog(null, "           ¡¡HAS GANADO!!\nDesea jugar una nueva partida?", "¿Qué desea hacer?", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
        
        if(respuesta == JOptionPane.NO_OPTION){
            System.exit(0);
        }else{
            this.ventana.perder();
            FrameDificultad f = new FrameDificultad();
            f.setVisible(true);
        }
    }
    
    // Reinicia el contador de casillas destapadas
    public static void reiniciarDestapadas(){
        destapadas = 0;
    }
    
}
