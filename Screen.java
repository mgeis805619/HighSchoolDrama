/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschooldrama;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyEvent;


/**
 *
 * @author 805619
 */
public class Screen extends JPanel {
    private Timer timer;
    private Player player;
    private Setting setting;
    private Bar bar;
    private Ash ash;
    private Ann ann;
    private int width = 1440;
    private int height = 900;
    public String message = "text";
    public String who = "name";
    public int t = 0;
    public int c = 0;
    public int s = 0;
    
    public Screen() {
        super();
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
        player = new Player(800, 600);
        setting = new Setting(width, height);
        bar = new Bar(800,600);
        ash = new Ash(800, 600);
        ann = new Ann (800,600);
        populateStringArray();
        populateStringArray2();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        setting.draw(g);
        bar.draw(g);
        //ann.draw(g);
        g.setColor(Color.WHITE);
        g.drawString(message, bar.x+30, bar.y+85);
        g.drawString(who, bar.x+25, bar.y+33);
        
        //if (who == "Ash") {
         //   ash.draw(g);
        //}
       // else if (who == "Player") {
           // player.draw(g);
       // }
        //else if (who == "Ann") {
         //   ann.draw(g);
       // }
        
    }
    
     public String[]text = new String[20];
        public void populateStringArray() {
            text[0] = "Hey I'm Ash!";//ash///house
            text[1] = "What's your name?";//ash
            text[2] = "Hey player! Welcome to the game!";//ash
            text[3] = "I'll let you in on what's going on. You've been dating this girl Ann since freshman year of "//ash
                    + "\n high school. Something big is about to happen. Good luck!";//ash
            text[4] = "Ugh what was that? That was a weird dream.";//player
            text[5] = "*You check your phone and see that you have a text from Ann*";//player
            text[6] = "Good morning<3.How are you?";//ann
            text[7] = "*You continue to text her*";//player
            text[8] = "Hey! I just woke up. I had the weirdest dream last night.";//player
            text[9] = "What?!?! It's almost 1. You need to go to bed earlier. A weird dream? What was it about?";//ann
            text[10] = "Hah. Maybe I just play too many video games. But yeah I was talking to Ash as if I was in some game. He talked about you";//player
            text[11] = "KJKJKJ. You really are playing too many video games if you're dreaming of being in one";//ann///house
                    
        }
    
        public String[]name = new String[20];
        public void populateStringArray2() {
            name[0] = "Ash";
            name[1] = "Ash";
            name[2] = "Ash";
            name[3] = "Ash";
            name[4] = "Player";
            name[5] = "Player";
            name[6] = "Ann";
            name[7] = "Player";
            name[8] = "Player";
            name[9] = "Ann";
            name[10] = "Player";
            name[11] = "Ann";
                    
        }
        
    public void next() {
        t += 1;
        message = text[t];
        c += 1;
        who = name[c];
    }
   
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            next();System.out.println("Spacebar pressed"); 
        }  
    }
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }
}
