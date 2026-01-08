import javax.swing.*;

public class Main {
    public static void main(String[] args){

        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The Glitch Maze");

        window.setSize(800,600);

        window.setLocationRelativeTo(null);//centers the window
        window.setVisible(true);



    }
}
