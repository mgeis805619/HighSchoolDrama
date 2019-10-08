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
public class Chad {
    private int height;
    private int width;
    private int x;
    private int y;
    private Image img;
    private ImageIcon ii;
    
     public Chad (int cWidth, int cHeight) {
        x = 500;
        y = 200;
        this.height = 200;
        this.width = 200;
        this. ii = new ImageIcon(getClass().getResource("707.png"));
        this.img = ii.getImage();
     }
     
     public void draw(Graphics g) {
           g.drawImage(img, this.x, this.y, this.width, this.height, null);
       }
}

