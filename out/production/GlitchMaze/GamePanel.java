import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.util.Random;

public class GamePanel extends JPanel{

    //Screen settings
    final int tileSize = 32;
    final int maxScreenCol = 20;
    final int maxScreenRow = 15;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    int[][] map = new int[maxScreenCol][maxScreenRow];

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        generateMap();
    }

    public void generateMap(){
        for (int x=0;x<maxScreenCol; x++){
            for (int y =0 ; y<maxScreenRow;y++){
                map[x][y] =0 ;
            }
        }
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


