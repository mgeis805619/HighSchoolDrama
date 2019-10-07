/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschooldrama;

import java.awt.Color;
import java.awt.Graphics;
import java.util.TimerTask;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.KeyEvent;


/**
 *
 * @author 805619
 */
public class Screen extends JPanel {
    private Timer timer;
    private Charcters charcters;
    private Background background;
    
    public Screen() {
        super();
        charcters = new Charcters(800, 600);
        background = new Background(900,900);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        background.draw(g);
    }
    
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }
}
