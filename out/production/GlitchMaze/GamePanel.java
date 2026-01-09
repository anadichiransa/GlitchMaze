import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.util.Random;

public class GamePanel extends JPanel {

    //Screen settings
    final int tileSize = 32;
    final int maxScreenCol = 20;
    final int maxScreenRow = 15;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    int[][] map = new int[maxScreenCol][maxScreenRow];

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

        generateMap();
    }

    public void generateMap() {
        for (int x = 0; x < maxScreenCol; x++) {
            for (int y = 0; y < maxScreenRow; y++) {
                map[x][y] = 0;
            }
        }

        //Drunken Wall Algorithm
        Random rand = new Random();
        int x = maxScreenCol / 2;
        int y = maxScreenRow / 2;
        int steps = 200;

        for (int k = 0; k < steps; k++) {
            map[x][y] = 1; //Curving the path

            int random_dir = rand.nextInt(4);

            if (random_dir == 0 && y > 1) {
                y--;
            } else if (random_dir == 1 && y < maxScreenRow -1) {
                y++;
            } else if (random_dir == 2 && x > 1) {
                x--;
            } else if (random_dir == 3 && x<maxScreenCol - 1) {
                x++;
            }

        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int x=0; x<maxScreenCol; x++){
            for(int y=0;y<maxScreenRow;y++){

                if (map[x][y] == 0 ){
                    g.setColor(Color.DARK_GRAY);
                }

                else{
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x*tileSize, y*tileSize, tileSize,tileSize);

                g.setColor(new Color(50,50,50));
                g.drawRect(x*tileSize,y*tileSize,tileSize,tileSize);
            }
        }
    }

}






