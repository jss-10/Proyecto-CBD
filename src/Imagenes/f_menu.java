package Imagenes;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Graphics;
/**
 *
 * @author jesus
 */
public class f_menu extends javax.swing.JPanel
{
    public f_menu()
    {
        this.setSize(700,500);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
      Dimension tam = getSize();
      ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("fondo.jpg")).getImage());
      g.drawImage(imagen.getImage(), 0, 0,tam.width,tam.height,null);
      setOpaque(false);
      super.paintComponent(g);
    }
}