package clases;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

// Extiende de JButton ya que las casillas serán botones
abstract public class Casilla extends JButton {
    protected int coorX;
    protected int coorY;
    protected int estado;
    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();
    Border blackline = BorderFactory.createLineBorder(Color.white);
    FrameJuego ventana;

    public Casilla(int coorX, int coorY, FrameJuego ventana) {
        this.coorX = coorX;
        this.coorY = coorY;
        this.estado = 0;  // (0, 1, 2, 3) -- (Tapada, Destapada, Bandera, Interrogación)
        this.setBorder(raisedbevel);
        //this.setMaximumSize(new Dimension(25, 18));
        this.ventana = ventana;
        
        this.setBackground(new Color(130, 130, 130));
        this.setFont(new Font("Consolas", 1, 12) );
        
        // Para que verifique el click derecho
        MouseListener mouseListener= new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3){
                    cambiarEstado();
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {}         
            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {}
            @Override
            public void mouseExited(MouseEvent me) {}
            
        };
        this.addMouseListener(mouseListener);
        
        this.addActionListener(new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent e) {
                    destapar();  
            }
        });
    }
    
    abstract public void destapar();
    
    public void cambiarEstado(){
        
        if(estado == 0){
            this.setEstado(2);
            this.setIcon(new ImageIcon(getClass().getResource("../images/flag.png")));
            this.setEnabled(false);
        }else if(this.estado == 2){
            this.setEstado(3);
            this.setIcon(new ImageIcon(getClass().getResource("../images/question.png")));
            this.setEnabled(false);
        }else if(this.estado == 3){
            this.setEstado(0);
            this.setIcon(null);
            this.setEnabled(true);
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
    
   
    
    

