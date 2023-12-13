package assets;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class image extends JPanel {
    
    public String url;

    public image(String url) {
        this.url = url;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        try{
            Graphics2D g2D = (Graphics2D) g;
            InputStream iIS = this.getClass().getResourceAsStream(url);       
            BufferedImage bImg = ImageIO.read(iIS);
            Image imgScaled = bImg.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
            g2D.drawImage(imgScaled, 0, 0, this);
            
        }catch(IOException | IllegalArgumentException ex){
            System.err.println("Imagem não encontrada");
        }  
    }
}
