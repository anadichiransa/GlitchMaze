import javax.swing.JPanel;
import java.awt.color;
import java.awt.Dimension;
import java.awt.Graphics;

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
}