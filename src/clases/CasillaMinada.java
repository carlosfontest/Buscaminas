package clases;

import javax.swing.JOptionPane;

public class CasillaMinada extends Casilla {

    public CasillaMinada(int coorX, int coorY, FrameJuego ventana) {
        super(coorX, coorY, ventana);
    }

    @Override
    public void destapar(){
        this.estado = 1;
        CasillaVacia.reiniciarDestapadas();
        ventana.destaparMinadas(this.coorX, this.coorY);
        perder();
    }
    
    // Lanza en pantalla un JOptionPane para saber que querrá hacer el jugador después de perder
    public void perder(){                      
        int respuesta = JOptionPane.showConfirmDialog(null, "                ¡Perdiste!\nDesea jugar una nueva partida?", "¿Qué desea hacer?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
        
        if(respuesta == JOptionPane.NO_OPTION){
            System.exit(0);
        }else{
            this.ventana.perder();
            FrameDificultad f = new FrameDificultad();
            f.setVisible(true);
        } 
    }
}
