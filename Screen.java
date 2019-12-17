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
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author 805619
 */
public class Screen extends JPanel {
    private Timer timer;
    private Player player;
    private Classroom setting;
    private MainMenu mainMenu;
    private StartButton startButton;
    private ExitButton exitButton;
    private MainMenuButton menuButton;
    private SaveButton saveButton;
    private Bar bar;
    private Ash ash;
    private Ann ann;
    private int width = 1440;
    private int height = 900;
    public String message = "text";
    public String who = "name";
    public int t = 0;
    public int d = 0;
    public int c = 0;
    public int s = 0;
    public boolean main = true;
    public boolean option1 = true;
    

    
    public Screen() {
        super();
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
        player = new Player(800, 600);
        setting = new Classroom(width, height);
        mainMenu = new MainMenu(width, height);
        startButton = new StartButton (800,600);
        exitButton = new ExitButton (800,600);
        menuButton = new MainMenuButton (800,600);
        saveButton = new SaveButton (800,600);
        bar = new Bar(800,600);
        ash = new Ash(800, 600);
        ann = new Ann (800,600);
        player = new Player(800,600);
        populateStringArray();
        populateStringArray2();
    }
    
    
    
    public String[]name = new String[20];
        public void populateStringArray2() {
            name[0] = "Ash";
            name[1] = "Ash";
            name[2] = "Ash";
            name[3] = "Ash";
            name[4] = "Ash";
            name[5] = "Player";
            name[6] = "Player";
            name[7] = "Ann";
            name[8] = "Player";
            name[9] = "Player";
            name[10] = "Ann";
            name[11] = "Player";
            name[12] = "Ann";
                    
        }
    
    @Override
    public void paintComponent(Graphics g) {
        if(main == true) {
            mainMenu.draw(g);
            startButton.draw(g);
            exitButton.draw(g);
        }
        else {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        setting.draw(g);
        if (who == "Ash") {
            ash.draw(g);
        }
        else if (who == "Player") {
            player.draw(g);
        }
        else if (who == "Ann") {
            ann.draw(g);
        }
        saveButton.draw(g);
        menuButton.draw(g);
        bar.draw(g);
        g.setColor(Color.WHITE);
        g.drawString(message, bar.x+30, bar.y+85);
        g.drawString(who, bar.x+25, bar.y+33);
        }
      
        
    }
    
     public String[]text = new String[20];
        public void populateStringArray() {
            text[0] = "";
            text[1] = "Hey I'm Ash!";//ash///class
            text[2] = "What's your name?";//ash//class
            text[3] = "Hey player! Welcome to the game!";//ash//class
            text[4] = "I'll let you in on what's going on. You've been dating this girl Ann since freshman year of" //ash//class
                    + " high school. Something big is about to happen. Good luck!";//ash//class
            text[5] = "Ugh what was that? That was a weird dream.";//player//house
            text[6] = "*You check your phone and see that you have a text from Ann*";//player
            text[7] = "Good morning. How are you?";//ann
            text[8] = "*You continue to text her*";//player
            text[9] = "Hey! I just woke up. I had the weirdest dream last night.";//player
            text[10] = "What?!?! It's almost 1. You need to go to bed earlier. A weird dream? What was it about?";//ann
            text[11] = "Hah. Maybe I just play too many video games. But yeah I was talking to Ash as if I was in some game. He talked about you";//player
            text[12] = "KJKJKJ. You really are playing too many video games if you're dreaming of being in one";//ann///house
            text[13] = "Hey! It's not my fault I have nothing else to do other than work and school.";//player//house
            text[14] = "Uh oh. I forgot about school. I got to go get ready, you should too.";//ann//house
            text[15] = "Alright! See ya!";//player//house
            text[16] = "*You get ready and go to school*";//player//house
            text[17] = "";
            
                    
        }
    
           
    public void next() {
        if (main == false) {
        t  += 1;
        message = text[t];
        c += 1;
        who = name[c];
        }
        else {
            
        }
    }
    
    public void decesion() {
        if (option1 == true) {
            d += 1;
        }
        else if (option1 == false) {
           d -= 1; 
        }
    }
    
    public void start() {
        main = false;
    }
    
    public void close() {
       System.exit(0);
    }
    
    
   
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            next();System.out.println("Spacebar pressed"); 
        }  
    }

    void mousePressed(MouseEvent e) {
        if (main == true) {
            if ( e.getX() > 50 && e.getX() < 350 && e.getY() > 250 && e.getY() < 550) {
            main = false;
            String pathname = "H:/Variables.txt";
            File file = new File(pathname);
            Scanner input = null;
            try
            {
            input = new Scanner(file);
            }
            catch(FileNotFoundException ex)
{
            System.out.println("*** Cannot open " + pathname + " ***");
            System.exit(1); 
            }

            }
            else if ( e.getX() > 30 && e.getX() < 330 && e.getY() > 500 && e.getY() < 850) {
            System.exit(0);    
            }
            else {
                
            }
        }
        else if (main == false) {
            if ( e.getX() > 1240 && e.getX() < 1440 && e.getY() > 0 && e.getY() < 200) {
            main = true;
            }
            else if ( e.getX() > 1240 && e.getX() < 1440 && e.getY() > 150 && e.getY() < 350) {
              String pathname = "output.txt";
              File file = new File(pathname);
              PrintWriter output = null;
       
              try {
                  output = new PrintWriter(file);
              }
              catch (FileNotFoundException ex)   
              {
              System.out.println("*** Cannot create " + pathname + " ***");
              System.exit(1); //quit the program
              }
              output.println("Metric measures:");
              output.printf("%2d kb = %5.3f lbs\n", 1, 2.2046226);
              output.close();
              
            }
            else {
                
            }
        }
    }
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }
}
