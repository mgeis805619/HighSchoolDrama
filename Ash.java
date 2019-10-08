/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highschooldrama;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 805619
 */
public class Ash {
    private int height;
    private int width;
    private int x;
    private int y;
    private Image img;
    private ImageIcon ii;
    
     public Ash (int cWidth, int cHeight) {
        x = 350;
        y = 200;
        this.height = 1080;
        this.width = 643;
        this. ii = new ImageIcon(getClass().getResource("Ash.png"));
        this.img = ii.getImage();
     }
     
     public void draw(Graphics g) {
           g.drawImage(img, this.x, this.y, this.width, this.height, null);
       }
}

