package leidian;
import java.awt.Container;

import javax.swing.JFrame;

public class planeFrame extends JFrame{

    public planeFrame(){
        setTitle("雷电");
        GamePanel panel = new GamePanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
        pack();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        planeFrame el = new planeFrame();
        el.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        el.setVisible(true);
    }

}
