import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;

public class GamePanel extends JPanel{

    //Screen settings
    final int tileSize = 32;
    final int maxScreenCol = 20;
    final int maxScreenRow = 15;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;


    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        for (int i =0 ; i< maxScreenCol; i++){
            for(int j=0; j<maxScreenRow; j++){
                g.drawRect(i*tileSize, j*tileSize,tileSize,tileSize);
            }
        }
    }



}